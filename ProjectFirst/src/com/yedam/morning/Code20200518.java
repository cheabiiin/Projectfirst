package com.yedam.morning;

public class Code20200518 { // 배열 10,8,5,3,7,1 값을 작은 값부터 출력 되게 하시오.
	public static void main(String[] args) {

		int[] intAry = { 10, 8, 5, 3, 7, 1 };
		int temp = 0;

		for(int i=0; i<intAry.length; i++) { //
			for(int j=i+1; j<intAry.length; j++) {
				if(intAry[i] > intAry[j]) {
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j]=temp;
				}
			}
		} System.out.println();
		for(int i =0; i <intAry.length; i++) {
			System.out.println(intAry[i]);
		}
//		for (int i = 0; i < intAry[i]; i++) {
//			for (int j = 0; j < intAry.length; j++) {
//				if (intAry[i] < intAry[j]) {
//				temp = intAry[i];
//				}
//				System.out.println();
//			}System.out.println(i);
//			}
	}

}
