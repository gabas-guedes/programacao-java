package br.com.IMC;

public class Atleta extends Pessoa {
  
    private String esporte;

    
    public Atleta(String nome, double peso, double altura, String esporte) {
        super(nome, peso, altura);
        this.esporte = esporte;
    }

  
    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    
    public double calcularIMC() {
        double imcOriginal = super.calcularIMC();
        return imcOriginal * 0.95; 
    }

 
    public void exibirInfo() {
        System.out.println(getNome() + " é um(a) atleta que pratica " + esporte + " e tem um IMC ajustado de " + calcularIMC());
    }
}
