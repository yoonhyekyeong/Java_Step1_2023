package chapter06;

public class TeamGroup {
	
	//멤버변수(배열->팀구성원)
	
	private TeamMember[] member = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0] = new TeamMember("조현수","M");
		member[0] = new TeamMember("신진혁","M");
		member[0] = new TeamMember("정하영","M");
		member[0] = new TeamMember("이진학","M");
		member[0] = new TeamMember("신화진","F");
		member[0] = new TeamMember("윤혜경","F");
	}
	
	//출력 메소드
	public void Disp() {
		
		for(int i=0; i<member.length; i++) {
			//System.out.println("성별 : " + (member[i].getGender().equals("M") ? "남" : "여"));
			System.out.print("성별 : " + (member[i].getGender()));
			System.out.println(", 성명 : " + member[i].getName());
		}
	}	

}
