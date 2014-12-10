function myTestCallBack(callback){
  fetchCallBack(function(err, data){
      if(err){
        console.log("An Error occurred. Abort Callback");
        callback(err);
      }
      data+ =1;
      callback(data);
  });
};

console.log("Calling from outside the callback");
console.log(myTestCallBack);
