package ex05;

public class 입력X출력X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




System.out.println("------------------");

student s2 = new student();
s2.setAddress("강동구천호동");
s2.setAge(20);
s2.setName("김지수");
System.out.println(s2.getAddress());

System.out.println(s2.getAge());

System.out.println(s2.getName());


	}
}
	/*
	 * 클래스 - 맴버변수(속성), 맴버 메소드(함수)
	 * 맴버변수 - 정적인것(상태)
	 *  멤버메소드는 -동적(행동)
	 *  class 는 설계도 그래서 메인에 집을 지을 수 있다.
	 */
class student {
	private String name;
	private	int age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private	String address;
 void study() {
	 System.out.println(name +" Java 공부 중 입니다."  );
 }
 //함수명 add , 반환타입(리턴값): void(없다는소리), 매개변수(입력값):
 void info() {
	System.out.println(name + "님 나이는" + age + "이고," + address + "살고 있습니다" );
 }
}
