package programmers;
/**
 * 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
 * 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
 * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
 * 단, 금액이 부족하지 않으면 0을 return 하세요.
 */
public class InsufficientAmount {
    
    public static void main(String[] args) {
        
        int price = 3; //놀이기구 원래 이용료
        int money = 20; //보유하고 있는 금액
        int count = 4; //놀이기구 이용 횟수

        // int 형의 곱을 반복하다 보면 int의 범위를 넘어서는 경우가 있고 이때 엉뚱한 값이 발생한다.
        long sum = 0; //총 count만큼 놀이기구를 이용했을 때 금액
        long answer = -1;
        for (int i = 1; i <= count; i++) {
            sum += (i * price);
        }
        if (sum <= money) answer = 0;
        else answer = sum - money;

        System.out.println(answer);
    }
}
