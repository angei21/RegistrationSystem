package com.rs.utils;

import java.util.Random;

/**
 * 各种id生成策略
 * <p>
 * Title: IDUtils
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @date 2020年
 * @version 1.0
 */
public class IDUtils {

	/**
	 * 图片名生成
	 */
	public static String genImageName() {
		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		// long millis = System.nanoTime();
		// 加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		// 如果不足三位前面补0
		String str = millis + String.format("%03d", end3);

		return str;
	}


	/**
	 * 作品id生成
	 */
	public static long getWorkId() {
		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		String temp = "" + millis;
		temp = temp.substring(10);
		millis = Long.valueOf(temp);
		// 加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		// 如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		String result = "20" + id;
		return Long.valueOf(result);
	}

	/**
	 * 团队id生成
	 */
	public static long genTeamId() {
		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		String temp = "" + millis;
		temp = temp.substring(9);
		millis = Long.valueOf(temp);
		// 加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		// 如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		String result = "2020" + id;
		return Long.valueOf(result);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			System.out.println(genTeamId());
	}
}
