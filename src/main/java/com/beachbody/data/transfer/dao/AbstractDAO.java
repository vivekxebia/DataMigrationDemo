package com.beachbody.data.transfer.dao;

import java.util.List;

import com.beachbody.data.transfer.util.JDBCInfo;
import com.beachbody.data.transfer.util.JDBCUtil;

public class AbstractDAO implements DAO<JDBCInfo> {
	
	private static DAO<JDBCInfo> delegate = new JDBCUtil();
	private DAO<JDBCInfo> getDelegate() {
		return delegate;
	}
	//@Override
	public Object[] read(JDBCInfo daoInfo) {
		return getDelegate().read(daoInfo);
	}
	public Object[] readByDB(JDBCInfo daoInfo) {
		return getDelegate().readByDB(daoInfo);
	}
	public List<Object[]> readListByDB(JDBCInfo daoInfo) {
		return getDelegate().readListByDB(daoInfo);
	}
}
