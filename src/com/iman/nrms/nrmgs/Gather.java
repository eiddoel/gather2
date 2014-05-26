package com.iman.nrms.nrmgs;

import org.apache.log4j.Logger;

public class Gather {
	static Logger logger = Logger.getLogger(Gather.class);

	public static void main(String[] args) {
		
		//启动采集任务
		GatherContainer.getInstance().run();
	}

}
