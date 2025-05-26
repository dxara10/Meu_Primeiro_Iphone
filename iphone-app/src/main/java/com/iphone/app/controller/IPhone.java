package com.iphone.app.controller;

import com.iphone.app.model.Playlist;
import com.iphone.app.model.AgendaTelefonica;
import com.iphone.app.model.Discador;
import com.iphone.app.service.AparelhoTelefonico;
import com.iphone.app.service.NavegadorInternet;
import com.iphone.app.service.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<Playlist> playlists;
    private List<String> historicoChamadas;
    private List<String> abasAtivas;
    private AgendaTelefonica agenda;
    private Discador discador;

    public IPhone() {
        this.playlists = new ArrayList<>();
        this.historicoChamadas = new ArrayList<>();
        this.abasAtivas = new ArrayList<>();
        this.agenda = new AgendaTelefonica();
        this.discador = new Discador();
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Lógica para tocar música
    }

    @Override
    public void pausar() {
        // Lógica para pausar música
    }

    @Override
    public void selecionarMusica(String titulo) {
        // Lógica para selecionar música
    }

    @Override
    public void avancar() {
        // Lógica para avançar música
    }

    @Override
    public void retroceder() {
        // Lógica para retroceder música
    }

    @Override
    public void listarPastas() {
        // Lógica para listar pastas de música
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // Lógica para realizar uma chamada
    }

    @Override
    public void atender() {
        // Lógica para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar correio de voz
    }

    @Override
    public void listarHistoricoChamadas() {
        // Lógica para listar histórico de chamadas
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Lógica para exibir uma página
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Lógica para adicionar uma nova aba
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página
    }

    @Override
    public void fecharAba(int index) {
        // Lógica para fechar uma aba
    }

    @Override
    public void listarHistorico() {
        // Lógica para listar histórico de navegação
    }
}