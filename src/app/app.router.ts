import {ModuleWithProviders} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import{AppComponent} from './app.component';
import { AuthComponent } from './auth/auth.component';
import { UserComponent } from './user/user.component';




export const ROUTER: Routes= [{path:'', redirectTo:'auth', pathMatch:'full'},
{path:'auth', component:AuthComponent},
{path:'user', component:UserComponent}
]

export const ROUTES:ModuleWithProviders=RouterModule.forRoot(ROUTER);
