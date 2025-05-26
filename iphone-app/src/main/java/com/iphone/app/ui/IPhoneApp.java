package com.iphone.app.ui;

import com.iphone.app.controller.IPhone;
import com.iphone.app.model.Musica;
import com.iphone.app.model.Playlist;
import com.iphone.app.model.Contato;
import com.iphone.app.model.AgendaTelefonica;

import java.util.ArrayList;

public class IPhoneApp {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Simulando operações
        
        // Adicionando músicas
        Musica musica1 = new Musica("Song 1", "Artist 1", 210);
        Musica musica2 = new Musica("Song 2", "Artist 2", 180);
        
        Playlist playlist = new Playlist("My Playlist");
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        
        iphone.adicionarPlaylist(playlist);
        
        // Adicionando contato
        Contato contato = new Contato("John Doe", "123456789", "john@example.com");
        iphone.getAgenda().adicionarContato(contato);
        iphone.getDiscador().discar("123456789");
        
        // Listando músicas na playlist
        System.out.println("Músicas na Playlist:");
        playlist.listarMusicas();
        
        // Listando contatos na agenda
        System.out.println("Contatos na Agenda:");
        iphone.getAgenda().listarContatos();
    }
    
    public Object getAgenda() {
        // implementação
        return null;
    }

    public Object getDiscador() {
        // implementação
        return null;
    }
}