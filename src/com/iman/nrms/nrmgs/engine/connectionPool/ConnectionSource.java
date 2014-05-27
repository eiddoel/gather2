package com.iman.nrms.nrmgs.engine.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;

public class ConnectionSource {

	static Logger log = Logger.getLogger(ConnectionSource.class);
	private static ConnectionSource connectionSource = new ConnectionSource();
	
	private ConnectionSource(){}
	
	public static ConnectionSource getInstance(){
		return connectionSource;
	}
	
	public synchronized Connection getConnection(){
    	Connection connection = null;
    	try {
    		//获取线程池配置信息
    		connection = DriverManager.getConnection("proxool.nrmgsPool");
    		if (connection == null) {
    			log.error("获取无效的数据库连接!!!");
    		}
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("获取数据连接失败!"+e.getMessage());
			e.printStackTrace();
		}
		return null;
    }
}
