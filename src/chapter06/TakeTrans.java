package chapter06;

import java.security.PublicKey;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
				
		
		//버스 타기
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo();
		bus100.showInfo();//수입증가 인원수 증가
		System.out.println("-------------------------------");
		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("-------------------------------");
		
		
		//지하철 타기
		
		Subway subwayGreen=new Subway("2호선");
		studentJames.takesubway(subwayGreen);
		
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("-------------------------------");
				
		Subway subwayblue=new Subway("1호선");
		studentTom.takesubway(subwayblue);
		
		studentTom.showInfo();
		subwayblue.showInfo();
		System.out.println("-------------------------------");
	}
	

}
