function solution(s) {
    const trans = s.split(' ').map(words => {
        return words.split('').map((char, index)=> {
            return index %2 ===0 ? char.toUpperCase(): char.toLowerCase();
        }).join('');
    })
    return trans.join(' ');
}