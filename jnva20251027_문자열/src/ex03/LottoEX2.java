package ex03;

import java.util.Arrays;

public class LottoEX2 {
    public static void main(String[] args) {
       /* // 1~45 번호를 순서대로 채우기
        int[] lotto = new int[45];
        for (int i = 0; i < 45; i++) {
            lotto[i] = i + 1;
        }

        // Fisher-Yates 셔플 (중복 없는 무작위 섞기)
        for (int i = 0; i < lotto.length; i++) {
            int index = (int)(Math.random() * 45);  // 랜덤 위치 선택
            int tmp = lotto[i];
            lotto[i] = lotto[index];
            lotto[index] = tmp;
        }

        // 앞의 6개가 랜덤 로또 번호
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }*/
        //문자열 배열에 이름 5개 저장 for문으로 한 줄씩 출력
        String [] src = {"홍석","도윤","경택","준혁","철준"};
        for (int i = 0; i < src.length; i++) {
        	System.out.println(src[i]);
        }
        //{"가","가나다","가나","가나다라마"} 중 가장 긴 글자찾아출력
        String [] str = {"가","가나다","가나","가나다라마"};
        String longest = str [0];
        for (int i= 1; i < str.length; i++) {
        	if (str[i].length()>longest.length()) {
        		longest = str[i];
        	}
        }
        System.out.println("가장 긴 이름" + longest);
    }
}
