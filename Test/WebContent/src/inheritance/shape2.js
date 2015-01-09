//constructor
function Shape(){}
// data
Shape.prototype.X = 0;
Shape.prototype.Y = 0;
//class named methods
Shape.prototype.distance_from_origin = function() {
  return Math.sqrt(this.X*this.X + this.Y * this.Y);
}

Shape.prototype.move = function (x, y){
  Shape.prototype.X = x;
  Shape.prototype.Y = y;
}

Shape.prototype.area = function () {
  throw new Error("Need a 2d form!");
}

//object of Shape()
var newShape = new Shape();
newShape.move(10,10);
console.log("Moved by distance " + Shape.prototype.distance_from_origin());
