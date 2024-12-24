function solution(d, budget) {
    let arr = d.sort((a,b) => a-b);
    let sum = 0;
    let cnt = 0;
    for(let i=0; i<d.length; i++){
        sum+=d[i];
        if(sum<=budget){
            cnt++;
        }else{
            break;
        }
    }
    return cnt;
}