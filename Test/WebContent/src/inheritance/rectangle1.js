function Shape( x , y ){
  X = x || 0;
  Y = y || 0;
}
//  Shape.prototype.X= 0;
//  Shape.prototype.Y =0;

Shape.prototype.area = function(){
  throw new Error("Need a 2d form!");
}

Shape.prototype.move = function(x,y){
  Shape.prototype.X = x;
  Shape.prototype.Y = y;
}

Shape.prototype.distance_from_origin = function(){
    return Math.sqrt(this.X * this.X + this.Y * this.Y);
}



var newShape = new Shape();
newShape.move(11,11);

console.log("Moved by distance - " + newShape.distance_from_origin());
console.log('prototype:', Shape.prototype.X);
console.log('new shape:', newShape.X);

var newerShape = new Shape();

console.log('newer shape:', newerShape.X);
