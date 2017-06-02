package dogfightModel;

import java.awt.Image;

public interface IMobile {
	public Direction getDirection();
	public Direction setDirection();
	public Position getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public void setDogfightMode(DogfightModel dogfightModel);
	public boolean hit();
	public boolean isWeapon();
	
}
