package ex02;

public class ArrayEx2 {

	public static void main(String[] args) {
	/*
	 * 정수 배열 5개 생성후
	 * 각 배열 초기화 이후, 각 배열 합
	 * numArr.length 변동된 수만큼 자동으로 조절해줌 걍 이거쓰면좋을듯
	 */
 		
	
		int [] numArr = {90,80,70,100,110,60,50,40,30,20,10,0};
 

 
 int sum = 0;
 System.out.println(numArr.length);
 for (int i =0; i< numArr.length; i++) 
	 sum += numArr[i];
 
  System.out.println("총합 :"+ sum );
	
 //변수값이 많으면 class 를 만들어서 따로 지정
	}

}
