package inflearn;

import java.util.Arrays;

/**
 * 정렬함수를 이용하여 학생들의 성적을 꼴등부터 1등까지 순위대로 출력해보시오.
 * 내장된 함수를 사용하면 따로 정렬 알고리즘을 만들지 않아도 된다.
 * 이때, 오름차순으로 정렬한다.
 * 이 문제는 따로 정렬 알고리즘을 구현하지 않고 내장된 정렬 함수를 사용해서 정렬해보는 문제이다.
 * 주어진 값 : [88, 50, 38, 100, 90, 100, 99, 65]
 */
public class ScoreSort {
    public static void main(String[] args) {

        int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};

        System.out.print("화장실(정렬) 들어가기 전 = ");
        for (int i=0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        Arrays.sort(scores);

        System.out.println();
        System.out.print("화장실(정렬) 들어가기 후 = ");
        for (int i=0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}