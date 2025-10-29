package ex06;

public class 입력X출력X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();

		 s1.setAge(29);
		 System.out.println(s1.getAge());
		 System.out.println("------------------");

		 s1.setName("최홍석");
		 System.out.println(s1.getName());
		student s2 = new student();
		s1.setAddress("강동구천호동");
		System.out.println(s1.getAddress());
		
	}
}

/*
 * 클래스 - 맴버변수(속성), 맴버 메소드(함수) 맴버변수 - 정적인것(상태) 멤버메소드는 -동적(행동) class 는 설계도 그래서 메인에
 * 집을 지을 수 있다.
 */
//맴버 변수는 무조건 private 접근 제어자를 사용!!
class student {
	
	//맴버변수에 접근할 수 있는 통로 
//=> setter, getter를 만든다
	private String name;
	private int age;
	private String address;

	public int getAge() {
		return age;
	}
	
	
public void setAge(int age) {
	this.age = age;
}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	void study() {
		System.out.println(name + " Java 공부 중 입니다.");
	}

}
