package ModelZ;

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
	 * @param M mass of celestial body
	 * @param R Celestial body radius
	 * @param G Orbiter Height
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
	 * @param v the v to set
	 */
	public void setV() {
		V=calculation();
	}
	
}
