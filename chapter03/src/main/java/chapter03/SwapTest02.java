package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println(a + " : " + b);
		
		/* swap 하기 */
		swap(a, b);
		
		System.out.println(a + " : " + b);
	}

	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}
	
}
