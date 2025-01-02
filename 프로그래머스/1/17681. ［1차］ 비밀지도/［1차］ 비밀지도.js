function solution(n, arr1, arr2) {
    var answer = [];
    for(let i=0; i<n; i++){
        let binary = (arr1[i]|arr2[i]).toString(2);
        binary = binary.padStart(n, '0');
        let a = '';
        for(let j=0; j<n; j++){
            if(binary[j]==='1'){
                a+='#';
            }else{
                a+=' ';
            }
        }
        answer.push(a);
    }
    
    
    return answer;
}