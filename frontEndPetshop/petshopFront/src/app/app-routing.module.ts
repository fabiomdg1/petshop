
import { CadastrarFuncionarioComponent } from './Componentes/Funcionarios/cadastrar-funcionario/cadastrar-funcionario.component';
import { DadosDoFuncionarioComponent } from './Componentes/Funcionarios/dados-do-funcionario/dados-do-funcionario.component';
import { CadastrarClienteComponent } from './Componentes/Clientes/cadastrar-cliente/cadastrar-cliente.component';
import { DadosDoClienteComponent } from './Componentes/Clientes/dados-do-cliente/dados-do-cliente.component';
import { HomeComponent } from './Componentes/Templates/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PetComponent } from './Componentes/Pet/pet.component';

const routes: Routes = [
  {path: "", redirectTo: "/home", pathMatch: 'full' },
  {path:"home", component:HomeComponent},
  {path:"dados-do-cliente", component:DadosDoClienteComponent},
  {path:"cadastrar-cliente", component:CadastrarClienteComponent},
  {path:"dados-do-funcionario", component:DadosDoFuncionarioComponent},
  {path:"cadastrar-funcionario", component:CadastrarFuncionarioComponent},
  {path:"dados-do-pet", component:PetComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
