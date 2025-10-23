/**
 * title : 블랙잭
 * 문제 : 카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
 * <p>
 * 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
 * <p>
 * 김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
 * <p>
 * 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 * <p>
 * N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 * <p>
 * 입력 :
 * 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
 * <p>
 * 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
 * <p>
 * 출력 :
 * 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
 * <p>
 * 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
 * <p>
 * ====================================
 * 카드 3장의 합이 21을 넘지 않고, 카드의 합을 최대한 크게 만들기
 * n장의 카드 중에 3장을 고른다 -> 조합 nC3 -> 경우의 수를 찾는 문제는 아니므로 패스
 * 임의의 숫자 M과 최대한 가까이
 * N(3 <= N <= 100), M(10 <= M <= 300,000)
 * 카드의 수(1 <= 카드의 수 <= 100,000)
 * N장의 카드에 대한 배열 만들기
 * n장의 카드 중에 3장을 고르는 워스트 케이스 -> 100,000C3 -> O(n^3)
 * (M - n장의 카드 중 3장을 합해서 만들 수 있는 모든 값)을 x라고 했을 때,
 * x == 0 이면 중단, 서로 다른 카드니까 중복은 없다
 * 계산 도중에 x < 0이면 중단, ex) 카드 한 장 또는 두 장째 합이 M보다 큰 경우
 * -> 불필요한 연산을 줄이기 위함
 * 제일 0에 가까운 카드 3장을 저장
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N장의 카드
        int M = Integer.parseInt(st.nextToken()); // 카드의 합 M

        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        int minSum = M;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == M) {
                        System.out.println(sum);
                        return;
                    } else if ((M - sum) > 0 && (M - sum) < minSum) {
                        minSum = M - sum;
                        ans = sum;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
