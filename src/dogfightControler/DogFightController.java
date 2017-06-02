package dogfightControler;

import dogfightModel.DogfightModel;
import dogfightModel.IMobile;
import dogfightView.IViewSystem;

public class DogFightController {

	
	private static int TIME_SLEEP = 30;
	private void lauchMissile(int player) {
	}
	private void gameLoop(){
		
	}
	public DogFightController(DogfightModel IDogfightModel) {
		// TODO Auto-generated constructor stub
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		// TODO Auto-generated method stub
		
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}

	public static int getTIME_SLEEP() {
		return TIME_SLEEP;
	}

	public static void setTIME_SLEEP(int TIME_SLEEP) {
		DogFightController.TIME_SLEEP = TIME_SLEEP;
	}
	
	public void orderPerform(UserOrder userOrder) {
		
	}
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() /
		weapon.getWidth()))
		 && ((weapon.getPosition().getX() / weapon.getWidth()) <=
		((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
		 if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
		/ weapon.getHeight()))
		 && ((weapon.getPosition().getY() / weapon.getHeight()) <=
		((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
		 return true;
		 }
		 }
		return false;
		} 
}
