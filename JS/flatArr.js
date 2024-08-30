const arr = [1, 2, 3, { key: "pair" }, [4, [5, 6]], 7, 8, "RDJ", "", true];
const flatArray = (arr, flattendArr) => {
  for (let i = 0; i < arr.length; i++) {
    if (Array.isArray(arr[i])) {
      flatArray(arr[i], arr);
    } else {
      flattendArr.push(arr[i]);
    }
  }
  return flattendArr;
};
console.log(flatArray(arr, []));
