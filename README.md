
## 2차원 배열 자바코드로 작성하기
<img src="https://user-images.githubusercontent.com/90735202/252681435-3e1de8f6-865f-454e-b5c6-52933ab8b088.jpg" width="500" height="500">

#### 5*5 사이즈의 2차원 배열 생성
```
int[][] array = new int[5][5];
```

#### 5*5 배열에 숫자를 넣는 이중반복문
```
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
```
#### 5*5배열에 숫자를 넣을 때 첫번째 조건 : 행과 열 번호의 합이 짝수일경우
<img src="https://user-images.githubusercontent.com/90735202/252686995-fd7aab4c-012f-4a84-8e7e-a4ecd3bb426c.png" width="500" height="500">

#### 5*5배열에 숫자를 넣을 때 두번째 조건 : |i-2| + |j-2| != 4 일경우
<img src="https://user-images.githubusercontent.com/90735202/252687065-6bb9aa0f-8c85-4c41-a4d6-3e1370552c7e.png" width="500" height="500">

#### 두가지 조건을 만족하는 이중반복문 출력 결과
```
0 0 2 0 0 
0 4 0 6 0 
8 0 10 0 12 
0 14 0 16 0 
0 0 18 0 0 
```
