package chapter06;

public class Vending {

	//멤버변수
	private Can[] can=new Can[5];//선언만 한것
	private int money;


	//can[0]=new Can("환타",1000); //private 변수방이므로 반드시 메소드 안에서 초기화 한다

	//메소드
	public void init() {
		can[0]=new Can("환타",1000);
		can[1]=new Can("콜라",2000);
		can[2]=new Can("사이다",1200);
		can[3]=new Can("밀키스",1500);
		can[4]=new Can("코코팜",1100);

	}

	//사용 가능한 음료만 보여주기

	public void showCans(int m) {


		money=m;//돈
		for(int i=0; i<can.length;i++) {
			//돈과 가격과 비교 판단
			if(can[i].getPrice()<=money) {
				System.out.println("구매 가능한 음료 : "+can[i].getCanName()+"-"+can[i].getPrice()+"원");
			}


		}//for

	}//메소드
	
	//선택한 음료수 제공과 잔액
	public void outCan(String name) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"를 선택하셨습니다");
				System.out.println("잔 액 : "+(money-can[i].getPrice())+"원");
			}//if
		}//for
		
	}

}//class
