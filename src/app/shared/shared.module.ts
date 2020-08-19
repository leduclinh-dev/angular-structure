import {NgModule} from '@angular/core';
import {MDBBootstrapModule} from 'angular-bootstrap-md';
import { NotFoundComponent } from './components/not-found/not-found.component';
@NgModule({
  declarations: [NotFoundComponent],
  imports: [
    MDBBootstrapModule.forRoot()
  ],
  exports: [
    MDBBootstrapModule
  ]
})
export class SharedModule {}
