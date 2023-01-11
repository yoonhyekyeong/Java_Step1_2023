package chapter01;

public class Constant {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값
		
		//변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미
		//수정될 수 없기 때문에 초기화 값은 필수적
		
		
		final int MAX_NUM=100;
		final int MIN_NUM; //초기화 값이 없음
		final double PI=3.14;
		
		MIN_NUM=0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
		
		
	}

}
