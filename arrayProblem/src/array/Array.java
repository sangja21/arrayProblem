package array;

public class Array {
	/*
	 * Q1. 다음 2차원 배열을 출력하는 자바코드를 작성하시오.
	 0 0 2 0 0 
	 0 4 0 6 0 
	 8 0 0 0 10 
	 0 12 0 14 0 
	 0 0 16 0 0 
	 
	 */

	public static void main(String[] args) {

		// 5*5 2차원 배열 생성
		int[][] array = new int[5][5];

		// 2차원 배열에 넣을 숫
		int currentNumber = 2;

		// 2차원 배열에 숫자를 넣는 2중 for문 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				// 패턴을 판별하는 if문 : (i + j)%2 == 0 인 경우 
				if ((i+j)%2 == 0 &&  (Math.abs(i-2) + Math.abs(j-2)) != 4) {
					array[i][j] = currentNumber;
					currentNumber += 2;
				} // if문 
			} // inner for
		} //outer for

		// 배열 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + " ");
			} // inner for
			System.out.println();
		} // out for

	}

}
