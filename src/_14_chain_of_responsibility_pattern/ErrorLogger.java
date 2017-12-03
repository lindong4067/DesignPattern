package _14_chain_of_responsibility_pattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		super();
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error日志：" + message);
	}

}
