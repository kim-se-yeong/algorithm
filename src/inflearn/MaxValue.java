package inflearn;
/**
 * 정수로 이루어진 배열에서 가장 큰 값을 구하는 최댓값 알고리즘을 구현해보시오.
 * 이 문제는 배열 내 정수 값들에서 최댓값을 구하는 알고리즘에 대해서 아는지를 묻는 문제이다.
 * 주어진 값 : [4, 13, 150, 17, -2]
 */

public class MaxValue {
    
    public static void main(String[] args) {
        
        int[] arr = {4, 13, 150, 17, -2};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
