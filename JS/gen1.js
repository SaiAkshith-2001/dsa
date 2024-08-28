let sides = [1, 2, 3, 4, 5];
Array.prototype.myCalculate = function (logic) {
  let op = [];
  for (let i = 0; i < this.length; i++) {
    op.push(logic(this[i]));
  }
  return op;
};
const perimeterSquare = (side) => {
  return 4 * side;
};
const result = sides.myCalculate(perimeterSquare);
console.log(result);
