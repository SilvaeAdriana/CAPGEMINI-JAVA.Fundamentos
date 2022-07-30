package ClasseConceito;

public class Principal {
    public static void main(String[] args){


        /* SEM ENCAPSULAMENTO

        //instanciacao-instanciamento
        Pessoa pessoa = new Pessoa();
        pessoa.nomePessoa ="Joseh do Nascimento";
        pessoa.idadePessoa = 49;
        pessoa.mostraDados(pessoa.nomePessoa, pessoa.idadePessoa);

         */

        //ENCAPSULADO
        Pessoa pes = new Pessoa();
        pes.setNomePessoa("Maria lurdes");
        pes.setIdadePessoa(35);
        System.out.println(pes.toString());


    }
    
}
