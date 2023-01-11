package chapter03.Example;

public class Example {

	public static void main(String[] args) {

		//for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		
		double avg=0;
		int total=0;
		int count=0;
		int alltotal=0;
		
		
		
		/*
		//방법1
		 int sum[]=new int[3];
		 
		 
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum[i] +=array[i][j];
				
				count ++;
				avg=sum[i]/(double)count;
				
				System.out.println("각 행의 합 : "+sum[i]);
				System.out.println("각 행의 평균 : "+avg);
				System.out.println("-------------------------------------------------");	
				
	
			}
		}
			*/
		
		
			//방법2 
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array[i].length; j++) {
					total +=array[i][j];
				count ++; 
				}
				
				avg=total/(double)(array[i].length);
				System.out.println("각 행의 합 : "+total);	
				System.out.println("각 행의 평균 : "+Math.round(avg));	
				System.out.println("-------------------------------------------------");
				
				//쓰레기값 초기화
				alltotal +=total; // 전체 총합
				total=0;
				avg=0;
				System.out.println("-------------------------------------------------");
			}	
			//전체평균 
			double allavg=alltotal/(double)count;
			System.out.println("전체 총합 : "+alltotal);	
			System.out.println("전체 평균 : "+Math.round(allavg));
		
	}

}
