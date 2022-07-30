package Aritmeticos;

public class Aritmeticos {
    public static void main(String[] args){
        int num1,num2, num3;
        //soma
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println("O resultado da soma eh: " + num3);


        //subtracao
        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;
        System.out.println("O resultado da subtracao eh: " + num3);



        //multiplicacao
        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;
        System.out.println("O resultado da multiplicacao eh: " + num3); 
        
        

        //divisão
        num1 = 10;
        num2 = 20;
        num3 = num1 / num2;
        System.out.println("O resultado da divisao eh: " + num3);  
        System.out.println("--------------------------------");  
        
        

        // imprime numero de 1 a 10
        //incrementando
        num1 = 0;
        while(num1 <= 10){
            num1++;
            System.out.println(num1);
        }
        //decrementando
        num1 = 10;
        while(num1 >= 0){
            num1--;
            System.out.println(num1);
        }
    }
}
