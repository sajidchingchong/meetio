package com.logitech.meetio.query;

final public class GameQuery {

	final public static String GET_GAMES = "SELECT id, title, logo FROM game";

	/*
	 * Ideally the title and content should be stored in a separate No-SQL DB
	 * accessible via another microservice catering the locale of the user.
	 */
	final public static String GET_GAME = "SELECT g.id, g.title, g.logo, c.content FROM game g, content c WHERE g.id = %d AND g.id = c.gameId";

}
