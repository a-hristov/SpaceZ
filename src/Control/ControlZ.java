/**
 * 
 */
package Control;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import ViewZ.FrameZ;
import ViewZ.covPanelZ;
import ViewZ.mainPanelZ;

/**
 * Control 
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class ControlZ implements ActionListener{
	private mainPanelZ mPZ;
	private covPanelZ covPZ;
	public ControlZ() {
		mPZ = new mainPanelZ(this);
		new FrameZ("SpaceZ Rechensoftware",mPZ,1000,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		switch(ac) {
		case "cov":
			covPZ = new covPanelZ(this);
			new FrameZ("SpaceZ Rechensoftware",covPZ,1000,700);

		}
	}
}
