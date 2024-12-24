function solution(t, p) {
    let tlength = t.length;
    let plength = p.length;
    let tNumber=  parseInt(t, 10);
    let pNumber = parseInt(p, 10);
    let cnt = 0;
    for(let i=0; i<=tlength - plength; i++){
        let subStr = t.substring(i, i+plength);
        let subString = parseInt(subStr, 10);
        
        if(subString <= pNumber) cnt++;
    }
    return cnt;
}