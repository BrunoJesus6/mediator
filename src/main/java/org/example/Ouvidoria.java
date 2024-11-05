package org.example;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "A Ouvidoria agradece seu elogio.\n" +
                "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                ">>" + Organizadores.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacao(String mensagem) {
        return "A Ouvidoria agradece sua reclamação.\n" +
                "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                ">>" + Organizadores.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem) {
        return "A Ouvidoria agradece sua sugestão.\n" +
                "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                ">>" + Organizadores.getInstancia().receberSugestao(mensagem);
    }
}
