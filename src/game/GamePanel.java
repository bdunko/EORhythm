package game;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import songs.Songs;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements MouseListener {
	private Painter painter;
	private GamePlayer player;
	private GameThread thread;
	private GameFrame frame;
	private boolean menuMode = true;

	public GamePanel(Painter p, GamePlayer play) {
		this.painter = p;
		this.player = play;
		this.addMouseListener(this);
		repaint();
		setVisible(true);
	}

	private boolean menuPaint = true;

	public void setParentGameFrame(GameFrame parent) {
		frame = parent;
	}

	public void paintMenuRequest() {
		menuPaint = true;
		menuMode = true;
	}

	public void cancelPaintMenuRequest() {
		menuPaint = false;
		menuMode = false;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (menuPaint) {
			painter.paintMenu(g);
		} else {
			painter.paint(g, player.getTriggers());
		}
	}

	public void setThread(GameThread thread) {
		this.thread = thread;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		repaint();
		System.out.println("press@ " + e.getX() + ", " + e.getY());
		if (!menuMode) {
			if (e.getX() > 850 && e.getX() < 980 && e.getY() > 15
					&& e.getY() < 60) {
				paintMenuRequest();
				thread.end();
			}
		} else {
			if (e.getX() > 30 && e.getX() < 230 && e.getY() > 20
					&& e.getY() < 120) {
				frame.playSong(Songs.EO3_S1_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 30 && e.getX() < 230 && e.getY() > 140
					&& e.getY() < 240) {
				frame.playSong(Songs.EO3_S2_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 30 && e.getX() < 230 && e.getY() > 260
					&& e.getY() < 360) {
				frame.playSong(Songs.EO3_S3_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 30 && e.getX() < 230 && e.getY() > 380
					&& e.getY() < 480) {
				frame.playSong(Songs.EO3_S5_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 280 && e.getX() < 480 && e.getY() > 20
					&& e.getY() < 120) {
				frame.playSong(Songs.EO3_S6_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 280 && e.getX() < 480 && e.getY() > 140
					&& e.getY() < 240) {
				frame.playSong(Songs.EO3_B1_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 280 && e.getX() < 480 && e.getY() > 260
					&& e.getY() < 360) {
				frame.playSong(Songs.EO3_B2_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 280 && e.getX() < 480 && e.getY() > 380
					&& e.getY() < 480) {
				frame.playSong(Songs.EO3_B3_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 530 && e.getX() < 730 && e.getY() > 20
					&& e.getY() < 120) {
				frame.playSong(Songs.EO3_B4_Score);
				cancelPaintMenuRequest();
			}
			else if (e.getX() > 530 && e.getX() < 730 && e.getY() > 140
					&& e.getY() < 240) {
				frame.playSong(Songs.EO3_B5_Score);
				cancelPaintMenuRequest();
			}else if (e.getX() > 530 && e.getX() < 730 && e.getY() > 260
					&& e.getY() < 360) {
				frame.playSong(Songs.EO3_B7_Score);
				cancelPaintMenuRequest();
			}else if (e.getX() > 530 && e.getX() < 730 && e.getY() > 380
					&& e.getY() < 480) {
				frame.playSong(Songs.EO3_B6_Score);
				cancelPaintMenuRequest();
			}
			
			
			else if (e.getX() > 780 && e.getX() < 980 && e.getY() > 140
					&& e.getY() < 240) {
				frame.playSong(Songs.EO3_S4_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 780 && e.getX() < 980 && e.getY() > 260
					&& e.getY() < 360) {
				frame.playSong(Songs.EO3_T1_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 780 && e.getX() < 980 && e.getY() > 380
					&& e.getY() < 480) {
				frame.playSong(Songs.EO3_T2_Score);
				cancelPaintMenuRequest();
			} else if (e.getX() > 780 && e.getX() < 980 && e.getY() > 20
					&& e.getY() < 120) {
				frame.playSong(Songs.EO3_B8_Score);
				cancelPaintMenuRequest();
			} 
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
