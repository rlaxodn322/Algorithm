function solution(sizes) {
    //제일 긴 것.
    //짧은 것 중 제일 긴 것.
    let result = 0;
    let max = 0;
    let min = 0;
    for(let i=0; i<sizes.length; i++){
        let mama = Math.max(sizes[i][0], sizes[i][1]);
        let mimi = Math.min(sizes[i][0], sizes[i][1]);
        max = Math.max(mama, max);
        min = Math.max(mimi, min);
    }
    return max * min;
}