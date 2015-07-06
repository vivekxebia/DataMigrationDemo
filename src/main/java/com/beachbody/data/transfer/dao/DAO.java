package com.beachbody.data.transfer.dao;

import java.util.List;

import com.beachbody.data.transfer.util.JDBCInfo;


public interface DAO<T extends Info> {

	Object[] readByDB(T daoInfo);

	Object[] read(JDBCInfo daoInfo);

	List<Object[]> readListByDB(JDBCInfo daoInfo);

	//List<Object[]> readAll(T daoInfo);

}