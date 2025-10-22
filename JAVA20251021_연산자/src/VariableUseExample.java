
public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");

		/*연산 
		 * 정수 + 정수 = 정수 당연
		 * 실수 + 실수 = 실수 당연
		 * 정수 + 실수 = 실수 
		 */
	//시간을 지정해주고, 분도 지정해준다.
		// hour은 시간이란 말이고 minute는 분이란 말이란 변수를 설정한다
		// 총시간을 계산할 때 시간의 단위 1시간=60분 이라는 설정을 해준다
		
	}
class Test{
	 void printTime() { 
	int hour = 2;
	int minute = 10;
	System.out.println(hour + "시간" + minute + "분");
	
	int totalMinute = (hour*60) + minute;
	System.out.println("총" + totalMinute + "분"); 
	 }	 
}
class test{
	void printTime() {
		int hour = 5;
		int minute = 30;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60);
		System.out.println("총시간" + totalMinute + "분");
		
	}
}
}
