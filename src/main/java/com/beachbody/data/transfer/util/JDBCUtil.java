package com.beachbody.data.transfer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beachbody.data.transfer.config.JDBCConfig;
import com.beachbody.data.transfer.dao.DAO;



public class JDBCUtil implements DAO<JDBCInfo> {
	
	private static final Logger logger = LoggerFactory.getLogger(JDBCUtil.class);

	static {
		try {
			Class.forName(JDBCConfig.getProperty(JDBCConfig.DRIVER));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection getConnection(String dataBaseName) {
		try {
			Connection connection = DriverManager.getConnection(JDBCConfig.getProperty(JDBCConfig.URL)+dataBaseName,
					JDBCConfig.getProperty(JDBCConfig.USER), JDBCConfig.getProperty(JDBCConfig.PASSWORD));
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private List<Object[]> executeQueryFromDB(String sql, String dataBaseName) {

		List<Object[]> dataList = new ArrayList<Object[]>();
		List<Object> data = null;

		Connection conn = getConnection(dataBaseName);

		try {

			PreparedStatement preStmt = prepareStmt(conn, sql);
			logger.debug("Executing: {}", sql);
			logger.debug("Parameters: {}", dataBaseName);
			ResultSet rs = preStmt.executeQuery();
			while (rs.next()) {

				data = new ArrayList<Object>();
				int count = rs.getMetaData().getColumnCount();

				for (int i = 1; i <= count; i++) {
					data.add(rs.getObject(i));
				}

				dataList.add(data.toArray());
			}

			rs.close();
			preStmt.close();

			return dataList;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {

			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);

			}

		}

	}

	private PreparedStatement prepareStmt(Connection conn, String sql) throws SQLException {
		PreparedStatement preStmt = (PreparedStatement) conn.prepareStatement(sql);

		return preStmt;
	}
	public Object[] readByDB(JDBCInfo daoInfo) {

		List<Object[]> list = executeQueryFromDB(daoInfo.getSQL(), daoInfo.getDataBaseName());
		if (list.isEmpty()) {
			return null;
		}

		return list.get(0);
	}
	
	public List<Object[]> readListByDB(JDBCInfo daoInfo) {

		List<Object[]> list = executeQueryFromDB(daoInfo.getSQL(), daoInfo.getDataBaseName());
		if (list.isEmpty()) {
			return null;
		}
		return list;
	}
	
	public Object[] read(JDBCInfo daoInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}