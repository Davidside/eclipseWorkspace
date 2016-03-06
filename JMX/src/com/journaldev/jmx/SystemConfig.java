package com.journaldev.jmx;

public class SystemConfig implements SystemConfigMBean {
	private int threadCount;
	private String schemaName;
	
	public SystemConfig(int threadCount, String schemaName) {
		super();
		this.threadCount = threadCount;
		this.schemaName = schemaName;
	}

	@Override
	public int getThreadCount() {
		return threadCount;
	}
	
	@Override
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	
	@Override
	public String getSchemaName() {
		return schemaName;
	}
	
	@Override
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	@Override
	public String doConfig() {
		return "No of Threads = " + this.threadCount + " and DB Schema Name = " + this.schemaName;
	}

}
