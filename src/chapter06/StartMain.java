package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//객체생성
		Start ran=new Start();
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			check=ran.chec(select);
			
			if(check.equals("SUCCESS"))
				break;
			
		
			
			
		}//while
		
	}//main

}
