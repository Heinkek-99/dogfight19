package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;

public class DogfightController {

	public static int TIME_SLEEP = 30;
	
	public static int getTIME_SLEEP() {
		return TIME_SLEEP;
	}
	public static void setTIME_SLEEP(int tIME_SLEEP) {
		TIME_SLEEP = tIME_SLEEP;
	}
		private IDogfightModel  dogfightmodel;
		
	public  void DogfightContoller(IDogfightModel dogfightModel) {
	
		this.setDogfightmodel(dogfightmodel);
	}
	
	//@Override
	
	
	public void orderPerform (UserOrder userOrder) {
		
	};
	
	private void gameLoop() {
		
	}
	public void play() {
		
	};
	public void setViewSystem(IViewSystem viewSystem) {
		
	}; 
	public void launchMissile (int player) {
		
	};
	
	public IDogfightModel getDogfightmodel() {
		return dogfightmodel;
	}
	
	public void setDogfightmodel(IDogfightModel dogfightmodel) {
		this.dogfightmodel = dogfightmodel;
	}
}
