package ClasseConceito;

public class Pessoa {
    private String nomePessoa;
    private int idadePessoa;

            //encapsulamento
    @Override
    public String toString(){
    return "Pessoa [nomePessoa= " + nomePessoa + ",idadePessoa=" + idadePessoa + "]";
                
     }

    //criando getters e setters  --clicar na lampada que aparecem as opcoes
    
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }


        //metodo
     public void mostraDados(String pNome, int pIdade){
     System.out.println("Nome: " + pNome);
     System.out.println("Idade: "+ pIdade);
    }
    
}
