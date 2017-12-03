package _14_chain_of_responsibility_pattern;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		super();
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File日志：" + message);
	}

}
