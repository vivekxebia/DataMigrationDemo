package com.beachbody.data.transfer.config;

public class AppConfig {

	private static Config config = new Config("app");

	public static String getProperty(String key) {
		return config.getProperty(key);
	}

	public static double getPropertyAsDouble(String key) {
		return config.getPropertyAsDouble(key);
	}

}