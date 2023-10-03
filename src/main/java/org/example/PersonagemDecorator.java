package org.example;

public abstract class PersonagemDecorator implements Personagem{

    private Personagem personagem;
    private String equipamento;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public abstract float getPercentualForca();

    @Override
    public float getForca() {
        return this.personagem.getForca() + this.getPercentualForca();
    }

    public abstract String getNomeEquipamento();

    @Override
    public String getEquipamento() {
        return this.personagem.getEquipamento() + " + " + this.getNomeEquipamento();
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}
