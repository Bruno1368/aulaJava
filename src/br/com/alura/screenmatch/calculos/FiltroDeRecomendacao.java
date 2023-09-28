package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroDeRecomendacao {


    public void filtra(Classificavel classificacao){
        if(classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if(classificacao.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Uma merda");
        }
    }

}
