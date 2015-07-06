package com.beachbody.data.transfer.config;

public class JDBCConfig {

	public static final String DRIVER = "DRIVER";

	public static final String URL = "URL";

	public static final String USER = "USER";
	public static final String PASSWORD = "PASSWORD";

	private static Config config = new Config("jdbc");

	public static String getProperty(String key) {
		return config.getProperty(key);
	}

	public static double getPropertyAsDouble(String key) {
		return config.getPropertyAsDouble(key);
	}

}