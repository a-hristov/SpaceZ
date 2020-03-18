package ModelZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Circulart Orbital Velocity
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class CircularOrbitalVelocity {
	/**
	 * ORBITAL SPEED EQUATION
	 *  M mass of celestial body
	 *  R Celestial body radius
	 *  G Orbiter Height
	 *  V Circular orbital Velocity
	 */
	private double M;
	private double R;
	private double G;
	private double V;
	public CircularOrbitalVelocity(double M, double R, double G) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * ORBITAL SPEED EQUATION
	 * @return ORBITAL SPEED EQUATION
	 */
	public double calculation() {
		return Math.sqrt((G*M)/R);
	}
	/**
	 * @return the m
	 */
	public double getM() {
		return M;
	}
	/**
	 * @param m the m to set
	 */
	public void setM(double m) {
		M = m;
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return R;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		R = r;
	}
	/**
	 * @return the g
	 */
	public double getG() {
		return G;
	}
	/**
	 * @param g the g to set
	 */
	public void setG(double g) {
		G = g;
	}
	/**
	 * @return the v
	 */
	public double getV() {
		return V;
	}
	/**
	 * set Velocity
	 */
	public void setV() {
		V=calculation();
	}
	/**
	 * Save a CircularOrbitalVelocity Object
	 * @param filename name of the file
	 */
	public void outputCircularOrbitalVelocity(String filename) {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
			outputStream.writeObject(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Load a CircularOrbitalVelocity Object
	 * @param filename name of the file
	 * @return the CircularOrbitalVelocity object
	 */
	public CircularOrbitalVelocity inputTerminalVelocity(String filename) {
		CircularOrbitalVelocity tv = null;
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
			tv = (CircularOrbitalVelocity) inputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tv;
	}
}
