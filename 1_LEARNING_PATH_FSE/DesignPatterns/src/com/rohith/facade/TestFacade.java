package com.rohith.facade;

public class TestFacade {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacade scheduleServerFacade = new ScheduleServerFacade(scheduleServer);
		scheduleServerFacade.startServer();
		System.out.println("Started working .........///");
		System.out.println("After the work done");
		scheduleServerFacade.stopServer();
	}
}
