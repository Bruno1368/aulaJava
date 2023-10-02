package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme silencioDosInocentes = new Filme("Silencio incoentes", 1978);
        Filme belezaAmericana = new Filme("Beleza Americana", 1996);
        Filme brunoFilme = new Filme("O poderoso chefão", 1972);
        Serie breakingBad = new Serie("Breaking bad", 2008);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(brunoFilme);
        listaDeFilmes.add(belezaAmericana);
        listaDeFilmes.add(silencioDosInocentes);

    }
}
