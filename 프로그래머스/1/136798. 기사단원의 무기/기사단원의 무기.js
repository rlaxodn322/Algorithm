function solution(number, limit, power) {
    let result = 0;
    for(let i=1; i<=number; i++){
        let cnt = 0;
        for(let j=1; j<=Math.sqrt(i); j++){
            if(i%j ===0){
                cnt++;
                if(j !== Math.floor(i/j))cnt++;
            }
        }
        if(cnt > limit){
            result += power;
        }else{
            result += cnt;
        }
    }
    return result;
}