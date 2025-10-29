package ex02;

public class ArrayEx3 {

	public static void main(String[] args) {
	//배열 		int [] 이름 = new int [만들 방의 수];
 
		
//배열은 0부터 시작 해서 쓰는데 너무 길어지니까 
		// {괄호 안에 써준다}; 
		int [] numArr = {90,80,70,60,50};
 

 
 int sum = 0;
 
 for (int i =0; i< 5; i++) 
	 sum += numArr[i];
 
 /*
  * sum = sum + numArr[0]
  * sum = sum + numArr[1]
  * sum = sum + numArr[2]
  * sum = sum + numArr[3]
  * sum = sum + numArr[4]
  * 
  * 배열은 0부터 시작한다 -1 생각하면된다
  */
 
 System.out.println("총합 :"+ sum );
	
 //변수값이 많으면 class 를 만들어서 따로 지정
	}

}
