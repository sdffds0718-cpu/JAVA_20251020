package ex02;

public class ArrayEx01 {

	public static void main(String[] args) {
	//배열 		int [] 이름 = new int [만들 방의 수];
 
		
//배열은 0부터 시작 
		int [] numArr = new int [5];
 numArr[0] = 90;
 numArr[1] = 80;
 numArr[2] = 70;
 numArr[3] = 60;
 numArr[4] = 50;

 
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
		 }

}
