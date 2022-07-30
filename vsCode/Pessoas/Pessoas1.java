package Pessoas;
// sem HERANCA


public class Pessoas1 {
    public static void main(String[] args){

        Pessoa1 pessoa = new Pessoa1();
        pessoa.nome = "Joao";
        pessoa.cpf = "111111111";
        pessoa.identidade ="AE666666";
        pessoa.situacaoPessoa ='A';

        pessoa.cnpj = "3636363633636";
        pessoa.nome = "CASA DO PARAFUSO";
        pessoa.inscricaoEstadual = "49494994";
        pessoa.situacaoPessoa = 'I';

        System.out.println(pessoa.toString());

        

    }
    
}
