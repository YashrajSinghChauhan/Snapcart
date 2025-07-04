import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
export interface Product {
  id: number;
  name: string;
  description: string;
  price: number;
  imageUrl: string;
}
@Injectable({
  providedIn: 'root'
})
export class ProductService {


   private baseUrl = 'http://localhost:8080/products/all';

  constructor(private http: HttpClient) {}

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl);
    console.log();
    
  }
}
