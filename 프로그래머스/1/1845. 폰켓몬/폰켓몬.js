function solution(nums) {
    const unique = new Set(nums);
    const max = nums.length /2;
    return Math.min(unique.size, max);
}