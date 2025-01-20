function solution(k, score) {
    let arr = [];
    let result = [];
    
    for(let i=0; i<score.length; i++){
        if(k>arr.length)arr.push(score[i]);
        else{
            if(score[i]> Math.min(...arr)){
                let min = arr.indexOf(Math.min(...arr));
                arr[min] = score[i];
            }
        }
        result.push(Math.min(...arr));
    }
    return result;
}