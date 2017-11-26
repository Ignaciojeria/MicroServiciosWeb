import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AlumnoService } from './service/alumno.service';
import { HttpModule } from '@angular/http';
import { AuthComponent } from './auth/auth.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import {FlexLayoutModule} from '@angular/flex-layout';
import { AuthService } from './service/auth.service';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FlexLayoutModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [AlumnoService,
              AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
