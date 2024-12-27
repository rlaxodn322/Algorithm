function solution(s) {
    const numberWords = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];    
    let sum = "";
    let result = "";
    for(let i=0; i<s.length; i++){
        let char = s[i];
        if(!isNaN(char)){
            sum += char;
        }else{
            result += char;
            if(numberWords.includes(result)){
                sum += numberWords.indexOf(result);
                result= "";
            }
        }
    }
    return parseInt(sum, 10);
}