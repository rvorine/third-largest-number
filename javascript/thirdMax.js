function thirdMax(nums) {
  // JS has no Long; -Infinity is the equivalent "smaller than any input" sentinel
  let first = -Infinity, second = -Infinity, third = -Infinity;

  for (const num of nums) {
    if (num === first || num === second || num === third) continue; // only distinct values count

    if (num > first) {
      third = second;
      second = first;
      first = num;
    } else if (num > second) {
      third = second;
      second = num;
    } else if (num > third) {
      third = num;
    }
  }
  return third === -Infinity ? first : third;
}

console.log(thirdMax([3, 2, 1]));     // 1
console.log(thirdMax([1, 2]));        // 2
console.log(thirdMax([2, 2, 3, 1]));  // 1

module.exports = { thirdMax };
