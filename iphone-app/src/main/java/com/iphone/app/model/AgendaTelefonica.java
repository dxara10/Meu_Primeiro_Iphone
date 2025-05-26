package com.iphone.app.model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contato c : contatos) {
            System.out.println(c.getNome());
        }
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}