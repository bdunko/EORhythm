package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

import songs.SongScore;

@SuppressWarnings("serial")
public class GameFrame extends JFrame implements KeyListener {
	private GamePlayer player;
	private Painter painter;
	private GamePanel panel;
	private SongScore currentSong;
	private Main main;
	private int hits, errors, note;
	private int perfectHits, greatHits, goodHits, missHits;

	private static int PERFECT_MIN_HIT_X_VALUE = 30;
	private static int PERFECT_MAX_HIT_X_VALUE = 100;

	private static int GREAT_MIN_HIT_X_VALUE = 15;
	private static int GREAT_MAX_HIT_X_VALUE = 115;

	private static int GOOD_MIN_HIT_X_VALUE = 0;
	private static int GOOD_MAX_HIT_X_VALUE = 130;

	public final boolean debugMode = false;

	public int debugTimer;
	
	public GameFrame(GamePlayer player, SongScore currentSong) {
		super();
		setTitle("Theatrhythm EO");
		setPreferredSize(new Dimension(1000, 540));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addKeyListener(this);
		painter = new Painter();
		this.player = player;
		panel = new GamePanel(painter, player);
		panel.setParentGameFrame(this);
		add(panel);
		panel.repaint();
		
		this.currentSong = currentSong;

		debugTimer = 0;

		hits = 0;
		errors = 0;
	}
	
	public void setPanelThread(GameThread t){
		panel.setThread(t);
	}
	
	public void reset(){
		hits = 0;
		errors = 0;
		note = 0;
		perfectHits = 0;
		greatHits = 0;
		goodHits = 0;
		missHits = 0;
		debugTimer = 0;
		debugNoteCount = 0;
	}

	public void setCurrentSong(SongScore currentSong) {
		this.currentSong = currentSong;
		painter.setStyle(currentSong.getStyle());
	}

	private boolean isHoldTrigger = false;

	public void processKeyPress(int type) {
		int hits = player.checkHits(GOOD_MIN_HIT_X_VALUE, GOOD_MAX_HIT_X_VALUE,
				6);
		if (hits > 0) {
			isHoldTrigger = true;
			this.hits += hits;
			this.perfectHits += hits;
			this.note = this.note + hits;
		} else {

			hits = player.checkHits(PERFECT_MIN_HIT_X_VALUE,
					PERFECT_MAX_HIT_X_VALUE, type);
			if (hits == 0) {
				hits = player.checkHits(GREAT_MIN_HIT_X_VALUE,
						GREAT_MAX_HIT_X_VALUE, type);
				if (hits == 0) {
					hits = player.checkHits(GOOD_MIN_HIT_X_VALUE,
							GOOD_MAX_HIT_X_VALUE, type);
					if (hits == 0) {
						this.errors++;
					} else {
						this.hits += hits;
						this.goodHits += hits;
					}
				} else {
					this.hits += hits;
					this.greatHits += hits;
				}
			} else {
				this.hits += hits;
				this.perfectHits += hits;
			}
			int missedHits = player.checkMissedNotes();
			this.missHits += missedHits;
			this.note = this.note + missedHits + hits;
		}
	}

	// 1 = tap
	// 2 = up
	// 3 = down
	// 4 = left
	// 5 = right
	// 6 = touch_start
	// 7 = touch_end

	private final Random r = new Random();
	private int debugNoteCount = 0;
	
	@Override
	public void keyPressed(KeyEvent key) {
		if (!isHoldTrigger) {
			if (key.getKeyCode() == KeyEvent.VK_UP) {
				processKeyPress(2);
			} else if (key.getKeyCode() == KeyEvent.VK_DOWN) {
				processKeyPress(3);
			} else if (key.getKeyCode() == KeyEvent.VK_LEFT) {
				processKeyPress(4);
			} else if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
				processKeyPress(5);
			} else {
				processKeyPress(1);
			}

			if (!debugMode) {
				System.out.println("Note #: " + note + "/"
						+ currentSong.getNumNotes() + "     Hits: " + this.hits
						+ "  " + perfectHits + "/" + greatHits + "/" + goodHits
						+ "     Errors: " + this.errors + "/" + this.missHits
						+ "    Score: " + calculateScore() + "/"
						+ calculateScore(currentSong));
				painter.setDigits(this.hits, calculateScore(), calculateScore(currentSong), note, currentSong.getNumNotes());
			} else {
				int trigType = 1;
				if (key.getKeyCode() == KeyEvent.VK_UP) {
					trigType = 2;
				} else if (key.getKeyCode() == KeyEvent.VK_DOWN) {
					trigType = 3;
				} else if (key.getKeyCode() == KeyEvent.VK_LEFT) {
					trigType = 4;
				} else if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
					trigType = 5;
				}
				
				debugNoteCount++;
				System.out.println("score.add(new Trigger(" + trigType
						+ ", " + (Math.abs(r.nextInt()%4)+1) + ", " + (debugTimer-1145) + ")); //" + debugNoteCount);
			}
		}

	}

	public int calculateScore() {
		return (int)((perfectHits * 3 + greatHits * 2 + goodHits * 1) - errors * 0.5);
	}
	
	public int getHits(){
		return hits;
	}
	
	public int getMaxNotes(){
		return currentSong.getNumNotes();
	}
	
	public int getNote(){
		return note;
	}

	public int calculateScore(SongScore song) {
		return currentSong.getNumNotes() * 3;
	}
	
	public int getMaxScore(){
		return currentSong.getNumNotes();
	}
	
	public void setParentMain(Main parent){
		this.main = parent;
	}
	
	public void playSong(SongScore song){
		main.playSong(song);
	}

	@Override
	public void keyReleased(KeyEvent key) {
		if (isHoldTrigger == true) {
			processKeyPress(7);
			isHoldTrigger = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent key) {

	}
	
	public void repaintPanel(){
		panel.repaint();
	}

	public void repaintDigits(){
		painter.setDigits(this.hits, calculateScore(), calculateScore(currentSong), note, currentSong.getNumNotes());
	}
	
}