function thirdMax(nums) {
  let first = null, second = null, third = null;

  for (const num of nums) {
    if (num === first || num === second || num === third) continue; // only distinct values count

    if (first === null || num > first) {
      third = second;
      second = first;
      first = num;
    } else if (second === null || num > second) {
      third = second;
      second = num;
    } else if (third === null || num > third) {
      third = num;
    }
  }
  return third !== null ? third : first;
}

console.log(thirdMax([3, 2, 1]));     // 1
console.log(thirdMax([1, 2]));        // 2
console.log(thirdMax([2, 2, 3, 1]));  // 1

module.exports = { thirdMax };
