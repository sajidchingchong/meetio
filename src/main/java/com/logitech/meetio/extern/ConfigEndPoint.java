package com.logitech.meetio.extern;

import java.io.IOException;

public interface ConfigEndPoint {

	/**
	 * Method to talk to some service to get game configuration json as a string.
	 * 
	 * @return Game configuration as a string
	 * @throws IOException
	 */
	public String getConfig() throws IOException;

}
