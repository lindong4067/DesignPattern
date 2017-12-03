package _06_adapter_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("播放VLC文件：" + fileName);
	}

	@Override
	public void playMp4(String fileName) {

	}

}
