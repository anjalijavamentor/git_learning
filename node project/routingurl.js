const http = require("http");
const server = http.createServer((req, res )=>{
    if(req.url == "/"){
        res.end("this is my routing tutorial");
    }
    else if(req.url == "/about"){
        res.end("this is about page");
    }
    else if(req.url == "/contect"){
        res.end("this is contect page");
    }
    else{
        res.writeHeader(404 , {"content-type":"text/html"});
        res.end("<h1>404 page, page not found</h1>");
    }
 });

 server.listen(8000 ,() =>{
     console.log("listning on the port 8-=/4000");

 });