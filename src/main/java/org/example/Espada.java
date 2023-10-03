package org.example;

public class Espada extends PersonagemDecorator{
    
    public Espada(Personagem personagem) {
        super(personagem);
    }

    @Override
    public float getPercentualForca() {
        return 50.0f;
    }

    @Override
    public String getNomeEquipamento() {
        return "Espada";
    }
}
