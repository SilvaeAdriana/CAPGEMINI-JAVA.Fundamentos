package Logicos;

public class RelacionaisLogicos {
    public static void main(String[] args){
    //Operadores relacionais
    // > < <= >= != =

    int num1,num2;

    //testando uma igualdade
    num1 = 10;
    num2 = 20;
    if (num1 == num2){
        System.out.println("Numero 1 e numero 2 são iguais");
    }

    //testando desigualdade
    num1 = 10;
    num2 = 20;
    if (num1 != num2){
        System.out.println("Numero 1 e numero 2 não são iguais");
    }

    //testando maior
    num1 = 10;
    num2 = 20;
    if (num1 > num2){
        System.out.println("Numero 1 eh maior que numero 2");
    }

    //testando menor
    num1 = 10;
    num2 = 20;
    if (num1 < num2){
        System.out.println("Numero 1 eh menor que numero 2");
    }else{
        System.out.println("Numero 1 eh maior que numero2");
    }


    //Operadores logicos
    // &&-e  || -ou   !-não
    num1 =10;
    num2 = 5;
    int num3 = 20, num4 = 5;
    if ((num1 > num3) && (num2 == num4)){
        System.out.println("Primeira opcao satisfeita");
    }else{
        System.out.println("Segunda opcao satisfeita");
    }
}
    
}
