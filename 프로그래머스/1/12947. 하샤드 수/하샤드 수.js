function solution(x) {
     let a = x.toString().split('').reduce((a,b) => a + parseInt(b) , 0);
     if(x%a===0){
         return true;
     }else{
         return false;
     }
}