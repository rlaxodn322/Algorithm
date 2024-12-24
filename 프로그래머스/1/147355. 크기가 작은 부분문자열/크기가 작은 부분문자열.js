function solution(t, p) {
    let plength = p.length;
    let tlength = t.length;
    let count = 0;
    for(let i=0; i<=tlength-plength; i++){
        let subString = t.substring(i, i+plength);
        if(+p >= +subString){
            count++;
        }
    }
    return count;
}