function solution(elements) {
    let arr = new Set();
    let n = elements.length;
    let ele = elements.concat(elements);
    
    for(let i=0; i<n; i++){
        let sum =0;
        for(let j=0;  j<n; j++){
            sum+= ele[i+j];
            arr.add(sum);
        }
    }
    return arr.size;
}