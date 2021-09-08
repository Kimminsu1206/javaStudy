package prob04;

public class StringUtil {
	
	public static String concatenate(String[] a) {

		String result = "";
		
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
