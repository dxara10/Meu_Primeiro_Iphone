package com.iphone.app.model;

import java.util.ArrayList;
import java.util.List;

public class PastaMusical {
    private String nome;
    private List<Musica> musicas;

    public PastaMusical(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public void listarMusicas() {
        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }
}