package clear.d0207;

/*
배열 만들기 1

문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ n ≤ 1,000,000
1 ≤ k ≤ min(1,000, n)
입출력 예
n	k	result
10	3	[3, 6, 9]
15	5	[5, 10, 15]
입출력 예 설명
입출력 예 #1

1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
입출력 예 #2

1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.
 */

public class Lv0_68 {
    public int[] solution(int n, int k) {
    	int[] answer = new int[n/k];   // 크기는 1~n까지 k의 배수이므로 n/k
    	int idx = 0;
    	for (int i = 1; i <= n; i++) { // 1~n까지 반복
			if(i%k==0) answer[idx++] += i; // k의 배수이면 answer에 값 저장 하고 index+1
		} // for i
        return answer;
    }
}

// 내용 요약 : 1~n 정수에서 k의 배수를 오름차순으로 저장한 배열 리턴



