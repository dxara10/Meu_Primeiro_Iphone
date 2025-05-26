package com.iphone.app.service;

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
    void fecharAba(int abaIndex);
    void listarHistorico();
}