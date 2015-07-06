package com.beachbody.data.transfer.dao;

import java.util.List;

import com.beachbody.data.transfer.to.TrainerTO;

public interface TrainerDAO {
	TrainerTO readByDataBaseName(String databaseName);
	List<TrainerTO> readListByDataBaseName(String databaseName);
}
