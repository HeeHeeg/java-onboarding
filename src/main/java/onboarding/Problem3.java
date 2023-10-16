package onboarding;


import java.util.Scanner;

/**
 * ### 기능 구현 목록
 * - 데이터 유효성 검사
 *   - 0, 10000이상의 수, 소수가 들어가지 않는다.
 * - 숫자 number가 매개변수로 주어지는 기능.
 * - 1부터 매개변수까지 돌며 3, 6, 9의 개수를 count하여 횟수 리턴 기능.
 */
public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for (int i = number; i <= number; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                answer += 1;
            }else {

            }

        }
        return answer;

    }
}
