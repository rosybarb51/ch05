package ch05;

import java.util.Arrays;

public class ArrEx01 {
	public void arrEx() {
		
//		문제 1) 2차원 배열을 선언과 동시에 1 ~ 25까지의 숫자를 저장하는 2차원 배열을 생성하세요. 
//		문제 해석 : 5 x 5 이다. 앞의 5는 아래에서 가장 바깥의 {} 을 뜻함. JS에서는 2차원 배열은 배열의 요소로 1차원 배열을 가지는 것, 3차원은 배열의 요소로 2차원 배열을 가짐. 그래서 이 문제에서 앞의 5는 자기 안에 5줄의 배열을 가진다는 뜻이다. 그래서 인덱스로 따지니까 인덱스가 차례로 0, 1, 2, 3, 4로 들어간다. 뒤의 5는 칸으로 봤을 때, 즉 배열 안의 배열에 요소가 몇 개인지 말한다. 그래서 배열 안에 배열은 5개 씩 요소를 가진다. 예를 들면, arr1[2][1] = 12 이다. JS의 2차원 배열과 동일하다. 
		int[][] arr1 = new int[][] {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};
		
//		문제 2) 2차원 배열을 선언하고, 1 ~ 25까지의 숫자를 나중에 입력하는 형태의 배열을 생성하세요. 
//		데이터 추가 부분까지 입력
		int[][] arr2 = new int[5][5];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
//		...
		arr2[4][0] = 21;
		arr2[4][1] = 22;
		arr2[4][2] = 23;
		arr2[4][3] = 24;
		arr2[4][4] = 25;
//		문제 3) 2차원 배열을 선언하고 1 ~ 25까지의 숫자를 반복문을 통하여 입력하고 출력하는 프로그램을 작성하세요.
//		문제 해석 : 1차원 배열이면, arr1.length 로 길이 구하는 게 맞다. 그런데 이 문제는 2차원 배열인데도 길이 잴 때 1차원 배열 쓸 때처럼 똑같이 사용했다. 왜냐하면, 배열 요소의 수를 출력하기 때문에 1차원 배열과 같음. length 적을 때는 차원 수 하나 뺀 만큼 []를 붙여서 써준다. 어디 소속인지만 밝혀서 쓰자. 
		int[][] arr3 = new int[5][5];
		int count = 1;
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = count;
				count ++;
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j ++) {
				System.out.println("arr3[" + i + "][" + j + "] : " + arr3[i][j]);
			}
		}
//		문제 4) 문제 3번을 활용하여 1 ~25까지의 숫자의 총합을 계산하는 프로그램을 작성하세요.
		System.out.println("---- 문제 4 ----");
		int total = 0;
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				total += arr3[i][j]
//			}
//		}
		System.out.println("1 ~ 25까지의 총합 : " + total);

//		배열복사
	}
	public void arrayCopy1() {
		System.out.println("--- 배열 복사1 ---");
		
		int[] arr1 =  new int[] {1, 2, 3};
		int[] arr2 = null;
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
//		배열1번과 배열2번이 둘 다 int형 배열이어서 복사 가능함. 
		arr2 = arr1;
		
//		복사하고 다시 출력해주기.
		System.out.println("배열 arr2에 배열 arr1의 값을 대입");
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
//		원본 배열의 값 하나 변경하고 다시 출력해주기.
		System.out.println("배열 arr1[0]의 값 변경");
		arr1[0] = 100;
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
//		사본 수정 후 값 확인.
		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		
		arr1[0] = 100;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
		}
		
//	for문으로 복사 후 값 변경 확인.
	public void arrayOutput(int[] array, String name) {
		if (array != null) {	
			for (int i = 0; i < array.length; i++) {
				System.out.println("array[" + i + "] : " + array[i]);
			}
		}
		else {
			System.out.println(name + "배열이 비었습니다.");
		}
	}
	
	public void arrayCopy2() {
		System.out.println("\n--- arrayCopy2 ---\n");
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = null;
		
		System.out.println("복사 전의 원본 배열");
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
		System.out.println("for문을 통한 복사");
		
//		null 부분에 문제 생겨서 아래 적어줌.
//		배열1번의 길이만큼 배열의 길이를 만들어주겠단 말.
		arr2 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr1[0]의 값 변경 ");
		arr1[0] = 100;
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
	}
	
	public void arrayCopy3() {
		System.out.println("\n--- arrayCopy3 ---\n");
//		System.arraycopy() 메서드를 이용하여 배열을 복사
//		System.arraycopy(원본, 복사시작지점, 사본, 복사받는지점(붙여넣을장소), 복사할 길이);
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[10];
		
		System.out.println("복사 전 원본 배열");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("복사 후 배열");
		System.arraycopy(arr1, 0, arr2, 0, 5);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr1[0] 값 변경");
		arr1[0] = 100;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr2[8] 값 변경");
		arr2[8] = 9000;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
	}
	
	public void arrayCopy4() {
		System.out.println("\n--- arrayCopy4 ---\n");
		
//		Arrays 클래스 : 해당 배열에 여러 가지 기능을 사용할 수 있도록 도와주는 클래스
//		copyOf(원본, 복사할 길이) : 원본 배열의 0 index에서 지정한 길이만큼 데이터를 복사
//		copyOf(원본, 시작index, 끝index) : 원본 배열에서 지정한 시작 index에서 끝 index까지의 데이터를 복사
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		System.out.println("원본 배열");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("Arrays.copyOf 복사 후 배열");
		arr2 = Arrays.copyOf(arr1, arr1.length);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
	}
	
	public void adFor() {
		System.out.println("--- 향상된 for문 ---");
		
		int[] scores = new int[] {95, 71, 84, 93, 87};
	
		int total = 0;
	
		System.out.println("일반적인 for문을 사용하여 총합 구하기");
//		향상된 for문과 결과 동일
//		원본 배열의 요소를 직접 사용
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			System.out.println("total의 값" + total);
		}
	
		System.out.println("향상된 for문을 사용하여 총합 구하기");
		
//		원본의 요소하나 꺼내어 초기화, 변수에 대입함. (복사 후 사용)
		for (int value : scores) {
			total += value;
			System.out.println("total의 값" + total);
		}
	}
}









