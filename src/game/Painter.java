package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Painter {
	private static int TRIGGER_HEIGHT = 50;
	private static int TRIGGER_WIDTH = 50;
	private static int ROW_1_Y = 80;
	private static int ROW_2_Y = 180;
	private static int ROW_3_Y = 280;
	private static int ROW_4_Y = 380;

	private BufferedImage redTrigger;
	private BufferedImage yellowUpTrigger, yellowDownTrigger, yellowLeftTrigger,
			yellowRightTrigger;
	private BufferedImage greenTrigger;
	private BufferedImage exitButton, backButton;
	private BufferedImage menuBg;
	private BufferedImage golden_1, golden_2, golden_3, golden_4, golden_5, golden_6,
			golden_7, golden_8, golden_9, golden_0, golden_slash;
	private BufferedImage errorsLabel, hitsLabel, noteLabel, scoreLabel;

	private Image background;
	private Color circles;

	public Painter() {
		try {
			menuBg = ImageIO.read(getClass().getResource(
					"/resources/MenuBG.png"));
			redTrigger = ImageIO.read(getClass().getResource(
					"/resources/redtrigger3.png"));
			yellowUpTrigger = ImageIO.read(getClass().getResource(
					"/resources/yellowuptrigger.png"));
			yellowDownTrigger = ImageIO.read(getClass().getResource(
					"/resources/yellowdowntrigger.png"));
			yellowLeftTrigger = ImageIO.read(getClass().getResource(
					"/resources/yellowlefttrigger.png"));
			yellowRightTrigger = ImageIO.read(getClass().getResource(
					"/resources/yellowrighttrigger.png"));
			greenTrigger = ImageIO.read(getClass().getResource(
					"/resources/greentrigger.png"));
			exitButton = ImageIO.read(getClass().getResource(
					"/resources/exitbutton.png"));
			backButton = ImageIO.read(getClass().getResource(
					"/resources/backbutton.png"));

			golden_1 = ImageIO.read(getClass().getResource(
					"/resources/golden_1.png"));
			golden_2 = ImageIO.read(getClass().getResource(
					"/resources/golden_2.png"));
			golden_3 = ImageIO.read(getClass().getResource(
					"/resources/golden_3.png"));
			golden_4 = ImageIO.read(getClass().getResource(
					"/resources/golden_4.png"));
			golden_5 = ImageIO.read(getClass().getResource(
					"/resources/golden_5.png"));
			golden_6 = ImageIO.read(getClass().getResource(
					"/resources/golden_6.png"));
			golden_7 = ImageIO.read(getClass().getResource(
					"/resources/golden_7.png"));
			golden_8 = ImageIO.read(getClass().getResource(
					"/resources/golden_8.png"));
			golden_9 = ImageIO.read(getClass().getResource(
					"/resources/golden_9.png"));
			golden_0 = ImageIO.read(getClass().getResource(
					"/resources/golden_0.png"));
			golden_slash = ImageIO.read(getClass().getResource(
					"/resources/golden_slash.png"));

			errorsLabel = ImageIO.read(getClass().getResource(
					"/resources/errors.png"));
			noteLabel = ImageIO.read(getClass().getResource(
					"/resources/note.png"));
			hitsLabel = ImageIO.read(getClass().getResource(
					"/resources/hits.png"));
			scoreLabel = ImageIO.read(getClass().getResource(
					"/resources/score.png"));
		} catch (Exception e) {
			System.out.println("Error reading image file(s).");
		}
		resetDigits();
	}

	public void setStyle(int num) {
		try {
			if (num == 1) { // EO3_S1
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_S1_BG.png"));
			} else if (num == 2) { // EO3_B1
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B1_BG.png"));
			} else if (num == 3) { // EO3_B6
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B6_BG.png"));
			} else if (num == 4) { // EO3_S2
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_S2_BG.png"));
			} else if (num == 5) { // EO3_S3
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_S3_BG.png"));
			} else if (num == 6) { // EO3_S5
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_S5_BG.png"));
			} else if (num == 7) { // EO3_S6
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_S6_BG.png"));
			} else if (num == 8) { // EO3_B2
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B2_BG.png"));
			} else if (num == 9) { // EO3_B3
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B3_BG.png"));
			} else if (num == 10) { // EO3_B4
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B4_BG.png"));
			} else if (num == 11) { // EO3_B5
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B5_BG.png"));
			} else if (num == 12) { // EO3_B7
				circles = new Color(255, 255, 255);
				background = ImageIO.read(getClass().getResource(
						"/resources/EO3_B7_BG.png"));
			} else if(num == 13){
				background = ImageIO.read(getClass().getResource("/resources/EO3_B8_BG.png"));
				circles = new Color(255, 255, 255);
			} else if(num == 14){
				background = ImageIO.read(getClass().getResource("/resources/EO3_S4_BG.png"));
				circles = new Color(255, 255, 255);
			} else if(num == 15){
				background = ImageIO.read(getClass().getResource("/resources/EO3_T1_BG.png"));
				circles = new Color(255, 255, 255);
			} else if(num == 16){
				background = ImageIO.read(getClass().getResource("/resources/EO3_T2_BG.png"));
				circles = new Color(255, 255, 255);
			}
			resetDigits();
		} catch (Exception e) {
			System.out.println("Error loading images");
		}
	}

	public Image getNumberFromInt(int i) {
		switch (i) {
		case 1:
			return golden_1;
		case 2:
			return golden_2;
		case 3:
			return golden_3;
		case 4:
			return golden_4;
		case 5:
			return golden_5;
		case 6:
			return golden_6;
		case 7:
			return golden_7;
		case 8:
			return golden_8;
		case 9:
			return golden_9;
		case 0:
			return golden_0;
		}
		return golden_0;
	}

	public boolean isFirst = true;

	private Image[] scoreDigits = new Image[5];
	private Image[] maxScoreDigits = new Image[5];
	private Image[] hitsDigits = new Image[4];
	private Image[] notesDigits = new Image[4];
	private Image[] maxNotesDigits = new Image[4];

	public void resetDigits() {
		for (int i = 0; i < 4; i++) {
			scoreDigits[i] = golden_0;
			maxScoreDigits[i] = golden_0;
			hitsDigits[i] = golden_0;
			notesDigits[i] = golden_0;
			maxNotesDigits[i] = golden_0;
		}
		scoreDigits[4] = golden_0;
		maxScoreDigits[4] = golden_0;
	}

	public void setDigits(int hits, int score, int maxScore, int notes,
			int maxNotes) {
		for (int i = 3; i > -1; i--) {
			hitsDigits[i] = getNumberFromInt(hits % 10);
			notesDigits[i] = getNumberFromInt(notes % 10);
			maxNotesDigits[i] = getNumberFromInt(maxNotes % 10);
			hits /= 10;
			notes /= 10;
			maxNotes /= 10;
		}

		for (int i = 4; i > -1; i--) {
			scoreDigits[i] = getNumberFromInt(score % 10);
			maxScoreDigits[i] = getNumberFromInt(maxScore % 10);
			score /= 10;
			maxScore /= 10;
		}
	}

	public void paint(Graphics g, ArrayList<Trigger> triggers) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(noteLabel, 30, 450, null);
		g.drawImage(notesDigits[0], 180, 450, null);
		g.drawImage(notesDigits[1], 205, 450, null);
		g.drawImage(notesDigits[2], 230, 450, null);

		g.drawImage(notesDigits[3], 255, 450, null);
		g.drawImage(golden_slash, 280, 450, null);
		g.drawImage(maxNotesDigits[0], 300, 450, null);
		g.drawImage(maxNotesDigits[1], 325, 450, null);
		g.drawImage(maxNotesDigits[2], 350, 450, null);

		g.drawImage(maxNotesDigits[3], 375, 450, null);

		g.drawImage(scoreLabel, 30, 8, null);
		g.drawImage(scoreDigits[0], 180, 10, null);
		g.drawImage(scoreDigits[1], 205, 10, null);
		g.drawImage(scoreDigits[2], 230, 10, null);

		g.drawImage(scoreDigits[3], 255, 10, null);
		g.drawImage(scoreDigits[4], 280, 10, null);

		g.drawImage(golden_slash, 305, 10, null);
		g.drawImage(maxScoreDigits[0], 325, 10, null);
		g.drawImage(maxScoreDigits[1], 350, 10, null);
		g.drawImage(maxScoreDigits[2], 375, 10, null);
		g.drawImage(maxScoreDigits[3], 400, 10, null);
		g.drawImage(maxScoreDigits[4], 425, 10, null);

		g.drawImage(hitsLabel, 600, 8, null);
		g.drawImage(hitsDigits[0], 710, 10, null);
		g.drawImage(hitsDigits[1], 735, 10, null);
		g.drawImage(hitsDigits[2], 760, 10, null);
		g.drawImage(hitsDigits[3], 785, 10, null);

		int y = -1;
		Trigger t;
		for (int i = 0; i < triggers.size(); i++) {
			t = triggers.get(i);

			if (t.getRow() == 1)
				y = ROW_1_Y;
			else if (t.getRow() == 2)
				y = ROW_2_Y;
			else if (t.getRow() == 3)
				y = ROW_3_Y;
			else
				y = ROW_4_Y;

			if (!t.getStatus()) {
				if (t.getType() == 1)
					g.drawImage(redTrigger, t.getX(), y, null);
				else if (t.getType() == 2)
					g.drawImage(yellowUpTrigger, t.getX(), y, null);
				else if (t.getType() == 3)
					g.drawImage(yellowDownTrigger, t.getX(), y, null);
				else if (t.getType() == 4)
					g.drawImage(yellowLeftTrigger, t.getX(), y, null);
				else if (t.getType() == 5)
					g.drawImage(yellowRightTrigger, t.getX(), y, null);
				else if (t.getType() == 6 || t.getType() == 7) {
					g.drawImage(greenTrigger, t.getX(), y, null);
				}
			}
		}
		g.setColor(circles);
		g.drawOval(50, ROW_1_Y - 10, TRIGGER_HEIGHT + 20, TRIGGER_WIDTH + 20);
		g.drawOval(50, ROW_2_Y - 10, TRIGGER_HEIGHT + 20, TRIGGER_WIDTH + 20);
		g.drawOval(50, ROW_3_Y - 10, TRIGGER_HEIGHT + 20, TRIGGER_WIDTH + 20);
		g.drawOval(50, ROW_4_Y - 10, TRIGGER_HEIGHT + 20, TRIGGER_WIDTH + 20);

		g.drawImage(backButton, 890, 7, null);

	}

	public void paintMenu(Graphics g) {
		g.drawImage(menuBg, 0, 0, null);
		g.setColor(Color.GREEN);
		g.fillRect(30, 20, 200, 100);
		g.fillRect(30, 140, 200, 100);
		g.fillRect(30, 260, 200, 100);
		g.fillRect(30, 380, 200, 100);
		g.fillRect(280, 20, 200, 100);
		g.fillRect(780, 380, 200, 100);
		
		g.fillRect(780, 140, 200, 100);
		g.fillRect(780, 260, 200, 100);
		g.setColor(Color.RED);
		g.fillRect(280, 140, 200, 100);
		g.fillRect(280, 260, 200, 100);
		g.fillRect(280, 380, 200, 100);
		g.fillRect(520, 20, 200, 100);
		g.fillRect(520, 140, 200, 100);
		g.fillRect(520, 260, 200, 100);
		g.fillRect(780, 20, 200, 100);
		g.setColor(Color.BLUE);
		g.fillRect(520, 380, 200, 100);
	}
}
