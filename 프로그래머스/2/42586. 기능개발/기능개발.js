function solution(progresses, speeds) {
    let answer = [];
    let pro = progresses.map((progress,index)=> Math.ceil((100- progress)/speeds[index]));
    let max = pro[0];
    let cnt = 1;
    for(let i=1; i<pro.length; i++){
        if(max>=pro[i])cnt++;
        else{
            answer.push(cnt);
            cnt =1;
            max = pro[i];
        }
    }
    answer.push(cnt);
    return answer;
}