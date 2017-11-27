import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/first';
import 'rxjs/add/operator/catch';
import { User } from '../model/User';
@Injectable()
export class UserService {

  private uri='http://localhost:8081/user';

  private headers= new Headers({'Content-type':'application/json'});

  constructor(private http:Http) { }

  addNewUser(user:User):Observable<any>{
    return this.http.post(this.uri,user).map(r=>r.text());
  }

}
