package com.rs.utils;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义单点登录系统的响应结构
 */
public class RsResult {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态(如：正常返回200)
	private Integer status;

	// 响应消息(如：OK)
	private String msg;

	// 响应中的数据
	private Object data;

	public static RsResult build(Integer status, String msg, Object data) {
		return new RsResult(status, msg, data);
	}

	public static RsResult ok(Object data) {
		return new RsResult(data);
	}

	public static RsResult ok() {
		return new RsResult(null);
	}

	public RsResult() {

	}

	public static RsResult build(Integer status, String msg) {
		return new RsResult(status, msg, null);
	}

	public RsResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public RsResult(Object data) {
		this.status = 200;// 正常
		this.msg = "OK";
		this.data = data;
	}

	// public Boolean isOK() {
	// return this.status == 200;
	// }

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 将json结果集转化为RsResult对象
	 * 
	 * @Param jsonData json数据
	 * @Param clazz RsResult中的object类型
	 * @return
	 */
	public static RsResult formatToPojo(String jsonData, Class<?> clazz) {
		try {
			if (clazz == null) {
				return MAPPER.readValue(jsonData, RsResult.class);
			}
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (clazz != null) {
				if (data.isObject()) {
					obj = MAPPER.readValue(data.traverse(), clazz);
				} else if (data.isTextual()) {
					obj = MAPPER.readValue(data.asText(), clazz);
				}
			}
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 没有object对象的转化
	 * 
	 * @Param json
	 * @return
	 */
	public static RsResult format(String json) {
		try {
			return MAPPER.readValue(json, RsResult.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Object是集合转化
	 * 
	 * @Param jsonData json数据
	 * @Param clazz 集合中的类型
	 * @return
	 */
	public static RsResult formatToList(String jsonData, Class<?> clazz) {
		try {
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (data.isArray() && data.size() > 0) {
				obj = MAPPER.readValue(data.traverse(),
						MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
			}
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

}
