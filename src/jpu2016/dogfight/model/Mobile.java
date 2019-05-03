package jpu2016.dogfight.model;

import java.awt.*;

public class Mobile implements IMobile {

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
		
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea Area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}	
	
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}	
	
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}	
	
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}	
	
	public Color getColor() {
		return null;
		
	}
	
	public IDogfightModel getIDogfightModel() {
		return null;
		
	}
	
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}
