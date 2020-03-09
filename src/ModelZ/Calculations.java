/**
 * 
 */
package ModelZ;

/**
 * Calculation methods for the SpaceZ Project
 * @author Alexander Hristov
 * @version 2020-03-09
 */
public class Calculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	/**
	 * TERMINAL VELOCITY
	 * @param m = obj mass (kg)
	 * @param g = gravitation force (m/s)
	 * @param p = atmosphheric pressure 
	 * @param A = projected area (kg/m^3)
	 * @param C = drag coefficients (m^2)
	 * @return TERMINAL VELOCITY
	 */
	public double terminalVelocity(double m, double g, double p, double A, double Cd) {
		return Math.sqrt((2*m*g)/p*A*Cd);
	}
	/**
	 * Thrust
	 * @param m = mass flow rate
	 * @param V = velocity
	 * @param pExit = exit pressure
	 * @param pOutside = outside pressure
	 * @param Ae = area ratio from the throat to exit
	 * @return Thrust
	 */
	public double thrust(double m, double V, double pExit, double pOutside,  double Ae) {
		return m*V+(pExit-pOutside)*Ae;
	}
	/**
	 * ORBITAL SPEED EQUATION
	 * @param M mass of celestial body
	 * @param R Celestial body radius
	 * @param G Orbiter Height
	 * @return ORBITAL SPEED EQUATION
	 */
	public double circularorbitalVelocity(double M, double R, double G) {
		return Math.sqrt((G*M)/R);
	}
}
