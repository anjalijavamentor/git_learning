
type obje={name:string,age:number,email:string };
type obj={carname:string,color:string,city:string,speed:number |string,manufacturingdate:number}

const people:obje={
    name:"anjali",
    age:22,
    email:'anjali@gmail.com'
}
console.log('\n',people.name,'\n',people.email,'\n',people.age);

const cars:obj={
    carname:'racecar',
    color:'black',
    city:'delhi',
    speed:'23km/hr',
    manufacturingdate:20/3/2006

}