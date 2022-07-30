package LacosRepeticao;

public class LacosRepeticao {
    public static void main(String[]  args){
        //Comando WHILE

        int qtdVezes = 1;


        while (qtdVezes <= 10){
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++;  //qtdVezes = qtdVezes + 1

        }
        System.out.println("Saí do laco " + (qtdVezes-1)  + " vezes");


        //DO WHILE  - laco pos testado
        qtdVezes = 1;
        do{
            System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
            qtdVezes++;  // qtdVezes = qtdVezes + 1

        }while(qtdVezes <= 10);
        System.out.println("Sai do laco e executei " + (qtdVezes-1)  + " vezes");


        //FOR
        int qtdVezes1 = 1;
        System.out.println("Comando FOR");
        for (; qtdVezes1 <= 10; qtdVezes1++){
            System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
            qtdVezes = qtdVezes1;
        }
        System.out.println("Saí do laco e executei " + (qtdVezes -1) + "vezes");

 
        for(int qtdVezes2 = 1; qtdVezes2 <= 10; qtdVezes2++){
            System.out.println("Estou fazendo a " + qtdVezes2 + "ª vez");
            if (qtdVezes2 == 5){
                System.out.println("Parei na " + qtdVezes2 + "ª vez");
                break;
            }

        }

    }
    
}
