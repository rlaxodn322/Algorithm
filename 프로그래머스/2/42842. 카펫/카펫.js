function solution(brown, yellow) {
    const sum = brown + yellow;
    for(let x= 3; x<= Math.sqrt(sum); x++){
        if(sum % x === 0){
            let y = sum / x;
            if((x+y)*2 -4 ===brown){
                return [y,x];
            }
        }
    }
}