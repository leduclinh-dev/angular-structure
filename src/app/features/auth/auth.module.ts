import {NgModule} from '@angular/core';
import {SharedModule} from '../../shared/shared.module';
import { AuthComponent } from './pages/auth/auth.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import {RouterModule, Routes} from '@angular/router';
import * as CONST from '../../core/constants';
const routes: Routes = [
  {path: '', component: AuthComponent, children: [
      {path: CONST.frontendUrl.LOGIN, component: LoginComponent},
      {path: CONST.frontendUrl.REGISTER, component: RegisterComponent},
      {path: '', redirectTo: CONST.frontendUrl.LOGIN, pathMatch: 'full'}
    ]}
]
@NgModule({
  imports: [SharedModule, RouterModule.forChild(routes)],
  exports: [],
  declarations: [AuthComponent, LoginComponent, RegisterComponent]
})
export class AuthModule {}
