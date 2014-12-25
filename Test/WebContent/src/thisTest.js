///////////// This Test 1 /////////////////////
var obj = {
  x: "12",
  funky: function(){
    var self = this;
    function nestedfunky(){
      console.log(this.x);
      console.log(self.x);
    }
    nestedfunky();
  }
};

obj.funky();

/////////// This Test 2 ///////////////////////
function f1(){
  console.log(this.toString());
  console.log(this== window);
}f1();

////////// This Test 3 ///////////////////////

function f1(){
  console.log(this);
}
var obj1 ={ id:"Foo"};f1.call(obj1);
var obj2 ={ id:"Bar"};f1.apply(obj2);
