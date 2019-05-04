package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.util.Observable;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {
	
	private IEventPerformer eventPerformer;

	public GameFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}}
