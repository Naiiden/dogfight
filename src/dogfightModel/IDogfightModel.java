package dogfightModel;

import java.util.ArrayList;

public interface IDogfightModel {
	public IArea getArea();
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public default ArrayList<IMobile> getMobiles()
	{
		return null;
		
	}
	public IMobile getMobileByPlayer(int player);
	public void setMobileHavesMoved();
	
}
