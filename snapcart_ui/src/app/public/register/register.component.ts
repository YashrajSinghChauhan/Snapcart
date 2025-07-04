import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-register',
  imports: [CommonModule, FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
 name = '';
  email = '';
  password = '';

  onRegister() {
    console.log('Register user:', this.name, this.email);
    // Later: Call AuthService to register
  }
}
