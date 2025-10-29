package ex01;

public class ClassExo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1 = new student();
s1.name = "최홍석";
s1.age = 33;
s1.address = "강동구 천호동";
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.address);
s1.study();



System.out.println("------------------");

student s2 = new student();
s2.name = "선아영";
s2.age = 28;
s2.address = "강동구 암사동";
s1.address = "강동구 천호동";
System.out.println(s2.name);
System.out.println(s2.age);
System.out.println(s2.address);
s2.study();
	}
}
	/*
	 * 클래스 - 맴버변수(속성), 맴버 메소드(함수)
	 * 맴버변수 - 정적인것(상태)
	 *  멤버메소드는 -동적(행동)
	 *  class 는 설계도 그래서 메인에 집을 지을 수 있다.
	 */
class student {
	String name;
	int age ;
	String address;
 void study() {
	 System.out.println(name +" Java 공부 중 입니다."  );
	 
	 
 }
}
