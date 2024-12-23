function solution(k, tangerine) {
    let targetSize ={};
    tangerine.forEach(size => {
        targetSize[size] =  (targetSize[size]||0) +1;
    })
    
    sortedSize = Object.values(targetSize).sort((a,b) => b-a);
    let cnt =0;
    let result = 0;
    for(let size of sortedSize){
        cnt+=size;
        result++;
        if(cnt>=k){
            break;
        }
    }
    return result;
}