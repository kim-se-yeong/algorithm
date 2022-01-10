package inflearn;

/**
 * 랜덤으로 정수 10개의 값을 갖는 배열을 만들어 최댓값과 최솟값을 같이 출력해보시오.
 * 이때, 랜덤 정수 값은 0~9 사이로 한다.
 * 이 문제는 랜덤 숫자 생성과 최댓값, 최솟값 알고리즘을 다 같이 사용할 수 있는지를 묻는 문제이다.
 */
public class MinMaxValue {
    
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
            System.out.println();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            int value = arr[i];
            if (max < value) max = value;
            if (min > value) min = value;
        }

        System.out.println("배열 내 최댓값: " + max);
        System.out.println("배열 내 최솟값: " + min);
    }
}
