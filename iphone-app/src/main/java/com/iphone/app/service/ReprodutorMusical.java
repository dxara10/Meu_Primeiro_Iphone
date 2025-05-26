package com.iphone.app.service;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String titulo);
    void avancar();
    void retroceder();
    void listarPastas();
}