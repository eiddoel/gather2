package com.iman.nrms.nrmgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;

public class GatherContainer {
	static Logger logger = Logger.getLogger(GatherContainer.class);
	
	private static GatherContainer gatherContainer = new GatherContainer();
	//保证只存在一个实例，只能由getInstance()取得，不能new出来。
	private GatherContainer(){}
	//取得实例的接口
	public static GatherContainer getInstance(){
		
		return gatherContainer;
		
	}
	
	public void run(){
/*		try {
			
			InputStreamReader is = new InputStreamReader(new FileInputStream("gather.cfg.properties"));
			Properties porperties=new Properties();
			porperties.load(is);
			String isTest = porperties.getProperty("isTest");
			logger.debug(isTest);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}*/
		File f = new File("");
		logger.debug(""+f.getAbsolutePath());
		logger.debug(""+System.getProperty("user.dir"));
	}

}
