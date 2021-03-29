package br.com.treinamento;

public class CalculosParametros {

    public static void main(String[] args){
        double total = 0.0;
        for(String valor:args) {
            total += Double.parseDouble(valor);
        }
        System.out.println(total);
    }
}