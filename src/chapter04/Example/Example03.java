package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		//학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
	      
        boolean run=true;
        
        int studentNum=0;
        int[] score=null;
        
        Scanner scan=new Scanner(System.in); //System.in 매개변수
        
        while(run) {
           System.out.println("-----------------------------------------------");
           System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
           System.out.println("-----------------------------------------------");
           System.out.print("선택> ");
           
           int selectNo=Integer.parseInt(scan.nextLine());
           
           if(selectNo ==1 ) {
              System.out.print("학생수> ");
              studentNum=Integer.parseInt(scan.nextLine());//2
              score=new int[studentNum];
              
           }else if(selectNo ==2 ) {
              for(int i=0;i<score.length;i++) {
                 System.out.print("score["+(i+1)+"]> ");
                 score[i]=Integer.parseInt(scan.nextLine());
              }   
           }else if(selectNo == 3) {
              for(int i=0;i<score.length;i++) {
                 System.out.println("score["+(i+1)+"] : "+score[i]);
              }
           }else if(selectNo == 4){
              int max =0;
              int sum =0;
              double avg=0.0;
              
              for(int i=0;i<score.length;i++) {
                 max= max < score[i] ? score[i] : max; //최고점수
                 sum += score[i]; //총점
              }
              
              avg=sum/(double)studentNum;
              System.out.println("최고 점수 : "+max);
              System.out.println("총점 : "+sum);
              System.out.println(String.format("평균 : %.2f",avg));
              
           }else {
              run=false;
           }//if
        
        }//while
        System.out.println("프로그램 종료");
		
	}//main

}//class
