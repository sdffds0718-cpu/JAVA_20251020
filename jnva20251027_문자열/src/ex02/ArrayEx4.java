package ex02;

import java.util.Arrays;

public class ArrayEx4 {

    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numArr = {90, 80, 70, 60, 50}; //numArr의 5평짜리집

  
        System.out.println("Old numArr 길이: " + numArr.length);
        System.out.println(Arrays.toString(numArr));

        // 배열을 10칸으로 확장
        int[] temp = new int[10]; // 1. 새 배열 생성 새집 temp의 10평짜리 신축공사
        for (int i = 0; i < numArr.length; i++) {
            temp[i] = numArr[i];   // temp[i] = numArr[i]
        }

        numArr = temp; // 참조 변경 → numArr이 새 배열을 가리킴
        System.out.println("새로운 numArr 길이: " + numArr.length);
    // 배열은 원칙적으로 변경이 안되기때문에 temp 라는 새로운 공간을 만들어서
        //옮기는 작업이 들어가야함
        // 그 방법은 temp로 먼저 크기 정해주고,
        // temp[i] = numArr[i] 이라고 지정해주고
        // numArr = temp 라고 참조까지 바꿔주면 끝. 
   
        // 하지만 배열 복사는 종종 있는 일인데 너무 번잡하다
    // System.arraycopy 라는 것을 쓴다
        
        
    }
}
