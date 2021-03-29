package br.com.treinamento;

public class MultiplasVerificacoes {

    public static void main(String[] args){
        int numero = 35 ;
        switch(numero){
            case 5:
                System.out.println("Valor eh 5. ");
                break;
            case 10:
                System.out.println("Valor eh 10. ");
                break;
            case 20:
                System.out.println("Valor eh 20. ");
                break;
            default:
                System.out.println("O valor informado foi: " + numero);
                break;
        }
        System.out.println("Final do metodo. ");
    }
}