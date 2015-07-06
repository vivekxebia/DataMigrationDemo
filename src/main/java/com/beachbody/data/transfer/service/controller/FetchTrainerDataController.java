package com.beachbody.data.transfer.service.controller;

import org.slf4j.LoggerFactory;

import com.beachbody.data.transfer.service.FetchTrainerDataService;

public class FetchTrainerDataController {

	FetchTrainerDataService fetchTrainerDataService=new FetchTrainerDataService();
	org.slf4j.Logger logger = LoggerFactory.getLogger(FetchTrainerDataController.class);
	
	public void getData(String databaseName){
		logger.debug("Data Fetching Request Received For Database: "+databaseName);
		try {
			fetchTrainerDataService.readData(databaseName);
		} catch (Exception e) {
			logger.debug(e.toString());
		}
	}
}
