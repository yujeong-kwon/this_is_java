package chap05;

import java.util.Scanner;

//점수를 입력받아서 최고점수 및 평균점 구하기 
public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for (int i = 0 ; i < studentNum ; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo == 3) {
				for (int i = 0 ; i < studentNum ; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0 ; i < studentNum ; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}

				System.out.println("최고 점수: " + max);
				System.out.println("최고 점수: " + ((double)sum / (double)studentNum));
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
