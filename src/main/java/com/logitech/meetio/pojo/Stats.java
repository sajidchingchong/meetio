package com.logitech.meetio.pojo;

import jakarta.validation.constraints.NotNull;

public class Stats {

	@NotNull(message = "answers is required")
	private Integer answers;

	@NotNull(message = "lifelines is required")
	private Integer lifelines;

	private long gameId;

	/**
	 * @return the answers
	 */
	public int getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(int answers) {
		this.answers = answers;
	}

	/**
	 * @return the lifelines
	 */
	public int getLifelines() {
		return lifelines;
	}

	/**
	 * @param lifelines the lifelines to set
	 */
	public void setLifelines(int lifelines) {
		this.lifelines = lifelines;
	}

	/**
	 * @return the gameId
	 */
	public long getGameId() {
		return gameId;
	}

	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	@Override
	public String toString() {
		return "Stats [answers=" + answers + ", lifelines=" + lifelines + ", gameId=" + gameId + "]";
	}

}
