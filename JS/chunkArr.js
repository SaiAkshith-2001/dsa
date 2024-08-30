const fun = (arr, chunkSize) => {
  let result = [];
  let miniArray = [];
  for (let i = 0; i < arr.length; i++) {
    miniArray.push(arr[i]);
    if (miniArray.length === chunkSize || i === arr.length - 1) {
      result.push([...miniArray]);
      miniArray = [];
    }
  }
  return result;
};
let arr = [1, 2, 3, 4, 5];
console.log(fun(arr, 1));
console.log(fun(arr, 2));
console.log(fun(arr, 3));
console.log(fun(arr, 4));
console.log(fun(arr, 5));
