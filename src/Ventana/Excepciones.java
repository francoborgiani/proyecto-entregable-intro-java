package Ventana;

public class Excepciones {
  public static void validateStringNotEmpty(String strToValidate, String errorMessage) throws Exception {
		if (strToValidate.trim().equals("")) {
			throw new Exception(errorMessage);
		}
	}
  public static void numberIsPositive (double d, String errorMessage) throws Exception {
		if (d < 0) {
			throw new Exception(errorMessage);
		}
	}
  public static void isInByteRange (Integer cantHijosInteger, String errorMessage) throws Exception {
		if (cantHijosInteger > 255 || cantHijosInteger < 0) {
			throw new Exception(errorMessage);
		}
	}
}