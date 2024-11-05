package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizadoresTest {

    @Test
    void deveReceberElogio() {
        Organizadores organizadores = Organizadores.getInstancia();
        assertEquals("Os Organizadores agradecem o elogio: Ótimo evento",
                organizadores.receberElogio("Ótimo evento"));
    }

    @Test
    void deveReceberReclamacao() {
        Organizadores organizadores = Organizadores.getInstancia();
        assertEquals("Os Organizadores irão analisar a reclamação: Problema na organização",
                organizadores.receberReclamacao("Problema na organização"));
    }

    @Test
    void deveReceberSugestao() {
        Organizadores organizadores = Organizadores.getInstancia();
        assertEquals("Os Organizadores irão considerar a sugestão: Melhorar a comunicação",
                organizadores.receberSugestao("Melhorar a comunicação"));
    }
}