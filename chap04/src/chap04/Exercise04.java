package chap04;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(sum != 5) {
			int num1, num2;
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			sum = num1 + num2;
			System.out.println("(" + num1 + ", " + num2 + ")");
		}
		
		
		
	}

}
