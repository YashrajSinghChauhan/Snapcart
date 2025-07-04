import { Component } from '@angular/core';
import { Product, ProductService } from '../../services/product.service';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-home',
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
 products: Product[] = [];

  constructor(private productService: ProductService) {}

   ngOnInit(): void {
  this.productService.getProducts().subscribe({
    next: data => {
      console.log('Products:', data); // ✅ Add this
      this.products = data;
    },
    error: err => console.error('Error fetching products', err)
  });
}
}
