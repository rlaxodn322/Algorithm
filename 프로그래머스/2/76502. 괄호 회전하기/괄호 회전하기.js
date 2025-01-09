function stack(s){
    let stack = [];
    let map = {'(':')', '{':'}', '[':']'};
    for(let i=0; i<s.length; i++){
        if(s[i]==='('|| s[i] ==='{' || s[i]==='[')stack.push(s[i]);
        else{
            let a = stack.pop();
            if(s[i] !== map[a])return false;

        }
    }
    return stack.length===0;
}
function solution(s){
    let cnt = 0;
    for(let i=0; i<s.length; i++){
        const sslice = s.slice(i) + s.slice(0, i);
        if(stack(sslice)){
            cnt++;
        }
    }
    return cnt;
}