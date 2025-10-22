/**
 * 문제 :
 * 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 * <p>
 * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 * <p>
 * MenOfPassion 알고리즘은 다음과 같다.
 * <p>
 * MenOfPassion(A[], n) {
 * sum <- 0;
 * for i <- 1 to n - 2
 * for j <- i + 1 to n - 1
 * for k <- j + 1 to n
 * sum <- sum + A[i] × A[j] × A[k]; # 코드1
 * return sum;
 * }
 * <p>
 * 입력 :
 * 첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
 * <p>
 * 출력 :
 * 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 * <p>
 * <p>
 * <p>
 * 분류 : 수학, 구현, 시뮬레이션
 * 3중 for문 코드 수행 횟수 출력, 일반식, 점화식 계산
 * 입력 n(1 <= n <= 500,000)
 * i => 1 ~ (n-2) ==> O(n)
 * j => (i + 1) ~ (n - 1) ==> O(n) // i==1, j=2,3,4,5,6...(n-1)
 * k => (j + 1) ~ n ==> O(n) // j==2, k=3,4,5,6...n;
 * <p>
 * 분류 : 수학, 구현, 시뮬레이션
 * 3중 for문 코드 수행 횟수 출력, 일반식, 점화식 계산
 * 입력 n(1 <= n <= 500,000)
 * i => 1 ~ (n-2) ==> O(n)
 * j => (i + 1) ~ (n - 1) ==> O(n) // i==1, j=2,3,4,5,6...(n-1)
 * k => (j + 1) ~ n ==> O(n) // j==2, k=3,4,5,6...n;
 * <p>
 * 분류 : 수학, 구현, 시뮬레이션
 * 3중 for문 코드 수행 횟수 출력, 일반식, 점화식 계산
 * 입력 n(1 <= n <= 500,000)
 * i => 1 ~ (n-2) ==> O(n)
 * j => (i + 1) ~ (n - 1) ==> O(n) // i==1, j=2,3,4,5,6...(n-1)
 * k => (j + 1) ~ n ==> O(n) // j==2, k=3,4,5,6...n;
 * <p>
 * 분류 : 수학, 구현, 시뮬레이션
 * 3중 for문 코드 수행 횟수 출력, 일반식, 점화식 계산
 * 입력 n(1 <= n <= 500,000)
 * i => 1 ~ (n-2) ==> O(n)
 * j => (i + 1) ~ (n - 1) ==> O(n) // i==1, j=2,3,4,5,6...(n-1)
 * k => (j + 1) ~ n ==> O(n) // j==2, k=3,4,5,6...n;
 */

/**
 *  분류 : 수학, 구현, 시뮬레이션
 *  3중 for문 코드 수행 횟수 출력, 일반식, 점화식 계산
 *  입력 n(1 <= n <= 500,000)
 *  i => 1 ~ (n-2) ==> O(n)
 *  j => (i + 1) ~ (n - 1) ==> O(n) // i==1, j=2,3,4,5,6...(n-1)
 *  k => (j + 1) ~ n ==> O(n) // j==2, k=3,4,5,6...n;
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long count = (n * (n - 1) * (n - 2)) / 6;

        System.out.println(count);
        System.out.println(3);


    }
}
