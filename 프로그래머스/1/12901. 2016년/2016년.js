function solution(a, b) {
    const month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    const day = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    let today = 5;
    for(let i=1; i<a; i++){
        today += month[i];
    }
    
    today += b - 1;
    let result = today % 7;
    return day[result];
    
}