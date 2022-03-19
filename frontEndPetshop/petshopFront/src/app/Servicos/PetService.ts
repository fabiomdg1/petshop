import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn:'root'
})

export class PetService{

  baseUrl: String = 'http://localhost:8080/petshop'

    constructor(private http:HttpClient){}

    buscarTodosPets():Observable<any>{
      const url = `${this.baseUrl}/pets`
      return this.http.get<any>(url)
    }

    buscarNomePet(id_cliente:string):Observable<any>{
      const url= `${this.baseUrl}/buscarNomePet/${id_cliente}`
      return this.http.get<any>(url)
    }

}
