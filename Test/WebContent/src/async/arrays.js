///////////////////////// ARRAY Test 1 ////////////////////////
var array = ['a','b','c'];

console.log("Is array an Array? - " + Array.isArray(array));
//Arrays work like Stack - supporting push and pop operations (from the last)
console.log(" Pushing d, now the length is - " + array.push('d'));
console.log("Now the array is - " + array);
console.log("Popping - " + array.pop());
console.log("Now the array is - " + array);

// Arrays have shift() and unshift() also, to support operations from the start

console.log("Length of the array after unshift() - " + array.unshift('1'));
console.log("Now the array is - " + array);
console.log("shifting - " + array.shift());
console.log("finally the array is - " + array);
function printArray(){
  for(var i=0; i< array.length; i++){
    console.log(array[i]);
  }
}

printArray();

///////////////////////// ARRAY Test 2 ////////////////////////
function process(argv) {
  if(argv.indexOf('help')) {
    console.log('This is the help text.');
  }
}
process(['foo', 'bar', 'help']);

console.log(2 == "2"); // true
console.log(2 === "2"); // false
var arr = ["1", "2", "3"];
// Search the array of keys
console.log(arr.indexOf(2)); // returns -1
console.log(arr.indexOf("2")); // returns 1

//////////////////////// ARRAY Test 3 /////////////////////////

var lookup = { 12: { foo: 'b'}, 13: { foo: 'a' }, 14: { foo: 'c' }};
console.log(Object.keys(lookup).indexOf(12) > -1); // false
console.log(Object.keys(lookup).indexOf(''+12) > -1); // true



