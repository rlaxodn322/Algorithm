function solution(want, number, discount) {
    let cnt = 0;
    const wantMap = new Map();
    for(let i=0; i<want.length; i++){
        wantMap.set(want[i], number[i]);
    }
    for(let i=0; i<=discount.length -10; i++){
        const discountMap = new Map();
        for(let j=i; j<i+10; j++){
            discountMap.set(discount[j], (discountMap.get(discount[j])|| 0) + 1 );
        }
        let tt = true;
        for(let [key, value] of wantMap){
            if(discountMap.get(key) !== value){
                tt = false;
                break;
            }
        }
        if(tt){
            cnt++;
        }
        
    }
    return cnt;
}