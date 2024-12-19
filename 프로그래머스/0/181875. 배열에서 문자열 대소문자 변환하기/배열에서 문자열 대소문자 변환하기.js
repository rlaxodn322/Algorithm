function solution(strArr) {
    var answer = strArr.map((str, array)=> {
        if(array%2===0){
            return str.toLowerCase();
        }else{
            return str.toUpperCase();
        }
    });
    return answer;
}