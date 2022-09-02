package game;

import java.util.ArrayList;

import songs.SongScore;

public class GamePlayer {
	private ArrayList<Trigger> triggers = new ArrayList<Trigger>();

	public GamePlayer() { }

	public void loadScore(SongScore song) {
		this.triggers = song.getSong();
	}

	public void addTrigger(Trigger t) {
		triggers.add(t);
	}

	public void addTrigger(int type, int row) {
		triggers.add(new Trigger(type, row));
	}

	public void addTrigger(int type, int row, int x) {
		triggers.add(new Trigger(type, row, x));
	}

	public void clearTriggers() {
		triggers.clear();
	}

	public ArrayList<Trigger> getTriggers() {
		return triggers;
	}

	public void updateTriggers() {
		for (int i = 0; i < triggers.size(); i++) {
			triggers.get(i).update();
		}
	}

	public int checkHits(int min, int max, int type) {
		Trigger t;
		int hits = 0;
		for (int i = 0; i < triggers.size(); i++) {
			t = triggers.get(i);
			if (t.getType() == type && !t.getStatus()) {
				if (t.getX() > min && t.getX() < max) {
					hits++;
					t.setStatus(true);
				}
			}
		}
		return hits;
	}

	public int checkMissedNotes() {
		Trigger t;
		int misses = 0;
		for (int i = 0; i < triggers.size(); i++) {
			t = triggers.get(i);
			if (t.getX() < 0 && !t.getStatus()) {
				misses++;
				t.setStatus(true);
			}
		}
		return misses;
	}
}
