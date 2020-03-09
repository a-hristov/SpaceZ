/**
 * 
 */
package ModelZ;

/**
 * Terminal Velocity
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class TerminalVelocity {
	/**
	 * TERMINAL VELOCITY
	 *  m = obj mass (kg)
	 *  g = gravitation force (m/s)
	 *  p = atmosphheric pressure 
	 *  A = projected area (kg/m^3)
	 *  C = drag coefficients (m^2)
	 *  Vt = TERMINAL VELOCITY
	 */
	private double m; 
	private double g;
	private double p;
	private double A;
	private double Cd;
	private double Vt;
	/**
	 * TERMINAL VELOCITY
	 * @param m = obj mass (kg)
	 * @param g = gravitation force (m/s)
	 * @param p = atmosphheric pressure 
	 * @param A = projected area (kg/m^3)
	 * @param Cd = drag coefficients (m^2)
	 */
	public TerminalVelocity(double m, double g, double p, double A, double Cd) {
		// TODO Auto-generated constructor stub
		this.m=m;
		this.g=g;
		this.p=p;
		this.A=A;
		this.Cd=Cd;
		setVt();		
	}
	/**
	 * TERMINAL VELOCITY

	 * @return TERMINAL VELOCITY
	 */
	public double calculation() {
		return Math.sqrt((2*m*g)/p*A*Cd);
	}
	/**
	 * @return the m
	 */
	public double getM() {
		return m;
	}
	/**
	 * @param m the m to set
	 */
	public void setM(double m) {
		this.m = m;
	}
	/**
	 * @return the g
	 */
	public double getG() {
		return g;
	}
	/**
	 * @param g the g to set
	 */
	public void setG(double g) {
		this.g = g;
	}
	/**
	 * @return the p
	 */
	public double getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(double p) {
		this.p = p;
	}
	/**
	 * @return the a
	 */
	public double getA() {
		return A;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		A = a;
	}
	/**
	 * @return the cd
	 */
	public double getCd() {
		return Cd;
	}
	/**
	 * @param cd the cd to set
	 */
	public void setCd(double cd) {
		Cd = cd;
	}
	/**
	 * @return the vt
	 */
	public double getVt() {
		return Vt;
	}
	/**
	 * set Vt
	 */
	public void setVt() {
		Vt = calculation();
	}	
}
