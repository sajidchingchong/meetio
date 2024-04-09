package com.logitech.meetio.sql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.logitech.meetio.dao.StatsDao;
import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.pojo.Stats;
import com.logitech.meetio.query.StatsQuery;

@Component("StatsSqlDao")
public class StatsSqlDao implements StatsDao {

	@Autowired
	private JdbcTemplate jdbc;

	public void setStats(Stats stats) {
		jdbc.execute(String.format(StatsQuery.SET_STATS, System.currentTimeMillis(), stats.getAnswers(),
				stats.getLifelines(), stats.getGameId()));
	}

	public List<Game> getPopularGames() {
		return this.jdbc.query(StatsQuery.GET_POPULAR_GAMES,
				(rs, rn) -> new Game(rs.getLong(1), rs.getString(2), rs.getString(3)));
	}

}
