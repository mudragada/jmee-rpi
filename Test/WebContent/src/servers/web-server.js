var http = require('http');

  /*createServer always takes a requestListener function which is
  automatically added to the 'request' event
  http.createServer([requestListener]) always returns a new Webserver Object*/
var s = http.createServer(function (rambo, resp) {

      console.log("request received from " + );
      resp.writeHead(200,{'content-type':'text/plain'});
      resp.write("hello \n");
      setTimeout(function () {
	         resp.write("world \n");
      },2000);
});

s.listen(8000);
console.log("Server is running");
