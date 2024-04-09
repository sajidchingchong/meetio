package com.logitech.meetio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.logitech.meetio.dao.StatsDao;
import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.pojo.Stats;

@Component
public class StatsService {

	@Autowired
	@Qualifier("StatsSqlDao")
	private StatsDao dao;

	public void setStats(Stats stats) {
		dao.setStats(stats);
	}

	public List<Game> getPopularGames() {
		return dao.getPopularGames();
	}

}
