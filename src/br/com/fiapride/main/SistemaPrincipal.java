package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Relogio;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	// Dentro do main...// Fabriquei a primeira (Instância 1)
    	Relogio meuRelogio = new Relogio();
    	meuRelogio.cor = "Preto";
    	meuRelogio.horas = 20;
    	// Fabriquei a segunda (Instância 2)
    	Relogio relogioDoProfessor = new Relogio();
    	relogioDoProfessor.cor = "Preto";
    	relogioDoProfessor.horas = 20;
    	System.out.println("Meu relógio é: " + meuRelogio.cor);
    	System.out.println("O do professor é: " + relogioDoProfessor.cor);
    }
}