package com.iphone.app.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        for (Musica m : musicas) {
            System.out.println(m.getTitulo());
        }
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}