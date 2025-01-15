function solution(citations) {
    let a = citations.sort((a,b) => b-a);
    let cnt = 0;
    for(let i=0; i<citations.length; i++){
        if(a[i]>=i+1)cnt=i+1;
        else break;
    }
    return cnt;
}