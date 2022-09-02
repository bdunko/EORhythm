package songs;

import game.GamePlayer;
import game.Trigger;

import java.net.URL;
import java.util.ArrayList;

public abstract class SongScore {
	protected ArrayList<Trigger> score;
	protected int highscore;
	protected int currentNote;
	protected URL filePath;
	protected int songLength;
	protected int style;

	public SongScore(URL filePath, int songLength, int style) {
		score = new ArrayList<Trigger>();
		currentNote = 0;
		this.filePath = filePath;
		this.songLength = songLength;
		this.style = style;
	}
	
	public int getStyle(){
		return style;
	}

	public ArrayList<Trigger> getSong() {
		return score;
	}

	public URL getFilePath() {
		return filePath;
	}

	public int getLength() {
		return songLength;
	}

	public int getNumNotes() {
		return score.size();
	}

	public void update(int time, GamePlayer player) {
		Trigger t;
		for (int i = currentNote; i < score.size(); i++) {
			t = score.get(i);
			if (t.getTimeToCreate() < time && !t.isCreated()) {
				player.addTrigger(t);
				currentNote++;
				t.setCreated(true);
			}
		}
	}
}
