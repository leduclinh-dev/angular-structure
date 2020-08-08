import {NgModule} from '@angular/core';
import {SharedModule} from '../shared/shared.module';
import { FooterComponent } from './main-layout/footer/footer.component';

@NgModule({
  declarations: [FooterComponent],
  exports: [],
  imports: [
    SharedModule
  ]
})
export class FeatureModule {}
