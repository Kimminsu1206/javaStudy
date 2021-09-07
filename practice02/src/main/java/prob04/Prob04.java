package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		
		String result="";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		return result.toCharArray();
	}

	public static void printCharArray(char[] array){
		
		System.out.println( array );
	}
}