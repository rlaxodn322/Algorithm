function solution(n) {
    if(n===1) return 0;
    let arr = new Array(n+1).fill(1);
    arr[0] = arr[1] = 0;
    for(let i=2; i * i <= n; i++){
        for(let j= i*i; j<=n; j+=i){
            arr[j] = 0;
        }
    }
    return arr.filter(value => value ===1).length;
}