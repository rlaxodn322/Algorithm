function solution(A,B){
    let up = A.sort((a,b) => a-b);
    let down = B.sort((a,b) => b-a);
    let sum = 0;
    for(let i=0; i<up.length; i++){
        sum += up[i] * down[i];
    }
    return sum;
}