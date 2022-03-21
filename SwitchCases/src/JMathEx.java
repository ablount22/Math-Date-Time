/* Author: Ashanti Blount
 * Date: 03/21/2022
 * Description: Testing out the math class
 * 
 */
public class JMathEx {
	
	public static void main(String[] args) {
		//doing examples with my own variables from site
		double x = 24;
		double y = 6;
		//return the max of two numbers
		System.out.println("Max number of x and y is: " + Math.max(x, y));
		
		//return the sqrt of y
		System.out.println("Square root of y is: " + Math.sqrt(y));
		
		//returns x power of y ex. 24^6
		System.out.println("Power of x and y is: " + Math.pow(x,y));
		
		//return the log of a given value
		System.out.println("Logarithm of x is: " + Math.log(x));
		System.out.println("Logarithm of y is: " + Math.log(y));
		
		//return the log of a given value when base is 10
		System.out.println("log10 of x is: " + Math.log10(x));
		System.out.println("log10 of y is: " + Math.log10(y));
		
		//return the log of x + 1
		System.out.println("log1p of x is: " + Math.log1p(x));
		
		//return a power of 2
		System.out.println("exp of a is: " + Math.exp(x));
		
		// return (a power of 2)-1
		System.out.println("expm1 of a is: " + Math.expm1(x));
		
		/* Examples for other math equations
		 * Sine: Math.sin(a));
		 * Sine arc: Math.asin(a));
		 * Sine hyperbolic: Math.sinh(a));
		 * Cosine: Math.cos(a));
		 * Cosine arc: Math.acos(a));
		 * Cosine hyperbolic: Math.cosh(a));
		 * Tangent: Math.tan(a));
		 * Tangent arc: Math.atan(a));
		 * Tangent hyperbolic: Math.tanh(a));
		 * 
		 */
		
		
	}

}
