package org.example;

public class Escudo extends PersonagemDecorator{

    public Escudo(Personagem personagem) {
        super(personagem);
    }

    @Override
    public float getPercentualForca() {
        return 20.0f;
    }

    @Override
    public String getNomeEquipamento() {
        return "Escudo";
    }

}
