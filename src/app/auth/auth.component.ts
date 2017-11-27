import { Component } from '@angular/core';
import { AuthService } from '../service/auth.service';
import { User } from '../model/User';
import{FormBuilder,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css'],
})
export class AuthComponent {
  private loggedIn:boolean;
  private user:User;
  private userFormGroup:FormGroup;
  private error:boolean;
  constructor(private authService:AuthService, private fb:FormBuilder ) { 
    this.error=false;
    this.loggedIn=false;
    this.userFormGroup=fb.group({
      userName:'',
      password:''
    });
  }

  private login(){
    let user:User=this.userFormGroup.getRawValue();
    this.authService.login(user).subscribe(rs=>{localStorage.setItem('token',rs); this.loggedIn=true;},err=>{this.error=true;});
  }

  private logout(){
    localStorage.removeItem('token');
  }

}
