import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/first';
import 'rxjs/add/operator/catch';
import { User } from '../model/User';
@Injectable()
export class AuthService {

  private uri='http://localhost:8081/auth';

  private headers= new Headers({'Content-type':'application/json'});

  constructor(private http:Http) { }

  login(user:User):Observable<any>{
    return this.http.post(this.uri,user).map(r=>r.text());
  }


}
