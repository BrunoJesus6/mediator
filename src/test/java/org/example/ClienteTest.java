package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ClienteTest {

    @Test
    void deveElogiarOrganizadores() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu elogio.\n" +
                        "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                        ">>Os Organizadores agradecem o elogio: Ótimo evento",
                cliente.darElogio("Ótimo evento"));
    }

    @Test
    void deveReclamarOrganizadores() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece sua reclamação.\n" +
                        "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                        ">>Os Organizadores irão analisar a reclamação: Problema na organização",
                cliente.darReclamacao("Problema na organização"));
    }

    @Test
    void deveSugerirOrganizadores() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece sua sugestão.\n" +
                        "Os Organizadores responderão conforme a mensagem a seguir.\n" +
                        ">>Os Organizadores irão considerar a sugestão: Melhorar a comunicação",
                cliente.darSugestao("Melhorar a comunicação"));
    }
}