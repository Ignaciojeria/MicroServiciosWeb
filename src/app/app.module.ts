import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ROUTES } from './app.router';
import {FlexLayoutModule} from '@angular/flex-layout';

//Componentes
import { UserComponent } from './user/user.component';
import { AuthComponent } from './auth/auth.component';
//Servicios
import { AuthService } from './service/auth.service';
import { UserService } from './service/user.service';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    ROUTES,
    FlexLayoutModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [UserService,
              AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
