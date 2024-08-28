package rede;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Postagem implements Curtivel {
    private String conteudo;
    private LocalDateTime dataCriacao;
    private int curtidas;
    private List<Comentario> comentarios;

    public Postagem(String conteudo) {
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    // Getters e Setters
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    @Override
    public void curtir() {
        this.curtidas++;
    }

    @Override
    public void comentar(Comentario comentario) {
        comentarios.add(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}
