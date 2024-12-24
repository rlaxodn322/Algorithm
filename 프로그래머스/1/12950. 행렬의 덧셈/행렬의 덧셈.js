function solution(arr1, arr2) {
    let arr = [];
    for(let i=0; i<arr1.length; i++){
        let arrr = [];
        for(let j=0; j<arr1[1].length; j++){
            arrr.push(arr1[i][j] + arr2[i][j]);
        }
        arr.push(arrr);
    }
    return arr;
}