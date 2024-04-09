package com.logitech.meetio.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.logitech.meetio.dao.GameDao;
import com.logitech.meetio.extern.ConfigEndPoint;
import com.logitech.meetio.pojo.Game;

@Component
public class GameService {

	@Autowired
	@Qualifier("GameSqlDao")
	private GameDao dao;

	@Autowired
	@Qualifier("ConfigService")
	private ConfigEndPoint config;

	public List<Game> getGames() {
		return dao.getGames();
	}

	public Game getGame(long id) throws IOException {
		Game game = dao.getGame(id);

		game.setConfig(config.getConfig());

		return game;
	}

	public void setGame(Game game) {
		dao.setGame(game);
	}

}
