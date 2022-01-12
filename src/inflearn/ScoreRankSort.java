package inflearn;

/**
 * 학생들의 성적을 1등부터 순위를 매겨서 출력해보시오.
 * 이 문제는 순위(Ranking) 알고리즘에 대해서 알고 있는지를 묻는 문제이다.
 */
public class ScoreRankSort {
    
    public static void main(String[] args) {

        int[] scores = {88, 50, 38, 100, 90, 100, 99, 65};
        int[] ranks = new int[scores.length];

        System.out.println("총 8명 학생의 성적과 등수는?");
        for(int i = 0; i < scores.length; i++) {
            ranks[i] = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    ranks[i]++;
                }
            }
            System.out.println(scores[i] + "점: " + ranks[i] + "등");
        }
    }
}
