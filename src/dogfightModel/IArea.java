package dogfightModel;

import java.awt.Image;

public interface IArea {
	public default Dimension getDimension()
	{
		return null;
		
	}
	public default Image getImage()
	{
		return null;
		
	}
}
