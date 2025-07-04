import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './public/home/home.component'; // ✅ Import it
import { HeaderComponent } from './shared/header/header.component';
@Component({
  selector: 'app-root',
  imports: [RouterOutlet,HomeComponent,HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'snapcart_ui';
}
