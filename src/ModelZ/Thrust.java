/**
 * 
 */
package ModelZ;

/**
 * @author alexs
 *
 */
public class Thrust {
	/**
	 * Thrust
	 *  m = mass flow rate
	 *  V = velocity
	 *  pExit = exit pressure
	 *  pOutside = outside pressure
	 *  Ae = area ratio from the throat to exit
	 *  Thrust
	 */
	private double m;
	private double V;
	private double pExit;
	private double pOutside;
	private double Ae;
	private double F;
	/**
	 * Thrust
	 * @param m = mass flow rate
	 * @param V = velocity
	 * @param pExit = exit pressure
	 * @param pOutside = outside pressure
	 * @param Ae = area ratio from the throat to exit
	 */
	public Thrust(double m, double V, double pExit, double pOutside,  double Ae) {
		// TODO Auto-generated constructor stub
		super();
		this.m=m;
		this.V=V;
		this.pExit=pExit;
		this.pOutside=pOutside;
		this.Ae=Ae;
		setF();
	}
	/**
	 * Thrust

	 * @return Thrust
	 */
	public double calculation() {
		return m*V+(pExit-pOutside)*Ae;
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
	 * @return the v
	 */
	public double getV() {
		return V;
	}
	/**
	 * @param v the v to set
	 */
	public void setV(double v) {
		V = v;
	}
	/**
	 * @return the pExit
	 */
	public double getpExit() {
		return pExit;
	}
	/**
	 * @param pExit the pExit to set
	 */
	public void setpExit(double pExit) {
		this.pExit = pExit;
	}
	/**
	 * @return the pOutside
	 */
	public double getpOutside() {
		return pOutside;
	}
	/**
	 * @param pOutside the pOutside to set
	 */
	public void setpOutside(double pOutside) {
		this.pOutside = pOutside;
	}
	/**
	 * @return the ae
	 */
	public double getAe() {
		return Ae;
	}
	/**
	 * @param ae the ae to set
	 */
	public void setAe(double ae) {
		Ae = ae;
	}
	/**
	 * @return the f
	 */
	public double getF() {
		return F;
	}
	/**
	 * @param f the f to set
	 */
	public void setF() {
		F=calculation();
	}
	
}
