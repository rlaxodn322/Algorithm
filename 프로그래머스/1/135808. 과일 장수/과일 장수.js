function solution(k, m, score) {
    score.sort((a,b) => b-a);
    let cnt = 0;
    for(let i=0; i<score.length; i+=m){
        if(i+m <=score.length){
            let a = score.slice(i, i+m);
            let min = a[m-1];
            cnt += min * m;
        }
    }
    return cnt;
}