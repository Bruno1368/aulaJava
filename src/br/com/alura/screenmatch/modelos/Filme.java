package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

//palavra chave extends, pq filme extende as propriedade de titulo, tendo como propriedade propria apenas diretor
        // todo filme é um titulo e tem filme tem um diretor
                                            //invocando a interface com implements
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    //casting
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}


