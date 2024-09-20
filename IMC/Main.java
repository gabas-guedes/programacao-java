package br.com.IMC;

public class Main {
    public static void main(String[] args) {
       
        Pessoa pessoaComum = new Pessoa("Thiago", 78, 1.75);
        
        
        Atleta atleta = new Atleta("Estefane", 73, 1.70, "natacao");

        
        pessoaComum.exibirInfo();
        atleta.exibirInfo();
    }
}
