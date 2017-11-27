import { Component, OnInit } from '@angular/core';
import { User } from '../model/User';
import{FormBuilder,FormGroup,Validators} from '@angular/forms';
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  private userFormGroup:FormGroup;

  private error:boolean;

  private userCreated:boolean;

  constructor(private fb:FormBuilder, private userService:UserService,private router:Router) { 
    this.error=false;
    this.userCreated=false;
    this.userFormGroup=fb.group({
      userName:'',
      password:''
    });
  }

  private redirectToLogin(){
    this.router.navigate(['auth']);
  }

  private registrar(){
    let user:User=this.userFormGroup.getRawValue();
   this.userService.addNewUser(user).subscribe(rs=> {
                                                    this.userCreated=true;},
                                              err=> {this.error=true;});
  }

  ngOnInit() {
  }

}
