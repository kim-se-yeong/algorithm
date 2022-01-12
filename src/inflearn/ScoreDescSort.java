package inflearn;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정렬 함수를 이용하여 학생들의 성적을 1등부터 꼴등까지 순위대로 출력해보시오.
 * 내장된 함수를 사용하면 따로 정렬 알고리즘을 만들지 않아도 된다.
 * 이때, 내림차순으로 정렬한다.
 * 이 문제는 따로 정렬 알고리즘을 구현하지 않고 내장된 정렬 함수를 사용해서 정렬해보는 문제이다.
 */
public class ScoreDescSort {
    
    public static void main(String[] args) {
        /**
         * 내림차순이거나 또는 원하는대로 정렬의 조건을 설정해서 하고자 할 때는 기본형의 배열에는 적용이 안된다.
         * 따라서, 래퍼 클래스로 만들어서 적용해야 한다.
         */
        Integer[] scores = {88, 55, 33, 100, 99, 77, 66};

        System.out.print("화장실(정렬) 들어가기 전 = ");
        for(int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println();
        System.out.print("화장실(정렬) 들어가기 후 = ");
        for (int i : scores) {
            System.out.print(i + " ");
        }

    }
}
