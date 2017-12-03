package _06_adapter_pattern;

public class AdapterPattern {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "最炫民族风.mp3");
		audioPlayer.play("vlc", "狗狗的快乐生活.vlc");
		audioPlayer.play("mp4", "健身操.mp4");
		audioPlayer.play("avi", "搞笑视频.avi");
	}

}
