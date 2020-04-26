package com.rs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.mapper.TteamMapper;
import com.rs.pojo.Tteam;
import com.rs.pojo.TteamExample;
import com.rs.pojo.showTeams;
import com.rs.service.tteamService;
import com.rs.utils.IDUtils;
import com.rs.utils.pageBean;

@Service
public class tteamServiceImpl implements tteamService {

	@Autowired
	private TteamMapper teammapper;

	// 添加新团队
	public void addTeam(Tteam team) {
		team.setTeamid(IDUtils.genTeamId());
		teammapper.insert(team);
	}

	// 根据团队Id查找团队
	public Tteam selectTeam(long teamid) {
		Tteam result = teammapper.selectByPrimaryKey(teamid);
		return result;
	}

	// 查看所有团队(对显示方式进行整改)
	public void selectallTeam(pageBean<showTeams> pagebean) {
		TteamExample t = new TteamExample();
		List<Tteam> isnullist = teammapper.selectByExample(t);
		if(isnullist!=null){
			// 获取总页数
			TteamExample tteamExample = new TteamExample();
			int totalCount = teammapper.countByExample(tteamExample);
			pagebean.setTotalCount(totalCount);
			int totalPage = pagebean.getTotalPage();// 总页数
			int currentPage = pagebean.getCurrentPage();
			int pageCount = pagebean.getPageCount();
			if (currentPage < 1) {
				currentPage = 1;
				pagebean.setCurrentPage(currentPage);
			}
			if (currentPage > totalPage) {
				currentPage = totalPage;
				pagebean.setCurrentPage(currentPage);
			}
			int index = (currentPage - 1) * pageCount;
			List<Tteam> list = teammapper.selectThroughPage(index, pageCount);
			if (list != null) {
				// 创建结果对象
				List<showTeams> resultList = new ArrayList<showTeams>();
				for (Tteam sinteam : list) {
					int count = 1;
					if (!StringUtils.isBlank(sinteam.getOnename())) {
						count++;
					}
					if (!StringUtils.isBlank(sinteam.getTwoname())) {
						count++;
					}
					if (!StringUtils.isBlank(sinteam.getThreename())) {
						count++;
					}
					if (!StringUtils.isBlank(sinteam.getFourname())) {
						count++;
					}
					showTeams s = new showTeams();
					s.setTeamId(sinteam.getTeamid());
					s.setHeadname(sinteam.getHeadname());
					s.setCount(count);
					resultList.add(s);
				}
				pagebean.setList(resultList);
			}else{//最初没有一个团队的时候
				pagebean.setCurrentPage(0);
				pagebean.setTotalCount(0);
			}

		}
	}

	// 根据团队组长的学号查找团队
	public Tteam selectTeamBySno(long sno) {
		return teammapper.selectBySno(sno);
	}

	// 查看所有团队
	public List<Tteam> selectallTeam() {
		TteamExample tteamExample = new TteamExample();
		return teammapper.selectByExample(tteamExample);

	}

}
