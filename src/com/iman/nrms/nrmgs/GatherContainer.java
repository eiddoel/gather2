package com.iman.nrms.nrmgs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class GatherContainer {
	private static GatherContainer gatherContainer = new GatherContainer();
	//保证只存在一个实例，只能由getInstance()取得，不能new出来。
	private GatherContainer(){}
	//取得实例的接口
	public static GatherContainer getInstance(){
		
		return gatherContainer;
		
	}
	
	public void run(){
		try {
			InputStreamReader is = new InputStreamReader(new FileInputStream("config/gather.cfg.properties"));
			Properties porperties=new Properties();
			porperties.load(is);
			porperties.getProperty("isTest");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}

}
