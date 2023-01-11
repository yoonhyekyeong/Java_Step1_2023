package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
 
		//Book클래스의 배열만들기 3개
		Book bookArray1[]=new Book[3]; //선언만 한 것
		Book[] bookArray2=new Book[3]; 
		
		//초기화
		bookArray1[0]=new Book("데미안","헤르만 헤세");
		bookArray1[1]=new Book("어린왕자","생텍쥐페리");
		bookArray1[2]=new Book("백설공주","AAA");
		
		//bookArray2 객체 생성
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		System.out.println("-------원본(bookArra9y1)-------");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		
		//깊은 복사
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			
	}
		System.out.println("-------복사본(bookArray2)-------");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}
		System.out.println();
		//===============================================
		
		System.out.println();
		bookArray1[0].setBookname(null);
		}
		
		

}
