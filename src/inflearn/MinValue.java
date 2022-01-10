package inflearn;
/**
 * 정수로 이루어진 배열에서 가장 작은 값을 구하는 최솟값 알고리즘을 구현해보시오.
 * 이 문제는 배열 내 정수 값들에서 최솟값을 구하는 알고리즘에 대해서 아는지를 묻는 문제이다.
 * 주어진 값 : [4, 13, 150, 17, -2]
 */
public class MinValue {
    public static void main(String[] args) {
        
        int[] arr = {4, 13, 150, 17, -2};
        
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }    
}