function solution(s) {
    let result = [];
    let stack = {};
    
    for(let i=0; i<s.length; i++){
        let char = s[i];
        if(stack[char]!== undefined){
            result.push(i- stack[char]);
        }else{
            result.push(-1);
        }
        stack[char] = i;
    }
    return result;

}