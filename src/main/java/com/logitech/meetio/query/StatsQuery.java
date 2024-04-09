package com.logitech.meetio.query;

final public class StatsQuery {

	final public static String SET_STATS = "INSERT INTO stats (timestamp, answers, lifelines, gameId) VALUES (%d, %d, %d, %d)";

	final public static String GET_POPULAR_GAMES = "SELECT s.gameId, g.title, g.logo, COUNT(*) "
			+ "FROM stats s, game g WHERE s.gameId = g.id GROUP BY s.gameId ORDER BY COUNT(*) DESC LIMIT 10";

}
