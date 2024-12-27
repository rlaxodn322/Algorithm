function solution(a, b, n) {
    let sum = 0;
    while(n >= a){
        let mid = Math.floor(n / a) * b;
        sum += mid;
        n = (n%a) + mid;
    }
    return sum;
}