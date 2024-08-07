function isPair(arr1, twoSum) {
  for (let i = 0; i < arr1.length; i++) {
    let l = 0; //left pointer
    let r = arr1.length - 1; //right pointer
    while (l < r) {
      if (arr1[l] + arr1[r] === twoSum) {
        return true;
      } else if (arr1[l] + arr1[r] > twoSum) {
        r--;
      } else {
        l++;
      }
    }
  }
  return false;
}
let arr1 = [1, 2, 3, 4, 5, 6, 7];
let twoSum = 9; //true if two sum exists
console.log(isPair(arr1, twoSum));
