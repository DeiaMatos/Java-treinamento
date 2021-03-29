package br.com.treinamento;

public class ComparaTipos {

    public static void main(String[] args){
        //String nome = " ";
        //String nome = null;
        String nome =  new String();
        if(nome instanceof String) {
            System.out.println("E uma instacia de String");           
        } else {
            System.out.println("Nao e uma estancia de String ");
        }
    }
}