///////////////////////// ARRAY Test 1 ////////////////////////
/////////////push(), pop(), shift(), unshift()/////////////////
console.log("///////////////////////// ARRAY Test 1 ////////////////////////");
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
////////////////////indexOf(), lastIndexOf()///////////////////
console.log("///////////////////////// ARRAY Test 2 ////////////////////////");
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

var arr = [1, 2, 3];
// Search the array of keys
console.log(arr.indexOf(2)); // returns 1
console.log(arr.indexOf("2")); // returns -1

//////////////////////// ARRAY Test 3 /////////////////////////
////////////////////////Object.keys()//////////////////////////
console.log("///////////////////////// ARRAY Test 3 ////////////////////////");

var lookup = { 12: { foo: 'b'}, 13: { foo: 'a' }, 14: { foo: 'c' }};
console.log(Object.keys(lookup).indexOf(12) > -1); // false
console.log(Object.keys(lookup).indexOf(''+12) > -1); // true
console.log(Object.keys(lookup).indexOf("12") > -1); // true


////////////////////// ARRAY Test 4 //////////////////////////
/////////////////////concat(), reverse(), typeof()////////////
console.log("///////////////////////// ARRAY Test 4 ////////////////////////");

var arr2 = [1,2,3];
console.log('array after concatenation - ' + array.concat(arr2));

console.log('array reversed - ' + array.reverse());
printArray();
console.log(typeof(array)); // This returns an object
array += "," + arr2;

//printArray(); // This returns a string
console.log(typeof(array)); // This returns a string
console.log(array);


////////////////////// ARRAY Test 5 //////////////////////////
//////filter(callback), forEach(callback), map(callback)///////
console.log("///////////////////////// ARRAY Test 5 ////////////////////////");

var arrayForEach = ['a','b','c', 1, 2, 3, { has_thing: true, id: 123 }];
arrayForEach.forEach(function(value){
  console.log(value + ' - ' + typeof(value) + ' - ' + isNaN(value));
});

var arrayFiltered = arrayForEach.filter(function(value){
  return isNaN(value);
});
console.log(arrayFiltered);

////////////////////// ARRAY Test 6 //////////////////////////
/////////reduce(callback), reduceRight(callback)//////////////

console.log("///////////////////////// ARRAY Test 6////////////////////////");
//var sum = [1, 2, 3, 'a','b','c'].reduce( function(total, num){ return total +  '' + num });
//var sum = [1, 2, 3, 'a','b','c'].reduce( function(total, num){ return total  + num });
//var sum = [1, 2, 3, 'a','b','c'].reduceRight( function(total, num){ return total +  '' + num });
//var sum = [1,2,3,-5,-6,-7].reduce(function(total,num){return total-num});
var sum = [1,2,3,-5,-6,-7].reduceRight(function(total,num){return total-num});
console.log(sum + '-' + typeof(sum));
////////////////////// ARRAY Test 7 //////////////////////////
/////////////////////every(callback), some(callback)//////////
console.log("///////////////////////// ARRAY Test 7////////////////////////");

var everyArray = [1,2,'a','b'];
if(everyArray.every(function(num){
  if(isNaN(num))
    return true;
}))
  console.log("Has all Non numbers");
else if(everyArray.some(function(num){
  if(isNaN(num))
    return true;
}))
  console.log("Has some non numbers");

////////////////////// ARRAY Test 8 //////////////////////////
///////////sort(), splice(), slice(), join()//////////////////
console.log("///////////////////////// ARRAY Test 8////////////////////////");
var a = [ 'a', 'b', 'c' ];
var b = [ 1, 2, 3 ];
console.log( a.concat(['d', 'e', 'f'], b) );
console.log( a.join('! ') );
console.log( a.slice(1, 3) );
console.log( ' --- ');
var c = a.splice(0, 2);
console.log( a, c );
var d = b.splice(1, 1, 'foo', 'bar');
console.log( b, d );






