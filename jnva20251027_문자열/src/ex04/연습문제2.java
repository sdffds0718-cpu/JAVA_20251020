package ex04;

import java.util.Arrays;

public class 연습문제2 {

	public static void main(String[] args) {
	int [] r = new int[8];
	for (int i =0; i<r.length; i++) {
		r[i] = (int)(Math.random()*191)+10;
	}
	System.out.println(Arrays.toString(r));
int sum = 0;	
int max , min;
max = min = r[0];
for (int i =0; i< r.length; i++) {
	if (max < r[i]) {
		max = r[i];
		}
	if (min > r[i]) {
		min = r[i];
	}
}
System.out.println(max );
System.out.println(min );

		}
	}


