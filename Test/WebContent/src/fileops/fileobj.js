var fs = require('fs');
function FileObj(){
  this.filename = null;

  this.exists = function(callback){
    var self = this;
    fs.open(this.filename,'r',function(err,handle){
      if(err){
        console.log(self.filename + " does not exist");
        callback(false);
      } else {
        console.log(self.filename + " indeed exists");
        callback(true);
        fs.close(handle);
      }
    });
  };
}

var fo = new FileObj();
fo.filename = "funcionasdas";

fo.exists(function(does_it_exist){
  console.log(" File Exists? :" + does_it_exist);
});
