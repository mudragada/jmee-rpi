function Shape(){
  this.X = 0;
  this.Y = 0;

  this.move = function (x,y){
    this.X = x;
    this.Y = y;
  }

  this.distance_from_origin = function(){
    return Math.sqrt(this.X*this.X + this.Y*this.Y);
  }
}

var newShape = new Shape();
newShape.move(10,10);
console.log("Moved by distance " + newShape.distance_from_origin());
