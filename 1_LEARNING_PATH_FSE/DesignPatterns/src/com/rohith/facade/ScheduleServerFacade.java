package com.rohith.facade;

/*
 * We create a facade class which will wrap a server object. This class will provide simple interfaces or methods for the client. 
 * The interfaces will be calling complex methdos and the client is not necessary to know about those this.
 * So Facade patterns generally hides the complexity of interfaces and create other interfaces for the client to use the system.
 * Here let us think we have a class ScheduleServer that implements many complex methdos to start and stop the server.
 */
public class ScheduleServerFacade {
	private final ScheduleServer scheduleServer;
	
	public ScheduleServerFacade(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}
	
	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readySystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
	}
	
	public void stopServer() {
		scheduleServer.releaseProcess();
		scheduServer.destroy();
		scheduleServer.destroySystemObjects();
		scheduleServer.destroyContext();
		scheduleServer.shutDown();
	}
}
