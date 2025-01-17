function solution(priorities, location) {
    let queue = priorities.map((pri, index) => ({pri, index}));
    let cnt = 0;
    while(queue.length > 0){
        let pro = queue.shift();
        if(queue.some(p => p.pri > pro.pri))queue.push(pro);
        else{
            cnt++;
            if(pro.index===location)return cnt;
        }
    }
}