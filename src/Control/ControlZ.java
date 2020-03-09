/**
 * 
 */
package Control;

import ViewZ.FrameZ;
import ViewZ.mainPanelZ;

/**
 * Control 
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class ControlZ {
	private mainPanelZ mPZ;
	public ControlZ() {
		mPZ = new mainPanelZ(this);
		new FrameZ("SpaceZ Rechensoftware",mPZ,1000,700);
	}
}
