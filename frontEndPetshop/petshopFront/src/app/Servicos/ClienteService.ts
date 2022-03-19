import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";

@Injectable({
  providedIn:'root'
})

export class ClienteService{

   baseUrl: String = 'http://localhost:8080/petshop'

    constructor(private http:HttpClient){}

    buscarTodosClientes():Observable<any>{
      const url = `${this.baseUrl}/clientes`
      return this.http.get<any>(url)
    }

    //Mostra todos os dados do cliente
    buscarClienteId(id_cliente : string):Observable<any>{
      const url = `${this.baseUrl}/cliente/${id_cliente}`
      return this.http.get<any>(url)
    }

    //Mostra clientes para pesquina
    listarClientes():Observable<any>{
      const url = `${this.baseUrl}/listaClientes`
      return this.http.get<any>(url)
    }

}
