function solution(arr1, arr2) {
    let leng = arr1.length;
    let arrleng = arr1[0].length;
    let arrleng2 = arr2[0].length;
    const arr = Array.from({length:leng}, ()=> Array(arrleng2).fill(0));
    
    for(let i=0; i<leng; i++){
        for(let j=0; j<arrleng2; j++){
            for(let k=0; k<arrleng; k++){
                arr[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }
    return arr;
}