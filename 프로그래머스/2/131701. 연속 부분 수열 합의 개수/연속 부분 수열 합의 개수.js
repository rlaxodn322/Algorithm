function solution(elements) {
    let arr = new Set();
    let n = elements.length;
    let ele = elements.concat(elements);
    
    for(let i=1; i<=n; i++){
        for(let j=0; j<n; j++){
            let sum = 0;
            for(let k=j; k<i+j; k++){
                sum+= ele[k];
            }
            arr.add(sum);
        }
    }
    return arr.size;
}