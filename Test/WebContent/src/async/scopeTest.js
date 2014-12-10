////////////////Scope Test 1/////////////////////////////
for(var i = 0; i < 5; i++) {
  (function() {
    var j = i;
    setTimeout( function() { console.log(j); }, 500*i);
  })();
}


////////////////Scope Test 2//////////////////////////////
function scopeTest() {
  for(var i = 0; i< 5; i++){
    function localScope(){
      var j = i;
      setTimeout(function() { console.log(j);}, 500*i);
    }
    localScope();
  }
}
scopeTest();

////////////////Scope Test 3/////////////////////////////
var a = "foo";
function grandparent() {
  var b = "bar";
  function parent() {
     var b = "b redefined!";
     function nested() {
      console.log(a);
      console.log(b);
    }
    nested();
  }
  parent();
}
grandparent();
////////////////Scope Test 4/////////////////////////////
var args = { hello: 'world' };

function myFunction(args){
  args.newHello = 'another world';
}

myFunction(args);
console.log(args);

