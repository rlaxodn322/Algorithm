function solution(cards1, cards2, goal) {
    let a = 0;
    let b = 0;
    for(let word of goal){
        if(a<cards1.length && cards1[a]===word){
            a++;
        }else if(b<cards2.length && cards2[b] ===word){
            b++;
        }else{
            return "No";
        }
    }
    return "Yes";
}