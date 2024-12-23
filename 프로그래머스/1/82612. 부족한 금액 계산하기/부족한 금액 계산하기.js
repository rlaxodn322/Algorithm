function solution(price, money, count) {
    let sum =0;
    for(let i=1; i<=count; i++){
        sum += price*i;
    }
    let a = sum - money;
    return a > 0 ? a : 0;
}