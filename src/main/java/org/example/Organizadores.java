package org.example;

public class Organizadores implements Setor {

    private static Organizadores instancia = new Organizadores();

    private Organizadores() {}

    public static Organizadores getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "Os Organizadores irão analisar a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "Os Organizadores agradecem o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "Os Organizadores irão considerar a sugestão: " + mensagem;
    }
}
