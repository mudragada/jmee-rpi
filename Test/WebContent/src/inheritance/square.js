function Shape(){}

Shape.prototype.X = 0;
Shape.prototype.Y = 0;

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

var newShape = new Shape();
newShape.move(10,10);
console.log("Moved by distance " + Shape.prototype.distance_from_origin());

// Derived Class
function Square(){

}
// Declaring inheritance hierarchy
Square.prototype = new Shape();
Square.prototype.__proto__ = Shape.prototype;
Square.prototype.width = 0;

Square.prototype.area = function() {
  return this.width * this.width;
}

var sq = new Square();
sq.move(5,5);
sq.width = 15;

console.log(sq.distance_from_origin());
console.log(sq.area());
