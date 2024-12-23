function solution(s) {
    let str = s.split('');
    str.reverse().sort((a,b) => {
        if(a>b)return -1;
        if(a<b) return 1;
        return 0;
    });

    return str.join('');
}