package chapter06;

public class Computer {

	int sum1(int[] values) {
		int sum=0;

		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}//for

		return sum;
	}

	//===========================================================
	int sum2(int ...values) {
		int sum=0;

		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}//for

		return sum;
	}//메소드 
}
