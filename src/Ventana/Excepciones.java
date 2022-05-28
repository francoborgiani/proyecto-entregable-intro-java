package Ventana;

public class Excepciones {
  public static void validateStringNotEmpty(String strToValidate, String errorMessage) throws Exception {
		if (strToValidate.trim().equals("")) {
			throw new Exception(errorMessage);
		}
	}
  public static void numberIsPositive (Integer numberToValidate, String errorMessage) throws Exception {
		if (numberToValidate < 0) {
			throw new Exception(errorMessage);
		}
	}
  public static void isInByteRange (Integer numberToValidate, String errorMessage) throws Exception {
		if (numberToValidate > 255 || numberToValidate < 0) {
			throw new Exception(errorMessage);
		}
	}
}