function intersect(arr1, arr2){
  var intersection = [];

  for (var i = 0; i< arr1.length; i++){
    for (var j = 0; j< arr2.length; j++){
      if(arr2[j] = arr1[i]){
        intersection.push(arr2[j]);
        break;
      }
    }
  }
}
