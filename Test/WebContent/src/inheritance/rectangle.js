//Shape Class Definition Start
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

//Shape Class Definition End

var newShape = new Shape();
newShape.move(10,10);
console.log("Moved by distance " + Shape.prototype.distance_from_origin());

// Derived Class Square
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


function Rectangle(){

}

Rectangle.prototype = new Square();
Rectangle.prototype.__proto__ = Square.prototype;
Rectangle.prototype.Height = 0;

Rectangle.prototype.area = function (){
  return this.width * this.height;
}

var re = new Rectangle();
re.move(-5,-5);
re.width = 15;
re.height = 2;
console.log (re.distance_from_origin());
console.log (re.area());

console.log (sq instanceof Square);
console.log (sq instanceof Shape);
console.log (re instanceof Square);
console.log (re instanceof Rectangle);
console.log (re instanceof Shape);
