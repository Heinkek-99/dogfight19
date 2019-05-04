package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	private IGraphicsBuilder graphicBuilder;
	
	private Observable observable;
	
	public GamePanel() {
		// TODO Auto-generated constructor stub
	}
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		
	}

	
	public void paintComponent(Graphics graphic) {
		
	}

	public void update(Observable observable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable observable, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
