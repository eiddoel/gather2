package com.iman.nrms.nrmgs.connector.jdbc;

import java.sql.Connection;

import com.iman.nrms.nrmgs.engine.connectionPool.ConnectionSource;

/**
 * 
 * @author Eiddoel
 *
 */

public class DataSourceHelper {
	//从连接池得到连接
	public Connection getConnection(){
		Connection con = ConnectionSource.getInstance().getConnection();
		return con;
	}
	
	

}
