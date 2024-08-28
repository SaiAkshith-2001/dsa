function isPair(arr1, tripletSum) {
  for (let i = 0; i < arr1.length - 2; i++) {
    let l = i + 1;
    let r = arr1.length - 1;
    while (l < r) {
      if (arr1[i] + arr1[l] + arr1[r] === tripletSum) {
        return true;
      } else if (arr1[l] + arr1[r] > tripletSum) {
        r--;
      } else {
        l++;
      }
    }
  }
  return false;
}
let arr1 = [1, 2, 3, 4, 5, 6, 7];
let tripletSum = 18; //true if triplets sum exists
console.log(isPair(arr1, tripletSum));
