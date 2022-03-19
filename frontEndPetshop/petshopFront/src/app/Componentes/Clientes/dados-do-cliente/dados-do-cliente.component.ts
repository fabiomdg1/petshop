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
  //Inicializando variáveis
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

  // Acionado no onChange do campo Nome do Cliente
  // Esta função usca o nome do pet com base no id docliente escolhido
  // Mostra o nome do pet no campo abaixo do cliente
  buscarNomePet(){

    //Limpa os campos do formulário caso tenha dados da última busca
    this.limpar_campos()

    console.log('Nome do id:',this.clienteEscolhido.id)
    this.petService.buscarNomePet(this.clienteEscolhido.id).subscribe(resultado=>{
       this.nomePet = resultado
    })
  }


  // Busca todos os dados do cliente com base no ID fornecido
  buscarUmCliente(){

    //Esta função é chamada no momento que o usuário clica no campo Nome do Cliente
    //Traz todos os dados referentes ao cliente que estão no banco
      this.clienteService.buscarClienteId(this.clienteEscolhido.id).subscribe(resultado=>{
        console.log('Buscar um cliente, id: ',this.clienteEscolhido.id)
        console.log('Resultado:',resultado)

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

                this.idCliente = index[0]
                this.nomeCliente = index[1]
                this.statusCliente = index[2]
                this.nascCliente = index[3]
                this.observacaoCliente = index[4]
                this.genero = index[5]
                this.telefone = index[6]
                this.email = index[7]
                this.redeSocialCliente = index[8]
                this.estado = index[9]
                this.cidade = index[10]
                this.bairro = index[11]
                this.endereco = index[12]
                this.complemento = index[13]
                this.cep = index[14]
                this.nomeDoPet = index[15]
                this.tipoPet = index[16]
                this.raca = index[17]
                this.porte = index[18]
                this.nascPet = index[19]
                this.petCastrado = index[20]
                this.sexoPet = index[21]
                this.petVacinado = index[22]
                this.redeSocialPet = index[23]
                this.observacaoPet = index[24]

          }) //fim forEach

      })
  }

  limpar_campos(){
       //Limpa todos os campos caso já tenha sido feito uma busca anterior
       this.idCliente = ''
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
  }
}
