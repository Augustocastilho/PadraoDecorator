package org.example;

public class Armadura extends PersonagemDecorator{

    public Armadura(Personagem personagem) {
        super(personagem);
    }

    @Override
    public float getPercentualForca() {
        return 15.0f;
    }

    @Override
    public String getNomeEquipamento() {
        return "Armadura";
    }
}
