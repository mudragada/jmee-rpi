///////////////////////// Object Test 1 ////////////////////////
var objForTest1 = {'Alice': {a:'a',b:'b',c:'c'}, 'Bob':{d:'d'}};
var people = Object.keys(objForTest1);
console.log(people);
people.forEach(function(person){
  var items = Object.keys(objForTest1[person]);
  console.log(items);
  items.forEach(function(key){
    var values = objForTest1[person][key];
    console.log(values);
  });
});

///////////////////////// Object Test 2 ////////////////////////
//////////////////// Iterate through Object/////////////////////
var objForTest2 = {'Alice': {a:'1', b:'2', c:'3'}, 'Bob':{d:'4'}};
var people = Object.keys(objForTest2);
people.forEach(function(person){
  var items = Object.keys(objForTest2[person]);
  items.forEach(function(item){
    var value = objForTest2.pe;
    console.log(person + ":" + item+ "=" + value);
  });
});
