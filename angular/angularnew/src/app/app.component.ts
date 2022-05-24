import { Component } from '@angular/core';
import {FormGroup , FormControl} from '@angular/forms';
import { UserdataService} from './services/userdata.service';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular 12';
  users:any;

  ngOnInit(){
    
  }

  // constructor(private userData:UserdataService){
  // //   this.userData.users().subscribe(
  // //     (data)=>{
  // //       console.warn("data",data);
  // //       this.users=userData.users();
  // //     }
  // //   )   
  // // }
  // //data=12;
  // // updatedata(item:string){
  // //   console.warn(item)
  // //   this.data=item;
  // // }

 

  // //today=Date();


  // // user={
  // //   name:"anjali sharma",
  // //   age:22,
  // // }

 

  // // loginform=new FormGroup ({
  // //   user:new FormControl('anjali'),
  // //   password:new FormControl('1231'),

  // // })
  // // loginuser(){
  // //   console.warn(this.loginform.value);
  // // }

  // // memberData=[
  // //   {name:'anjali',email:'anjali@gmail.com'},
  // //   {name:'amit',email:'anjali@gmail.com'},
  // //   {name:'mummy',email:'anjali@gmail.com'},
  // //   {name:'mama',email:'anjali@gmail.com'},
  // //   {name:'khaggu',email:'anjali@gmail.com'},
  // // ]
  // }
