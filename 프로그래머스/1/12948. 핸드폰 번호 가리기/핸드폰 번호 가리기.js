function solution(phone_number) {
    let arr = phone_number.split('');
    for(let i=0; i<arr.length-4; i++){
        arr[i] = '*';
    }
    let arr2 = arr.join('');
    return arr2;
}