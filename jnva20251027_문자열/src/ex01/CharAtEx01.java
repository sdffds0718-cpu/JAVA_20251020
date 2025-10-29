package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {
	// 서브젝트가 무엇인지 일단 지정해주고,
		String subject = "자바 프로그래밍";
		
// 자바프로그래밍에서 해당하는 index번호 한 문자 추출
	char ch = subject.charAt(0);
	System.out.println(ch);
	
	
	
//자바 프로그래밍 단어 갯수	 int len =subject.length(); 
	int len =subject.length();
	System.out.println("문자열 길이 : " + len);

	
// 자바프로그래밍 문장에서 자바를 파이썬으로 변경해서 새로운 문자열 생성
	//subject = subject.replace("자바", "파이썬");
subject = subject.replace("자바", "파이썬");
System.out.println("before : " + subject);
	System.out.println("after" + subject);
	
	System.out.println("----문자열 잘라내기-----" );
		
	
	String sub2=subject.substring(4); // n번째 위치부터 끝까지 표시 앞에는 자르기
	System.out.println(sub2);
String sub3 = subject.substring(4,6);// 문자니까 스트링 찍고 subject.subtring(시작번호,끝번호);

	
	System.out.println(sub3);
	System.out.println("----문자열 잘라내기-----" );
	// 문자열 찾기 int index = subject.indexOf("자바");

	int index = subject.indexOf("");
	System.out.println("문자열 찾기 :" + index);
	System.out.println("----문자열 잘라내기-----" );
	// 없는건 -1이 나온다
	index = subject.indexOf("없는건 -1");
	System.out.println("문자열 찾기 :" + index);
	System.out.println("----문자열 잘라내기-----" );

	
	//파이썬 프로그래밍 이란 문자열을 공난 기준으로 분리
	//String[] sub4	= subject.split(" ");
	String[] sub4	= subject.split(" ");
System.out.println(sub4[0]);
System.out.println(sub4[1]);
	
System.out.println("----문자열 잘라내기-----" );
//s 는 대한 s2는 민국 s3는 s와 콘켓 s2 인 형태 String s3 = s.concat(s2);

	String s = "대한";
	String s2= "민국";
			String s3 = s.concat(s2);
				System.out.println(s3);
	}

}
