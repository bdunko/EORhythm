package game;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import songs.SongScore;

public class Main extends JApplet implements KeyListener {
	private GameFrame game;
	private GamePlayer play;
	private GameThread thread;
	private SongScore currentSong;

	@Override
	public void init() {
		super.init();
		addKeyListener(this);
		play = new GamePlayer();
		game = new GameFrame(play, null);
		game.setParentMain(this);
		// playSong(Songs.EO3_S1_Score);
		game.repaintPanel();
		game.setPanelThread(thread);

		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					Container contentPane = game.getContentPane();
					setContentPane(contentPane);
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		game.repaintPanel();
		
		setFocusable(true);
		requestFocusInWindow();
		

	}

	public void playSong(SongScore song) {
		currentSong = song;
		game.setCurrentSong(currentSong);
		thread = new GameThread(play, game, currentSong);
		System.out.println("new thread?");
		thread.start();
		game.setPanelThread(thread);
		game.reset();
	}

	public void keyPressed(KeyEvent e) {
		game.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		game.keyReleased(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		game.keyTyped(e);
	}
}
