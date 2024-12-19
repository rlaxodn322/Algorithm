function solution(n) {
    let count = 0;
    let sum = 0;

    for (let start = 1; start <= n; start++) {
        sum = 0; // 연속된 합 초기화
        for (let num = start; num <= n; num++) {
            sum += num; // 연속된 숫자 더하기
            if (sum === n) {
                count++; // 조건을 만족하면 카운트 증가
                break; // 더 이상 탐색할 필요 없음
            } else if (sum > n) {
                break; // n을 초과하면 반복 종료
            }
        }
    }

    return count;
}
