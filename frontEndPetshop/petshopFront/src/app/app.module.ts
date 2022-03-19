import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './Componentes/Templates/footer/footer.component';
import { HeaderComponent } from './Componentes/Templates/header/header.component';
import { HomeComponent } from './Componentes/Templates/home/home.component';
import { DadosDoClienteComponent } from './Componentes/Clientes/dados-do-cliente/dados-do-cliente.component';
import { CadastrarClienteComponent } from './Componentes/Clientes/cadastrar-cliente/cadastrar-cliente.component';
import { DadosDoFuncionarioComponent } from './Componentes/Funcionarios/dados-do-funcionario/dados-do-funcionario.component';
import { CadastrarFuncionarioComponent } from './Componentes/Funcionarios/cadastrar-funcionario/cadastrar-funcionario.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { PetComponent } from './Componentes/Pet/pet.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    DadosDoClienteComponent,
    CadastrarClienteComponent,
    DadosDoFuncionarioComponent,
    CadastrarFuncionarioComponent,
    PetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
