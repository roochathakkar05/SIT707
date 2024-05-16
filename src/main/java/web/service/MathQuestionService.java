package web.service;

public class MathQuestionService {

	/**
	 * Calculate Q1 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	
	  public static Double q1Addition(String number1, String number2) 
	  { 
		  boolean val = validatevalues(number1,number2); 
		  if(val == false){ 
			  return null; 
		  } 
		  double result = Double.valueOf(number1) + Double.valueOf(number2); 
		  return result; 
	  }
	
	/**
	 * Calculate Q2 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static Double q2Subtraction(String number1, String number2) {
		boolean val = validatevalues(number1,number2);
		if(val == false) {
			return null;
		}
		double result = Double.valueOf(number1) - Double.valueOf(number2);
		return result;
	}
	/**
	 * Calculate Q3 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static Double q3Multiplication(String number1, String number2) {
		boolean val = validatevalues(number1,number2);
		if(val == false) {
			return null;
		}
		double result = Double.valueOf(number1) * Double.valueOf(number2);
		return result;
	}
	
	public static boolean validatevalues(String number1, String number2) {
		if(number1 == null || number1.isBlank() || number1.isEmpty()|| 
				number2 == null || number2.isBlank() || number2.isEmpty()) {
			return false;
		}
		else{
			try {
	            Double.valueOf(number1);
	            Double.valueOf(number2);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
			
		}
	}

}
