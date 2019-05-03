package jpu2016.dogfight.model;

public class Plane extends Mobile{

	private final static int SPEED = 2;
	private final int WIDTH = 100;
	private final int HEIGHT = 30;
	private final String IMAGE = "plane";
	private int player;
	
	public Plane(Direction direction, Dimension dimension, String image) {
		super(direction, null, dimension, SPEED, image);
	}
		
	public boolean isPlayer() {
		return false;
		
	}
	
	public boolean hit() {
		return false;
		
	}
	
}
