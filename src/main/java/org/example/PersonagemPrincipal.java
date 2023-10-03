package org.example;

public class PersonagemPrincipal implements Personagem {

    public float forca;

    public PersonagemPrincipal() {
    }

    public PersonagemPrincipal(float forca) {
        this.forca = forca;
    }

    @Override
    public float getForca() {
        return this.forca;
    }

    @Override
    public String getEquipamento() {
        return "Personagem Principal";
    }
}
