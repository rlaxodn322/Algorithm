function solution(n, m) {
    //최대공약수
    function gcd(a, b){
        return b===0? a:gcd(b,a%b);
    }
    //최소공배수
    function lcm(a, b){
        return (a*b) / gcd(a, b);
    }
    return [gcd(n,m), lcm(n,m)];
}