function solution(name, yearning, photo) {
    let answer = [];
    const nameMap = new Map();
    
    for(let i=0; i<name.length; i++) nameMap.set(name[i],yearning[i]);
    for(let i=0; i<photo.length; i++){
        let cnt = 0;
        for(let j=0; j<photo[i].length; j++){
            if(nameMap.has(photo[i][j]))cnt+= nameMap.get(photo[i][j]);
        }
        answer.push(cnt);
    }
    return answer;
}