package game;

import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

import songs.SongScore;
import songs.Songs;

public class GameThread extends Thread {
	private GamePlayer player;
	private GameFrame gameFrame;
	private SongScore currentSongScore;
	private int time;
	private Clip currentSong;

	public GameThread(GamePlayer pl, GameFrame gf, SongScore song) {
		this.player = pl;
		this.gameFrame = gf;
		currentSongScore = song;
		time = 0;
		isDone = false;
		Songs.resetSongs();
		player.clearTriggers();
	}

	public int getTime() {
		return time;
	}

	public void playMusic(SongScore song) {
		currentSongScore = song;
		URL filePath = song.getFilePath();
		try {
			AudioInputStream stream;
			AudioFormat format;
			DataLine.Info info;
			Clip clip;

			stream = AudioSystem.getAudioInputStream(filePath);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			currentSong = clip;
			currentSong.start();
			do {
			} while (clip.getMicrosecondPosition() < 1);
		} catch (Exception e) {
			System.out.println("Error loading sound file.");
		}
	}

	public SongScore getSong() {
		return currentSongScore;
	}

	private boolean isDone;

	public boolean isDone() {
		return isDone;
	}

	@Override
	public void run() {
		try {
			sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		playMusic(currentSongScore);
		while (!isDone) {
			gameFrame.repaintDigits();
			gameFrame.repaintPanel();
			long startTime = System.nanoTime();
			long currentTime = System.nanoTime();
			while (currentTime - startTime < 10_000_000)
				currentTime = System.nanoTime();
			time += 10;
			gameFrame.debugTimer += 10;
			currentSongScore.update(time, player);
			player.updateTriggers();
			if (time > currentSongScore.getLength()) {
				currentSong.stop();
				isDone = true;
			}
		}
		currentSong.stop();
		currentSong.flush();
	}

	public void end() {
		isDone = true;
	}

}
