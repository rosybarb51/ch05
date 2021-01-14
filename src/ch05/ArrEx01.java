package ch05;

import java.util.Arrays;

public class ArrEx01 {
	public void arrEx() {
		
//		���� 1) 2���� �迭�� ����� ���ÿ� 1 ~ 25������ ���ڸ� �����ϴ� 2���� �迭�� �����ϼ���. 
//		���� �ؼ� : 5 x 5 �̴�. ���� 5�� �Ʒ����� ���� �ٱ��� {} �� ����. JS������ 2���� �迭�� �迭�� ��ҷ� 1���� �迭�� ������ ��, 3������ �迭�� ��ҷ� 2���� �迭�� ����. �׷��� �� �������� ���� 5�� �ڱ� �ȿ� 5���� �迭�� �����ٴ� ���̴�. �׷��� �ε����� �����ϱ� �ε����� ���ʷ� 0, 1, 2, 3, 4�� ����. ���� 5�� ĭ���� ���� ��, �� �迭 ���� �迭�� ��Ұ� �� ������ ���Ѵ�. �׷��� �迭 �ȿ� �迭�� 5�� �� ��Ҹ� ������. ���� ���, arr1[2][1] = 12 �̴�. JS�� 2���� �迭�� �����ϴ�. 
		int[][] arr1 = new int[][] {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};
		
//		���� 2) 2���� �迭�� �����ϰ�, 1 ~ 25������ ���ڸ� ���߿� �Է��ϴ� ������ �迭�� �����ϼ���. 
//		������ �߰� �κб��� �Է�
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
//		���� 3) 2���� �迭�� �����ϰ� 1 ~ 25������ ���ڸ� �ݺ����� ���Ͽ� �Է��ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//		���� �ؼ� : 1���� �迭�̸�, arr1.length �� ���� ���ϴ� �� �´�. �׷��� �� ������ 2���� �迭�ε��� ���� �� �� 1���� �迭 �� ��ó�� �Ȱ��� ����ߴ�. �ֳ��ϸ�, �迭 ����� ���� ����ϱ� ������ 1���� �迭�� ����. length ���� ���� ���� �� �ϳ� �� ��ŭ []�� �ٿ��� ���ش�. ��� �Ҽ������� ������ ����. 
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
//		���� 4) ���� 3���� Ȱ���Ͽ� 1 ~25������ ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		System.out.println("---- ���� 4 ----");
		int total = 0;
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				total += arr3[i][j]
//			}
//		}
		System.out.println("1 ~ 25������ ���� : " + total);

//		�迭����
	}
	public void arrayCopy1() {
		System.out.println("--- �迭 ����1 ---");
		
		int[] arr1 =  new int[] {1, 2, 3};
		int[] arr2 = null;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
//		�迭1���� �迭2���� �� �� int�� �迭�̾ ���� ������. 
		arr2 = arr1;
		
//		�����ϰ� �ٽ� ������ֱ�.
		System.out.println("�迭 arr2�� �迭 arr1�� ���� ����");
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
//		���� �迭�� �� �ϳ� �����ϰ� �ٽ� ������ֱ�.
		System.out.println("�迭 arr1[0]�� �� ����");
		arr1[0] = 100;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
//		�纻 ���� �� �� Ȯ��.
		System.out.println("�迭 arr2[2]�� �� ����");
		arr2[2] = 3000;
		
		arr1[0] = 100;
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
		}
		
//	for������ ���� �� �� ���� Ȯ��.
	public void arrayOutput(int[] array, String name) {
		if (array != null) {	
			for (int i = 0; i < array.length; i++) {
				System.out.println("array[" + i + "] : " + array[i]);
			}
		}
		else {
			System.out.println(name + "�迭�� ������ϴ�.");
		}
	}
	
	public void arrayCopy2() {
		System.out.println("\n--- arrayCopy2 ---\n");
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = null;
		
		System.out.println("���� ���� ���� �迭");
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
		System.out.println("for���� ���� ����");
		
//		null �κп� ���� ���ܼ� �Ʒ� ������.
//		�迭1���� ���̸�ŭ �迭�� ���̸� ������ְڴ� ��.
		arr2 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr1[0]�� �� ���� ");
		arr1[0] = 100;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr2[2]�� �� ����");
		arr2[2] = 3000;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1, "arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2, "arr2");
	}
	
	public void arrayCopy3() {
		System.out.println("\n--- arrayCopy3 ---\n");
//		System.arraycopy() �޼��带 �̿��Ͽ� �迭�� ����
//		System.arraycopy(����, �����������, �纻, ����޴�����(�ٿ��������), ������ ����);
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[10];
		
		System.out.println("���� �� ���� �迭");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("���� �� �迭");
		System.arraycopy(arr1, 0, arr2, 0, 5);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr1[0] �� ����");
		arr1[0] = 100;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr2[8] �� ����");
		arr2[8] = 9000;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
	}
	
	public void arrayCopy4() {
		System.out.println("\n--- arrayCopy4 ---\n");
		
//		Arrays Ŭ���� : �ش� �迭�� ���� ���� ����� ����� �� �ֵ��� �����ִ� Ŭ����
//		copyOf(����, ������ ����) : ���� �迭�� 0 index���� ������ ���̸�ŭ �����͸� ����
//		copyOf(����, ����index, ��index) : ���� �迭���� ������ ���� index���� �� index������ �����͸� ����
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		System.out.println("���� �迭");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("Arrays.copyOf ���� �� �迭");
		arr2 = Arrays.copyOf(arr1, arr1.length);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
	}
	
	public void adFor() {
		System.out.println("--- ���� for�� ---");
		
		int[] scores = new int[] {95, 71, 84, 93, 87};
	
		int total = 0;
	
		System.out.println("�Ϲ����� for���� ����Ͽ� ���� ���ϱ�");
//		���� for���� ��� ����
//		���� �迭�� ��Ҹ� ���� ���
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			System.out.println("total�� ��" + total);
		}
	
		System.out.println("���� for���� ����Ͽ� ���� ���ϱ�");
		
//		������ ����ϳ� ������ �ʱ�ȭ, ������ ������. (���� �� ���)
		for (int value : scores) {
			total += value;
			System.out.println("total�� ��" + total);
		}
	}
}









