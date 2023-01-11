package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		
		Person perK=new Person();
		System.out.println(perK.name="김유신");
		System.out.println(perK.height=180f);
		System.out.println(perK.weight=80f);
		
		Person perㅣ=new Person();
		System.out.println(perㅣ.name="이순신");
		System.out.println(perㅣ.height=187f);
		System.out.println(perㅣ.weight=80f);
		
		
		Person perk=new Person("강감찬",170,70);
		System.out.println(perk.height);
		System.out.println(perk.weight);
		
		
	}

}
