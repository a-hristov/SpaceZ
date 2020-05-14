/**
 * 
 */
package ViewZ;

import Control.ControlZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 * panel for COV
 * @author Alexander Hristov
 * @version 2020-05-14
 */
public class covPanelZ extends JPanel{
	JLabel mLabel,rLabel,gLabel, vLabel, saveORloadLocationLabel; 
	JTextField mTextField, rTextField, gTextField, saveORloadLocation;
	JButton enter, save, load;
	/**
	 * Constructor for cov
	 */
	public covPanelZ(ControlZ c) {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());
		JPanel COVvariables = new JPanel(new GridLayout(5,2));
		mLabel = new JLabel("M");		
		rLabel = new JLabel("R");		
		gLabel = new JLabel("G");		
		vLabel = new JLabel("V equals: ---");
		mTextField = new JTextField();		
		rTextField = new JTextField();		
		gTextField = new JTextField();		
		COVvariables.add(mLabel);
		COVvariables.add(mTextField);
		COVvariables.add(rLabel);
		COVvariables.add(rTextField);
		COVvariables.add(gLabel);
		COVvariables.add(gTextField);
		COVvariables.add(vLabel);
		enter = new JButton("Enter");
		enter.setActionCommand("COVenter");
		enter.addActionListener(c);
		COVvariables.add(enter);
		saveORloadLocationLabel = new JLabel("Enter Save/Load Location");
		saveORloadLocation = new JTextField();
		COVvariables.add(saveORloadLocationLabel);
		COVvariables.add(saveORloadLocation);
		this.add(COVvariables, BorderLayout.CENTER);
		
		JPanel saveLoad = new JPanel(new GridLayout(1,2));
		save = new JButton("Save");
		save.setActionCommand("COVsave");
		save.addActionListener(c);
		load = new JButton("Load");
		load.setActionCommand("COVload");
		load.addActionListener(c);
		saveLoad.add(save);
		saveLoad.add(load);
		this.add(saveLoad, BorderLayout.PAGE_END);
	}

}
