package ex02;

import java.util.Arrays;

public class ArrayEx5 {

    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numArr = {90, 80, 70, 60, 50}; // numArr의 5칸짜리 배열

        System.out.println("Old numArr 길이: " + numArr.length);
        System.out.println(Arrays.toString(numArr));

        // 배열을 10칸으로 확장
        int[] temp = new int[10];
                        //old   how new          몇까지할지    
        System.arraycopy(numArr, 0, temp, 0, numArr.length);  // 
                                                //범위를 정하면 수정이 어려우니 length쓴다
        numArr = temp;  // ✅ numArr이 새로운 배열(10칸)을 가리키도록 변경

        System.out.println("New numArr 길이: " + numArr.length);
        System.out.println(Arrays.toString(numArr));
    }
}
