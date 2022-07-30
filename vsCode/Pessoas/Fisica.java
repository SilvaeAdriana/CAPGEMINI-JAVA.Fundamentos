package Pessoas;

public class Fisica  extends Pessoa{ //extends comando de heranca relacionando Pessoa_Fisica
    String cpf;
    String identidade;


    @Override
    public String toString() {
        return "Fisica [cpf=" + cpf + ", identidade=" + identidade + ", nome=" + nome + ",situacaoPessoa=" + situacaoPessoa + "]";
        //precisa ter os atributos da classe filha e da classe mae
        //VScode não chama os herdados no preenchimento automatico
    }


 



    
    
}
