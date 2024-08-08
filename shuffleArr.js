function shuffleArr(arr1) {
  let temp = new Array(arr1.length);
  let l = 0;
  let r = arr1.length - 1;
  let flag = true;
  for (let i = 0; i < arr1.length; i++) {
    if (flag) {
      temp[i] = arr1[r--];
    } else {
      temp[i] = arr1[l++];
    }
    flag = !flag;
  }
  for (let i = 0; i < arr1.length; i++) {
    arr1[i] = temp[i];
  }
  return arr1;
}
let arr1 = [1, 2, 3, 4, 5, 6, 7];
console.log(shuffleArr(arr1));
