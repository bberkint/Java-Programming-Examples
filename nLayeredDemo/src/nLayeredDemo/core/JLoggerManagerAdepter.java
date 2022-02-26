package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdepter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}

}
