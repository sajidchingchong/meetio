package com.logitech.meetio.extern;

import java.io.IOException;
import java.nio.file.Files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component("ConfigService")
public class ConfigService implements ConfigEndPoint {

	Logger logger = LoggerFactory.getLogger(ConfigService.class);

	public String getConfig() throws IOException {
		// We are loading the configuration from a file as per current implementation.
		String config = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:config.json").toPath()));

		logger.debug(config);

		return config;
	}

}
