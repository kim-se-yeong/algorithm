package inflearn;

/**
 * 배열내 숫자들의 각 빈도 수를 출력하는 코드를 구현하시오.
 * [1, 3, 2, 2, 1, 3, 1, 1] 각 숫자 별 빈도 수는?
 * 이 문제는 자격증 관련 코딩 문제에서 많이 나오는 유형의 패턴으로써 자격증 외에서도 많이 쓰이는 패턴이다.
 * 굉장히 많이 나오는 단골 패턴이므로 잘 숙지하고 여러번 타이핑 치면서 반복 연습을 해야만 한다.
 * 문제가 “반장 선거의 득표 수” 등으로 나오기도 한다. 
 */
public class Frequency {
    
    public static void main(String[] args) {
        
        int[] numbers = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};
        int[] arr = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번 숫자 --> " + arr[i]);
        }
    }
}