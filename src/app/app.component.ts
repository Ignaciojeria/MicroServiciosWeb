import { Component,ViewEncapsulation } from '@angular/core';
import { AlumnoService } from './service/alumno.service';
import { Alumno } from './model/Alumno';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  encapsulation: ViewEncapsulation.None
  
})
export class AppComponent {

  alumnos:Alumno[];

  constructor(private service:AlumnoService){

    this.service.getAll().subscribe(rs=>{this.alumnos=rs;
      console.log(this.alumnos)},err=>console.log(err));
  }

  public delete(documento:Alumno){
    this.service.delete(documento).
    subscribe(ret=>{console.log(ret);  
      this.remove(documento); },
                    er=> console.log(er));
}

private remove(detalle:Alumno){
  for (var i =0; i < this.alumnos.length; i++)
  if (this.alumnos[i] == detalle) {
     this.alumnos.splice(i,1);
     break;
  }
}

  title = 'app';
}
