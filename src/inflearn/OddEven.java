package inflearn;

/**
 * 홀수, 짝수 구하기 문제를 while 반복문과 continue를 사용하여 구현해보시오.
 * 1~30까지의 수에서 짝수만 출력하시오.
 * 이 문제는 while 반복문과 그 안에서 continue 키워드의 역할과 사용법을 아는지 묻는 문제이다.
 */
public class OddEven {
    public static void main(String[] args) {
        
        int num = 1;

        while(num <= 30) {
            if (num % 2 != 0) {
                num++;
                continue;
            }
            System.out.print(num + " ");
            num++;
        }
    }
}