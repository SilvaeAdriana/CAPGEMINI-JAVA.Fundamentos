package Pessoas;

// COM HERANCA
public class Pessoas {
    
    public static void main(String[] args){

       Fisica fisica = new Fisica(); //não precisa chamar a classe Pessoa
       fisica.nome = "Joao";
       fisica.cpf = "11111111";
       fisica.identidade = "777UJJ8";
       fisica.situacaoPessoa = 'A';


       Juridica juridica = new Juridica();
       juridica.nome = "Fábricas Abobrinha";
       juridica.incricaoEstadual = "8888888";
       juridica.cnpj = "7777777";
       juridica.situacaoPessoa ='A';
       
 

        System.out.println("Dados da pessoa fisica: " + fisica.toString());
        System.out.println("Dados da pessoa juridica: " + juridica.toString());

        

    }
    
}
