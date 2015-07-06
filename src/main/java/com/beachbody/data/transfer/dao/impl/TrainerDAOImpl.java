package com.beachbody.data.transfer.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.beachbody.data.transfer.dao.AbstractDAO;
import com.beachbody.data.transfer.dao.TrainerDAO;
import com.beachbody.data.transfer.to.TrainerTO;
import com.beachbody.data.transfer.util.JDBCInfo;


public class TrainerDAOImpl extends AbstractDAO implements TrainerDAO{

	 public TrainerDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public TrainerTO readByDataBaseName(String databaseName) {

			TrainerTO trainerTO = null;
			String sql = new StringBuilder("SELECT trainer_id, trainer_name , trainer_class, trainer_programme, trainer_country, trainer_state, trainer_city FROM Trainer").toString();
			Object[] data= readByDB(new JDBCInfo(sql, databaseName)) ;
			if (data != null) {

				trainerTO = new TrainerTO();
				//trainerTO.setTrainer_id((int)data[0]);
				trainerTO.setTrainerName((String) data[1]);
				trainerTO.setTrainerClass((String) data[2]);
				trainerTO.setTrainingProgramme((String) data[3]);
				trainerTO.setTrainingCountry((String) data[4]);
				trainerTO.setTrainingState((String) data[5]);
				trainerTO.setTrainingCity((String) data[6]);

			}
			
			return trainerTO;	
	}
	
	public List<TrainerTO> readListByDataBaseName(String databaseName) {

		List<TrainerTO> trainerTO = new ArrayList<TrainerTO>();
		String sql = new StringBuilder("SELECT trainer_id, trainer_name , trainer_class, trainer_programme, trainer_country, trainer_state, trainer_city FROM Trainer").toString();
		List<Object[]> data= readListByDB(new JDBCInfo(sql, databaseName)) ;
		//List<TrainerTO> trainerDTOList=(List<TrainerTO>)data;
		if (data != null) {
			int i=0;
			while(i!= data.size()){
			
//TODO Cast Database Object to TrainerTO
				
				
			}
		}
		return trainerTO;	
	}
 public static void main(String[] args) {
	new TrainerDAOImpl().readListByDataBaseName("test");
}
}
