package com.logitech.meetio.dao;

import java.util.List;

import com.logitech.meetio.pojo.Game;

public interface GameDao {

	/**
	 * Method to return all available games. Pagination and localization should be
	 * implemented for actual implementation.
	 * 
	 * @return List of Games
	 */
	public List<Game> getGames();

	/**
	 * Method to return a particular game by id.
	 * 
	 * @param id
	 * @return Game
	 */
	public Game getGame(long id);

	/**
	 * Method to add a new game in the repository.
	 * 
	 * @param game
	 */
	public void setGame(Game game);

}
