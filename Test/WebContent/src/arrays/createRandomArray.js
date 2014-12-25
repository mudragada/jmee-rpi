var fs = require('fs');

var numbers = [];
function createRandomArray(err, number){
  var high = 100000;
  var low = 1;
  for (var i = 0; i< 10000; i++){
   number.push(Math.floor(Math.random()*(high-low +1 ) + low));
    //numbers.push(randomIntInc(1,100000));
  }

  if(number != null){
   console.log("Printing number array");
  }
  else
    console.log(err);
}

var randArray = new createRandomArray("Unable to create array", numbers);

var numberArray = Object.keys(numbers);

var file = fs.createWriteStream("arrays.js");
numberArray.forEach(function(item) { console.log(v);file.write(v.join(',')); });
file.end();



