package chap05;

//최댓값 구하기 (for 문 사용) 
public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i : array) {
			if(max < i) {
				max = i;
			}
		}
		System.out.println("max: " + max);
	}

}
