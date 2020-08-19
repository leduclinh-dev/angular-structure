import {RouterModule, Routes} from '@angular/router';
import * as CONST from '../core/constants';
import {NotFoundComponent} from '../shared/components/not-found/not-found.component';
const routes: Routes = [
  {path: '', redirectTo: CONST.frontendUrl.HOME, pathMatch: 'full'},
  {path: CONST.frontendUrl.HOME, loadChildren: () => import('./home/home.module').then(m => m.HomeModule)},
  {path: CONST.frontendUrl.AUTH, loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule)},
  {path: CONST.frontendUrl.NOT_FOUND, component: NotFoundComponent}
];
export const AppRoutes = RouterModule.forRoot(routes);
