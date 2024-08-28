//shallow copy vs deep copy (clones)
//primitive type are call by value such as number,boolean,string,bigint,undefined,symbol
//structural or object type are call by reference such as array,object,functions etc...

let x1 = 10;
let y1 = x1;
y1 += 1;
console.log(y1);
console.log(x1);

let xArr = [1, 2, 3, 4, 5];
let yArr = xArr;
yArr.push(6);
console.log(yArr);
console.log(xArr === yArr); //refers to same address

//mutable vs immutable
//primitives are immutable
let favActor = "RDJ";
favActor[0] = "T";
console.log(favActor);

favActor = "Tom Cruise"; //this is reassignment not same as mutable
console.log(favActor);
//structure data contain mutable data
yArr[0] = 0;
console.log(yArr);
//pure functions and impure functions
