package chapter04;

public class BookArray02 {

	public static void main(String[] args) {

		//Book(); 5번 호출
		Book[] library=new Book[5];
		
		library[0]=new Book("데미안","헤르만 헤세");
		library[1]=new Book("이상한 나라의 앨리스","아몬드");
		library[2]=new Book("몽고메리","백설공주");
		library[3]=new Book("인어공주","어린왕자");
		library[4]=new Book("노인과바다","빨강머리앤");
		
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
			System.out.println();
		}
		
	}

}
