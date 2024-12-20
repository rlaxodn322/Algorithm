function solution(n) {
    let a = 0;
    let b = 1;
    let f = 1234567;
    for(let i=2; i<=n; i++){
        let sum = (a + b) % f;
        a = b;
        b = sum;
    }
    return b;
}