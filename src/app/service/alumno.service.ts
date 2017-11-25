import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/first';
import 'rxjs/add/operator/catch';
import { Alumno } from '../model/Alumno';

@Injectable()
export class AlumnoService {

  private url='http://localhost:8080/alumno';
  private headers= new Headers({'Content-type':'application/json'});
     constructor(private http:Http) { }



       getAll():Observable<Alumno[]>{
       let url= `${this.url}`
       return this.http.get(url).map(r=> r.json());}

       delete(alumno:Alumno){
         let url= `${this.url}`+"/"+alumno.rut;
         return this.http.delete(url);
      }


}
