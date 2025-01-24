function solution(n) {
    if(n===1)return 0;
    let arr = new Array(n+1).fill(true);
    arr[0] = arr[1] = false;
    
    for(let i=2; i * i<=n; i++){
    
            for(let j= i * i; j<=n; j+=i){
                arr[j] = false;
            }
     
      
    }
    return arr.filter(Boolean).length;
}