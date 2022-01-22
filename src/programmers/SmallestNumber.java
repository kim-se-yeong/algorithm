package programmers;

/**
 * 정수를 저장한 배열, arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우에 배열을 -1을 채워 리턴하세요.
 * 예를 들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴하고, [10]이면 [-1]을 리턴 합니다.
 */
public class SmallestNumber {
    
    public static void main(String[] args) {
        
        int[] arr = {4,3,2,1};
        int[] answer = new int[arr.length - 1];

        if (arr.length == 1) {
            answer[0] = -1;
        }

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (smallest == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }
        }
    }
}
