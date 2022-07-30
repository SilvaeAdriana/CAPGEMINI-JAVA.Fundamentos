package Pessoas;

public class Juridica extends Pessoa {//heranca relacionando Pessoa-Juridica--quando chama Pessoa Juridica ela herda caract de Pessoa
    String cnpj;
    String incricaoEstadual;


    @Override
    public String toString() {
        return "Juridica [cnpj=" + cnpj + ", incricaoEstadual=" + incricaoEstadual + ", nome=" + nome + ",situacaoCadastral=" + situacaoPessoa + "]";
    }

    
    
}
