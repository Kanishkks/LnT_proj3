
public class div {
	 public static double div(double num1, double num2) {
	        if (num2 != 0) {
	            return 0;
	        } else {
	            System.out.println("Error: Cannot divide by zero");
	            return Double.NaN; // Not a Number
	        }
	    }
}
