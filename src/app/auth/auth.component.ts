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
  
  constructor(private authService:AuthService, private fb:FormBuilder ) { 
    this.loggedIn=false;
    this.userFormGroup=fb.group({
      userName:'',
      password:''
    });
  }

  watch(){
    console.log(this.userFormGroup.getRawValue());
  }

  private login(){
    let user:User=this.userFormGroup.getRawValue();
    this.authService.login(user).subscribe(rs=>{localStorage.setItem('token',rs); this.loggedIn=true;},err=>console.log('Usuario No encontrado'));
  }

  private logout(){
    localStorage.removeItem('token');
  }

}
