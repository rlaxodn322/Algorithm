function solution(array, commands) {
    let result = [];
    commands.forEach(command => {
        const [i, j, k] = command;
        const sliceArr = array.slice(i-1, j);
        const sortArr = sliceArr.sort((a,b) => a-b);
        result.push(sortArr[k-1]);
    })
    return result;
}