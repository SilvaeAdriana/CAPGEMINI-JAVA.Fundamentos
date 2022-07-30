package Polimorfismo;


//classe principal
public class Polimorfismo {
    public static void main(String[] args) {
        
    

    //Polimorfismo
    Mamifero mamifero1 = new Elefante();
    System.out.println("Cota diaria de leite de um elefante eh: " + mamifero1.cotaDiariaLeite());


    Mamifero mamifero2 = new Rato();
    System.out.println("Cota diaria de leite de um elefante eh: " + mamifero2.cotaDiariaLeite());

    }

    
}
