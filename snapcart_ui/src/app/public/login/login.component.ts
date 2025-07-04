import { Component } from '@angular/core';
import { RouterModule, Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-login',
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  email = '';
  password = '';
  errorMessage = '';
constructor(private router: Router) {}

  onLogin() {
    // Temporary mock logic
    if (this.email === 'admin@example.com' && this.password === 'admin') {
      this.router.navigate(['/admin/dashboard']);
    } else if (this.email === 'user@example.com' && this.password === 'user') {
      this.router.navigate(['/user/dashboard']);
    } else {
      this.errorMessage = 'Invalid credentials';
    }
  }
}
