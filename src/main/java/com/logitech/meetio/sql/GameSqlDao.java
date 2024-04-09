package com.logitech.meetio.sql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.logitech.meetio.dao.GameDao;
import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.query.GameQuery;

@Component("GameSqlDao")
public class GameSqlDao implements GameDao {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Game> getGames() {
		return this.jdbc.query(GameQuery.GET_GAMES,
				(rs, rn) -> new Game(rs.getLong(1), rs.getString(2), rs.getString(3)));
	}

	@Override
	public Game getGame(long id) {
		return this.jdbc.queryForObject(String.format(GameQuery.GET_GAME, id),
				(rs, rn) -> new Game(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4)));
	}

	@Override
	public void setGame(Game game) {
		// Method to configure a game from some admin console.
	}

}
