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

var a = [
  { key: 'foo', val: 'bar'},
  { key: '2', val: '2' },
  { key: '1', val: '1' }
  ];
for(var i in a) {
  console.log(a[i].key)
};
