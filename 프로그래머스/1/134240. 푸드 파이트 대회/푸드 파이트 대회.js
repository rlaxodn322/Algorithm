function solution(food) {
    let left = "";
    for(let i=1; i<food.length; i++){
        left += i.toString().repeat(Math.floor(food[i]/2));
    }
    return left + "0" + [...left].reverse().join('');    
}