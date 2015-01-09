var fs = require('fs');

var number = [];
function createRandomArray(num){
  var high = 100000;
  var low = 1;
  for (var i = 0; i<num ; i++){
   number.push(Math.floor(Math.random()*(high-low +1 ) + low));
  }
};
createRandomArray(1000000);

//console.log(number);
fs.writeFile('./arrays.js',number.map(function(v){ return v}),function (err) {
        console.log('ok');
    });



