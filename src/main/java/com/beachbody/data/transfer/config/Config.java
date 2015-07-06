package com.beachbody.data.transfer.config;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Config {

	private Properties prop;
	private final static Logger logger = LoggerFactory.getLogger(Config.class);

	public Config(String name) {
		try {
			loadConfig(name);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String getProperty(String key) {
		if (prop.containsKey(key))
			return prop.get(key).toString();
		else {
			String message = "No property with key: "+ key + " found in Properties File";
			logger.error(message);
			throw new RuntimeException(message);
		}
			
	}

	public double getPropertyAsDouble(String key) {
		return Double.parseDouble(getProperty(key));
	}

	private void loadConfig(String name) throws IOException {
		prop = new Properties();
		String className=new StringBuilder().append("com.beachbody.data.transfer.config.").append(name.toUpperCase()).append("Config").toString();
		try {
			prop.load(Class.forName(className).getClassLoader().getResourceAsStream(name + "-config.properties"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}