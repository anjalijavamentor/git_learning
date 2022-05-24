var car = (function () {
    function car(machine) {
        this.machine = machine;
    }
    car.prototype.bonet = function () {
        console.log("function display machine is:" + this.machine);
    };
    return car;
})();
var obj = new car("ddxx"); //object of class
//access the field
console.log("reading attribute value machine is:" + obj.machine);
//access the function.
obj.bonet();
