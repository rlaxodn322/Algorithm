function solution(s) {
    let count = 0;
    let zerocount =0;
    
    while(s!=='1'){
        let newString = s.replace(/0/g,'');
        zerocount += s.length - newString.length;
        s = newString.length.toString(2);
        count++;
    }
    return [count, zerocount];
}
