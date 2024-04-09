package com.logitech.meetio.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Game {

	private long id;

	private String title;

	/**
	 * The image resource id of the image using which the end user can get the image
	 * from the image repository.
	 */
	private String logo;

	private String content;

	private String config;

	/**
	 * @param id
	 * @param title
	 * @param logo
	 */
	public Game(long id, String title, String logo) {
		super();
		this.id = id;
		this.title = title;
		this.logo = logo;
	}

	/**
	 * @param id
	 * @param title
	 * @param logo
	 * @param content
	 */
	public Game(long id, String title, String logo, String content) {
		this(id, title, logo);
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the config
	 */
	public String getConfig() {
		return config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(String config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", logo=" + logo + ", content=" + content + ", config=" + config
				+ "]";
	}

}
