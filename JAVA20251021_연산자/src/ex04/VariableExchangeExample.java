package ex04;

public class VariableExchangeExample {

	public static void main(String[] args) {
int num1 = 10;

int num2 = 20;

//before
System.out.println("num1 : " + num1 +" ,num2 : " + num2);

// Exchange 두 수 변경
int temp = num1; 
num1 = num2;
num2 = temp;
// 두 숫자를 바꾼다 = int temp 자동반사급으로 나와야함 

System.out.println("num1 : " + num1 +" ,num2 : " + num2);

byte var1 = -128;
var1 -= 1;

// n이 반복되는걸 싫어하기 때문에 +를 =앞으로 땡겨옴 
// 원래대로면 n=n+1이 맞지만 n+= 1 로 쓴다..;;
System.out.println(var1);


	}
	
}
