package br.com.treinamento;

public class SerHumano {

    public static void main(String[] args){
        Animal objeto1 = new Animal();
        objeto1.nome = "Kate";

        Animal objeto2 = new Animal();
        objeto2.nome = "Bingo";


        objeto1.andar();
        objeto2.andar();
       
    }
}