function solution(cacheSize, cities) {
    let cnt =0;
    let cache = new Map();
    cities.forEach(city => {
        city = city.toLowerCase();
        if(cache.has(city)){
            cnt+=1;
            cache.delete(city);
            cache.set(city);
        }else{
            cnt+=5;
            if(cacheSize<=cache.size)cache.delete(Array.from(cache.keys())[0]);
            if(cacheSize>0)cache.set(city);
        }
    })
    return cnt;
}
