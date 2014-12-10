function init_cache(){

  var init_data = {cache_size: 10,
                  location:"/tmp",
                  type:"btree"};


  var a = arguments;
  for (var i = 0; i< a.length; i++) {
   if(typeof a[i] == 'number'){
     init_data.cache_size = a[i];
    } else if (typeof a[i] == 'object'){
     init_data = a[i];
    } else {
     throw new Error("bad params to init_cache");
    }
  }
}
