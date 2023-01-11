package chapter04;

import java.lang.reflect.Array;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int array1[]= {10,20,30,40,50};		
		int array2[]= {1,2,3,4,5};
		
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i]+" ");
		}//for
		
		System.out.println();
		System.out.println("---------------------------");
		
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
			System.out.println();
			System.out.println("---------------------------");
			
			//배열복사 : (array1, 첨자(복사가 시작될 위치의 첨자),array2,첨자(붙여넣기 할 시작첨자), 붙여넣기 할 원소 갯수)
			
			System.arraycopy(array1, 0, array2, 1, 4);
			System.arraycopy(array1, 0, array2, 0, 0);
			
			for (int i=0; i<array2.length; i++) {
				System.out.print(array2[i]+" ");
			}//for
			
			
	}//main

}//class
