package programmers;

/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6 을 return 하면 됩니다.
 */
public class Digits {
    
    public static void main(String[] args) {
        
        /**
         * 효율성 떨어짐, 다른 방법으로 다시 풀기
         */
        int num = 123;
        String[] arr = String.valueOf(num).split("");
        
        int result = 0;
        for (String n : arr) {
            result += Integer.parseInt(n);
        }

        System.out.println(result);
    }
}
