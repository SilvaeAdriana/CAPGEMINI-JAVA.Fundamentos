package EntradasDados;

import javax.swing.JOptionPane;

public class EntradasDados {
    public static void main(String[] args){

        int idade;
        String mensagem;
        //è liberada a caixa de diálogo para o usuário inserir o dado---> seria mais assertivo
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));// esse metodo é pra String--o parseInt resolve e converte para inteiro
        System.out.println("A pessoa tem " + idade + " anos de idade");
        mensagem = JOptionPane.showInputDialog("Escreva uma mensagem para essa pessoa: ");
        System.out.print("Te desejo: " + mensagem);

        JOptionPane.showInputDialog(null,"A pessoa tem " + idade + "anos de idade");
        JOptionPane.showInputDialog(null,"Teste", "Atencao!!",1);

    }
    
}
