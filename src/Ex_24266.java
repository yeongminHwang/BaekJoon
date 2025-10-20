/**
 * title : 알고리즘 수업 - 알고리즘의 수행 시간 5
 * 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 * <p>
 * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 * <p>
 * MenOfPassion 알고리즘은 다음과 같다.
 * ============
 * MenOfPassion(A[], n) {
 * sum <- 0;
 * for i <- 1 to n
 * for j <- 1 to n
 * for k <- 1 to n
 * sum <- sum + A[i] × A[j] × A[k]; # 코드1
 * return sum;
 * }
 * ============
 * <p>
 * 입력 : 첫째 줄에 입력의 크기 n( 1<= n <= 500,000)이 주어진다.
 * 출력 :
 * - 첫째 줄에 코드 1의 수행 횟수를 출력한다.
 * - 둘째 줄에 코드 1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다.
 * 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 * <p>
 * 3중 for문 내 코드 수행 횟수 분석
 * 코드 1 최대 수행 횟수 : 500,000 ^ 3;
 * 코드 1 최소 수행 횟수 : 1 ^ 3;
 * <p>
 * 다항식으로 나타낼 수 없는 경우는 뭔가..?
 * -> 조건 해당 없다. n의 크기가 변하지 않음.
 * <p>
 * 3중 for문 내 코드 수행 횟수 분석
 * 코드 1 최대 수행 횟수 : 500,000 ^ 3;
 * 코드 1 최소 수행 횟수 : 1 ^ 3;
 * <p>
 * 다항식으로 나타낼 수 없는 경우는 뭔가..?
 * -> 조건 해당 없다. n의 크기가 변하지 않음.
 */

/**
 *  3중 for문 내 코드 수행 횟수 분석
 *  코드 1 최대 수행 횟수 : 500,000 ^ 3;
 *  코드 1 최소 수행 횟수 : 1 ^ 3;
 *
 *  다항식으로 나타낼 수 없는 경우는 뭔가..?
 *  -> 조건 해당 없다. n의 크기가 변하지 않음.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 너무 큰 long 값을 double 형으로 표현시 오차범위가 존재한다.
        // Math.pow는 double형을 리턴하고, double형은 부동소수점을 사용하기 때문에 오차범위가 발생할 수 있다.
//        long count = (long) Math.pow(n, 3);
        long count = n * n * n;
        System.out.println(count);
        System.out.println(3);

    }
}
