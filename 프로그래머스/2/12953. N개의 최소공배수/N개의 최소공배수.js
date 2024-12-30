function gcd(a,b){
    while(b!==0n){
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
function lcm(a, b){
    return (a*b) / gcd(a,b);
}
function solution(arr){
    return arr.reduce((a, b) => lcm(BigInt(a), BigInt(b)), BigInt(arr[0]));
}
