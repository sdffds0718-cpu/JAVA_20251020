package ex04;

import java.util.Arrays;

public class 연습문제 {

	public static void main(String[] args) {
		/*
		 *배열 10개 방에 랜덤하게 1~100사이 값을저장
		 *배열에서 최대값 최소값 구하기
		 *10값 총점 / 평균 구하기
		 *10값을 정렬
		 */
		int [] num = new int[10];
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(num));
	
	// 배열에서 최대값 최소값 구하기
		int max , min;
		max = min = num[0];
		for (int i =0; i < num.length; i++ ) {
			
			if (max < num[i])// 현재 최대값 보다 더 큰 < num이 나오면 그게
				max = num[i];//최대값이다
			
			if (min > num[i]) // 현제 최소값 보다 더 작은 > num이 나오면 그게
				min = num[i];// 최소값이다~
			
		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		
		// 10값 총점 / 평균 구하기
		int sum =0;
		double avg=0;
		for (int i=0; i<10; i++) {
			sum+= num[i];
				avg = (double)sum/num.length;
				System.out.println("총점 :" + sum);
				System.out.println("평균 :" + avg);
			}
		//4. 10 값을 정렬 오름차순
		for (int i=0; i<num.length; i++) {
			for(int j= 0; j<num.length-1; j++) {
				if (num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		System.out.println("정렬:" + Arrays.toString(num));
		}
	}


