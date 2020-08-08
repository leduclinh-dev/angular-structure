import {NgModule} from '@angular/core';
import {SharedModule} from '../shared/shared.module';
import { FooterComponent } from './main-layout/footer/footer.component';
import {AppRoutes} from './feature.routing';

@NgModule({
  declarations: [FooterComponent],
  exports: [],
  imports: [
    SharedModule,
    AppRoutes
  ]
})
export class FeatureModule {}
