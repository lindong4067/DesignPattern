package _14_chain_of_responsibility_pattern;

public class ConsoleLogger extends AbstractLogger {
	
	
	
	public ConsoleLogger(int level) {
		super();
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Console日志：" + message);
	}

}
