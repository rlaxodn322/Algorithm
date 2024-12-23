function solution(s) {
    if(s.length !==4 && s.length !== 6){
        return false;
    }
    
    for(let char of s){
        if(isNaN(char) || char=== ' '){
            return false;
        }
    }
    return true;
}