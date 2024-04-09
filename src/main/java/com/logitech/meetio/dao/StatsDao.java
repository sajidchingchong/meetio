package com.logitech.meetio.dao;

import java.util.List;

import com.logitech.meetio.pojo.Game;
import com.logitech.meetio.pojo.Stats;

public interface StatsDao {

	/**
	 * Method to publish stats in the stats repository.
	 * 
	 * @param stats
	 */
	public void setStats(Stats stats);

	/**
	 * Method to return top 10 most played games.
	 * 
	 * @return List of Games
	 */
	public List<Game> getPopularGames();

}
