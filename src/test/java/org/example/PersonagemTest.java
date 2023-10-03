package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarForcaPersonagem(){
        Personagem personagem = new PersonagemPrincipal(5.0f);
        assertEquals(5.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComEscudo(){
        Personagem personagem = new PersonagemPrincipal(5.0f);
        personagem = new Escudo(personagem);
        assertEquals(25.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComArmadura(){
        Personagem personagem = new PersonagemPrincipal(5.0f);
        personagem = new Armadura(personagem);
        assertEquals(20.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComEspada(){
        Personagem personagem = new PersonagemPrincipal(5.0f);
        personagem = new Espada(personagem);
        assertEquals(55.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComEscudoArmadura(){
        Personagem personagem =  new Escudo(new Armadura(new PersonagemPrincipal(5.0f)));
        assertEquals(40.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComEscudoEspada(){
        Personagem personagem =  new Escudo(new Espada(new PersonagemPrincipal(5.0f)));
        assertEquals(75.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComArmaduraEspada(){
        Personagem personagem =  new Armadura(new Espada(new PersonagemPrincipal(5.0f)));
        assertEquals(70.0f, personagem.getForca());
    }

    @Test
    void deveRetornarForcaPersonagemComEscudoArmaduraEspada(){
        Personagem personagem =  new Escudo(new Armadura(new Espada(new PersonagemPrincipal(5.0f))));
        assertEquals(90.0f, personagem.getForca());
    }

    @Test
    void deveRetornarEquipamentoPersonagem(){
        Personagem personagem = new PersonagemPrincipal();
        assertEquals("Personagem Principal", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComEscudo(){
        Personagem personagem = new Escudo(new PersonagemPrincipal());
        assertEquals("Personagem Principal + Escudo", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComArmadura(){
        Personagem personagem = new Armadura(new PersonagemPrincipal());
        assertEquals("Personagem Principal + Armadura", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComEspada(){
        Personagem personagem = new Espada(new PersonagemPrincipal());
        assertEquals("Personagem Principal + Espada", personagem.getEquipamento());
    }
    
    @Test
    void deveRetornarEquipamentoPersonagemComEscudoArmadura(){
        Personagem personagem = new Escudo(new Armadura(new PersonagemPrincipal()));
        assertEquals("Personagem Principal + Armadura + Escudo", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComEscudoEspada(){
        Personagem personagem = new Escudo(new Espada(new PersonagemPrincipal()));
        assertEquals("Personagem Principal + Espada + Escudo", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComArmaduraEspada(){
        Personagem personagem = new Armadura(new Espada(new PersonagemPrincipal()));
        assertEquals("Personagem Principal + Espada + Armadura", personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemComEscudoArmaduraEspada(){
        Personagem personagem = new Escudo(new Armadura(new Espada(new PersonagemPrincipal())));
        assertEquals("Personagem Principal + Espada + Armadura + Escudo", personagem.getEquipamento());
    }

}