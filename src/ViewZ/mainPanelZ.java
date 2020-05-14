/**
 * 
 */
package ViewZ;

import javax.swing.*;


import Control.ControlZ;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Main menu 
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class mainPanelZ extends JPanel {
	JLabel titleText, placeholder;
	// cov CircularOrbitalVelocity, tv TerminalVelocity, t Thrust
	JButton cov, tv, t;
	/**
	 * Constructor for main Panel
	 * @param c Control
	 */
	public mainPanelZ(ControlZ c) {
		this.setLayout(new BorderLayout());
		
		///////// NORTH /////////
		JPanel title = new JPanel(new GridLayout(1,1));
		titleText = new JLabel("Main Menu",SwingConstants.CENTER);
		titleText.setFont(new Font("Roboto", Font.BOLD,22));
		title.add(titleText);
		this.add(title, BorderLayout.NORTH);
		
		///////// CENTER /////////
		JPanel navButtons = new JPanel(new GridLayout(3,1));
		placeholder = new JLabel("");
		cov = new JButton("CircularOrbitalVelocity");
		cov.setPreferredSize(new Dimension(50,50));
		cov.setActionCommand("cov");
		cov.addActionListener(c);
		tv = new JButton("TerminalVelocity");
		tv.setActionCommand("tv");
		tv.addActionListener(c);
		t = new JButton("Thrust");
		t.setActionCommand("t");
		t.addActionListener(c);
		navButtons.add(cov);
		navButtons.add(tv);
		navButtons.add(t);
		this.add(navButtons, BorderLayout.CENTER);
		
				



	}
}
