function solution(arr1, arr2) {
    let a = [];
    for(let i=0; i<arr1.length; i++){
        let b = [];
        for(let j=0; j<arr1[i].length; j++){
            b.push(arr1[i][j] + arr2[i][j]);
        }
        a.push(b);
    }
    return a;
}