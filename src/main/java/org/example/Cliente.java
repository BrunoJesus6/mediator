package org.example;

public class Cliente extends Pessoa {
    public String darElogio(String mensagem) {
        return Ouvidoria.getInstancia().receberElogio(mensagem);
    }

    public String darReclamacao(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacao(mensagem);
    }

    public String darSugestao(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestao(mensagem);
    }
}
