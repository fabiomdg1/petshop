import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PetService } from 'src/app/Servicos/PetService';
import { ClienteService } from 'src/app/Servicos/ClienteService';
import { NgForOf } from '@angular/common';


@Component({
  selector: 'app-dados-do-cliente',
  templateUrl: './dados-do-cliente.component.html',
  styleUrls: ['./dados-do-cliente.component.css']
})
export class DadosDoClienteComponent implements OnInit {
  idCliente:String =''
  nomeCliente:String =''
  statusCliente:String =''
  nascCliente:String =''
  observacaoCliente:String =''
  genero:String =''
  telefone:String =''
  email:String =''
  redeSocialCliente:String =''
  estado:String =''
  cidade:String =''
  bairro:String =''
  endereco:String =''
  complemento:String =''
  cep:String =''
  nomeDoPet:String =''
  tipoPet:String =''
  raca:String =''
  porte:String =''
  nascPet:String =''
  petCastrado:String =''
  sexoPet:String =''
  petVacinado:String =''
  redeSocialPet:String =''
  observacaoPet:String =''
  menu:any = []
  dados_cliente:any = []
  id_cliente:any='1'
  itens_cliente:any = []
  lista:any=[]
  nomePet:any
  clienteEscolhido:any
  cliente:any[]=[]

  constructor(private clienteService: ClienteService,
              private route: ActivatedRoute,
              private router:Router,
              private petService:PetService) {}

  ngOnInit(): void {
    this.listarClientes()
    //this.buscarUmCliente()
  }

  // Lista os clientes e seus pets para efetuar a busca no banco de dados
  listarClientes(){
    this.clienteService.listarClientes().subscribe(resultado=>{

      console.log('Caso 1:' , resultado)
      this.lista = resultado
      resultado.forEach((select:any[]) => {

        console.log('Dentro do foreach')
        let item: any ={
          id:'',
          nomeCliente:'',
          nomePet:''
        }

        item.id = select[0]
        item.nomeCliente = select[1]
        item.nomePet = select[2]
        this.menu.push(item)
      });
    })
  }

  // Busca o nome do pet com base no cliente escolhido, afim de confirmar se é este o cliente procurado
  buscarNomePet(){
    console.log('Nome do id:',this.clienteEscolhido.id)
    this.petService.buscarNomePet(this.clienteEscolhido.id).subscribe(resultado=>{
       this.nomePet = resultado
    })
  }


  // Busca todos os dados do cliente com base no ID fornecido
  buscarUmCliente(){

    this.idCliente ='teste'
    this.nomeCliente =''
    this.statusCliente =''
    this.nascCliente =''
    this.observacaoCliente =''
    this.genero =''
    this.telefone =''
    this.email =''
    this.redeSocialCliente =''
    this.estado =''
    this.cidade =''
    this.bairro =''
    this.endereco =''
    this.complemento =''
    this.cep =''
    this.nomeDoPet =''
    this.tipoPet =''
    this.raca =''
    this.porte =''
    this.nascPet =''
    this.petCastrado =''
    this.sexoPet =''
    this.petVacinado =''
    this.redeSocialPet =''
    this.observacaoPet =''




      this.clienteService.buscarClienteId(this.clienteEscolhido.id).subscribe(resultado=>{
        console.log('Buscar um cliente')
          resultado.forEach((index:any[]) => {

            let item: any ={
                idCliente:'',
                nomeCliente:'',
                statusCliente:'',
                nascCliente:'',
                observacaoCliente:'',
                genero:'',
                telefone:'',
                email:'',
                redeSocialCliente:'',
                estado:'',
                cidade:'',
                bairro:'',
                endereco:'',
                complemento:'',
                cep:'',
                nomePet:'',
                tipoPet:'',
                raca:'',
                porte:'',
                nascPet:'',
                petCastrado:'',
                sexoPet:'',
                petVacinado:'',
                redeSocialPet:'',
                observacaoPet:'',
                } //fim let item

                item.idCliente = index[0]
                item.nomeCliente = index[1]
                item.statusCliente = index[2]
                item.nascCliente = index[3]
                item.observacaoCliente = index[4]
                item.genero = index[5]
                item.telefone = index[6]
                item.email = index[7]
                item.redeSocialCliente = index[8]
                item.estado = index[9]
                item.cidade = index[10]
                item.bairro = index[11]
                item.endereco = index[12]
                item.complemento = index[13]
                item.cep = index[14]
                item.nomePet = index[15]
                item.tipoPet = index[16]
                item.raca = index[17]
                item.porte = index[18]
                item.nascPet = index[19]
                item.petCastrado = index[20]
                item.sexoPet = index[21]
                item.petVacinado = index[22]
                item.redeSocialPet = index[23]
                item.observacaoPet = index[24]
                this.dados_cliente.push(item)

          }) //fim forEach

      })
  }

  mostrar_dados(){
    console.log('Mostrar dados')
    this.idCliente = this.dados_cliente[0].idCliente
    this.nomeCliente = this.dados_cliente[0].nomeCliente
    this.statusCliente = this.dados_cliente[0].statusCliente
    this.nascCliente = this.dados_cliente[0].nascCliente
    this.observacaoCliente = this.dados_cliente[0].observacaoCliente
    this.genero = this.dados_cliente[0].genero
    this.telefone = this.dados_cliente[0].telefone
    this.email = this.dados_cliente[0].email
    this.redeSocialCliente = this.dados_cliente[0].redeSocialCliente
    this.estado = this.dados_cliente[0].estado
    this.cidade = this.dados_cliente[0].cidade
    this.bairro = this.dados_cliente[0].bairro
    this.endereco = this.dados_cliente[0].endereco
    this.complemento = this.dados_cliente[0].complemento
    this.cep = this.dados_cliente[0].cep
    this.nomePet = this.dados_cliente[0].nomePet
    this.tipoPet = this.dados_cliente[0].tipoPet
    this.raca = this.dados_cliente[0].raca
    this.porte = this.dados_cliente[0].porte
    this.nascPet = this.dados_cliente[0].nascPet
    this.petCastrado = this.dados_cliente[0].petCadastrado
    this.sexoPet = this.dados_cliente[0].sexoPet
    this.petVacinado = this.dados_cliente[0].petVacinado
    this.redeSocialPet = this.dados_cliente[0].redeSocialPet
    this.observacaoPet = this.dados_cliente[0].observacaoPet
  }
}
