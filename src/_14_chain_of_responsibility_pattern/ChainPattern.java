package _14_chain_of_responsibility_pattern;

public class ChainPattern {
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.BEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "这是一个INFO级别日志……");
		loggerChain.logMessage(AbstractLogger.BEBUG, "这是一个DEBUG级别日志……");
		loggerChain.logMessage(AbstractLogger.ERROR, "这是一个ERROR级别日志……");
	}
}
