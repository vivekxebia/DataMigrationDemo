package com.beachbody.data.transfer.util;

import com.beachbody.data.transfer.dao.Info;


public class JDBCInfo implements Info {

	private String sql;
	private String dataBaseName;
	private Object[] params;

	public JDBCInfo(String sql, Object[] params) {
		this.sql = sql;
		this.params = params;
	}

	public JDBCInfo(String sql, String databaseName) {
		this.sql=sql;
		this.setDataBaseName(databaseName);
	}

	public String getSQL() {
		return sql;
	}

	public void setParams(Object[] params) {
	}

	public Object[] getParams() {
		return params;
	}

	public String getDataBaseName() {
		return dataBaseName;
	}

	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

}