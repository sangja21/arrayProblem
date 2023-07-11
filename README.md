

## 문제풀이 시도과정
<img src="https://user-images.githubusercontent.com/90735202/252695032-d012d937-2f29-4765-bdb6-31e365f5a97a.jpeg" width="500" height="700">


# 문제풀이

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
<img src="https://user-images.githubusercontent.com/90735202/252690827-cacc5979-47a5-42eb-8177-79a32ddb59f9.png" width="500" height="500">

#### 두가지 조건을 만족하는 이중반복문 출력 결과
```
0 0 2 0 0 
0 4 0 6 0 
8 0 10 0 12 
0 14 0 16 0 
0 0 18 0 0 
```


## 검정마커펜을 추상화하기 
```
package array;

public interface MakerPen {
	// 검정 마커펜을 추상화하시오. 
	public static final String blackMaker = "#000000";
	public static final String redkMaker = "#FF0000";
	public static final String greenkMaker = "#00FF00";
	public static final String blueMaker = "#0000FF";
}

```
