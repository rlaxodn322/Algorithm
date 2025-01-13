function solution(clothes) {
    let map1 = {};
    clothes.forEach(([a,b]) => {
        map1[b] = (map1[b] || 0) + 1;
    })
    let cnt = Object.values(map1).reduce((a,b) => a * (b+1), 1);
    return cnt -1;
}