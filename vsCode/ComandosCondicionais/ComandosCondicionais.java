package ComandosCondicionais;

public class ComandosCondicionais {
    public static void main(String[] args){

        //IF

        int num1 = 10, num2 = 30;
        if (num1 < num2){
            System.out.println("Numero 1 eh menor que numero 2");

        }


        if (num1 > num2){
            System.out.println("Numero 1 eh menor que numero 2");

        }else{
            System.out.println("Numero 1 eh maior que numero 2");
            
        }

        //Else if
        if (num1 > num2){
            System.out.println("Numero 1 eh menor que numero 2");

        }else if (num1 == num2){
            System.out.println("Numero 1 eh igual a numero 2");
        }
        
        
        else{
            System.out.println("Numero 1 eh maior que numero 2");
            
        }

        //Switch

        char opcao = 'p';
        switch(opcao){
        case 'F':{
            System.out.println("Sexo feminino");
            break;
        }
        case 'M':{
            System.out.println("Sexo masculino");
            break;
        }
        default:
            System.out.println("Digite uma sigla valida");
        }

    }
}
