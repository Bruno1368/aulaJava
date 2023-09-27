package br.com.alura.screenmatch.modelos;
        //palavra chave extends, pq filme extende as propriedade de titulo, tendo como propriedade propria apenas diretor
        // todo filme é um titulo e tem filme tem um diretor
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}


