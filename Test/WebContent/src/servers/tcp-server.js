var net = require('net');
var server = net.createServer(function(socket){
	socket.write('hello\n');
	setTimeout(function(){
		socket.write('world\n');
	},2000);
	socket.on('data', function(data){
		socket.write(data);
	});
});

server.listen(8000);
