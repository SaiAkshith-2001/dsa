//call, apply, bind
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
// A bound function in JavaScript is a function that has been created using the bind() method
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
//multiplyByClosure(20)(10);

//debounce
const debounce = (fn, delay) => {
  let timer;
  return function (...args) {
    clearTimeout(timer);
    timer = setTimeout(() => {
      fn.apply(this, args);
    }, delay);
  };
};

//throttle
const throttle = (fn, delay) => {
  let timer = null;
  return function () {
    if (timer !== undefined) {
    }
  };
};

// Benefits of event delegation:
// 1) improves memory space
// 2) mitigates risk of performance bottle neck
// 3) Dom manipulation
// 4) when elements get added dynamically, the process of adding events is slow
// Limitations:
// 1) All the events are not bubbled up, some events like blur, focus are not bubbled up
// 2) if e.stopPropogation is used in child, then events are not bubbled up

//HOF i.e.,  Higher Order Function are  functions that take other functions as arguments or return functions as output e.g map,callback functions etc...
