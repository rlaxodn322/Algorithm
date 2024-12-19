function solution(s){
    let stack = [];
    for(let a of s){
        if(a==='('){
            stack.push(a);
        }else{
            if(stack.length===0){
                return false;
            }
            stack.pop();
        }
    }
    return stack.length===0? true: false;
}