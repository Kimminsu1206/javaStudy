package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	/* 코드 작성 */

	Person(String name){
		this.name = "";
		this.age = 12;
		numberOfPerson++;
	}
	
	Person(int age, String name){
		this.name = "";
		this.age = age;
		numberOfPerson++;
	}
	
	void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살입니다.");
	}

	static int getPopulation() {
		return numberOfPerson; 
	}
}
