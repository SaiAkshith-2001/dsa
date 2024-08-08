let details = {
  firstName: "Tony",
  lastName: "Stark",
};

function fun(Character) {
  console.log(this.firstName + " " + this.lastName + " aka " + Character);
}

fun.call(details, "I'm Iron man!"); //function borrowing 1st arg as obj reference and rest are varaiables
fun.apply(details, ["Iron man"]); //second arg as an array
//unlike call, bind method it returns a fun and we can use it later

let displayDetails = fun.bind(details, "I'm Iron man!");
displayDetails();

//fun currying can be done in two ways

// 1)by using bind method
let multiply = function (x, y) {
  console.log(x * y);
};
let multiplyByTwo = multiply.bind(this, 2);
multiplyByTwo(10);
let multiplyByTen = multiply.bind(this, 10);
multiplyByTen(10);

// 2)by using closures

let multiplyByClosure = function (x) {
  return function (y) {
    console.log(x * y);
  };
};
let res = multiplyByClosure(20); //we can avoid bind method and directly pass args
res(7);
