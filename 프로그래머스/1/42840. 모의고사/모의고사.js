function solution(answers) {
    const patterns = [
        [1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]
    ];
    const scores = [0, 0, 0];
  
    answers.forEach((answer, index) => {
        patterns.forEach((pattern, i) => {
            if(answer === pattern[index % pattern.length])scores[i]++;
        })
    })
    let max = Math.max(...scores);
    return scores.map((socre, index) => socre===max? index+1 : null).filter(v => v!==null);
}