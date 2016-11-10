package br.com.danieldesenvolvedor.tupicionario;

/**
 * Created by Alucard on 04/11/2016.
 */
public class Item {

    private String titulo;

    private String descricao;

    private int imagem;

    public Item(String descricao, String titulo, int imagem) {
        this.imagem = imagem;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
