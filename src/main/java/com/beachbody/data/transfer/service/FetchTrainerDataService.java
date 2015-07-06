package com.beachbody.data.transfer.service;

import org.slf4j.LoggerFactory;

import com.beachbody.data.transfer.dao.impl.TrainerDAOImpl;
import com.beachbody.data.transfer.to.TrainerTO;

public class FetchTrainerDataService {
	org.slf4j.Logger logger= LoggerFactory.getLogger(FetchTrainerDataService.class);
	TrainerDAOImpl dao= new TrainerDAOImpl();
	public void readData(String databaseName) {
			TrainerTO trainerTO=dao.readByDataBaseName(databaseName);
			if(trainerTO==null){
				logger.error("Trainer Does Not Exist In Database:"+databaseName);
				//return null;
			}
			else{System.out.println("Trainer Database Values");
			System.out.println("Name: "+trainerTO.getTrainerName());
			System.out.println("Class: "+trainerTO.getTrainerClass());
			System.out.println("Programme: "+trainerTO.getTrainingProgramme());
			System.out.println("Country: "+trainerTO.getTrainingCountry());
			System.out.println("State: "+trainerTO.getTrainingState());
			System.out.println("City: "+trainerTO.getTrainingCity());
				}
	}
}
