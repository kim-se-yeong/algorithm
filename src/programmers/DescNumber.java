package programmers;

import java.util.Arrays;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class DescNumber {
    
    public static void main(String[] args) {
        
        long num = 118372;

        String[] arr = String.valueOf(num).split("");

        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for (String a : arr) {
            sb.append(a);
        }
        System.out.println(Long.valueOf(sb.reverse().toString()));
    }
}
