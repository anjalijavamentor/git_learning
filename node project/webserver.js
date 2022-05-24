//the Http.createserver() method includes request and response parameters which  is suplies.

//the request object can be used to get the information of current http request.
// e.g. ,url, request header, and data.

//the response object use to send a response for a  current request.

//if the response from the http server supposed to be displayed as html
// you should include an http header with the correct content type.

const http = require("http");
const server = http.createServer((req, res )=>{
    res.end("hello my name is anjali sharma");

 });

 server.listen(8000 , "127.0.0.1",() =>{
     console.log("listning on the port 8000");

 });