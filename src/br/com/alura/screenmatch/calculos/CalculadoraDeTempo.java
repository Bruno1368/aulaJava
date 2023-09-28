package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        // aqui poderia ser usado o this.tempoTotal porém não estava ambiguo, já que o parametro não tinha nome igual
//        tempoTotal += f.getDuracaoMinutos();
//    }
//        // sobracarga de metodo = quando usamos o mesmo nome do metodo porem dado do tipo diferente(antes filme, agora serie)
//    public void inclui(Serie s){
//        // aqui poderia ser usado o this.tempoTotal porém não estava ambiguo, já que o parametro não tinha nome igual
//        tempoTotal += s.getDuracaoMinutos();
//    }
        // series e filmes são um titulo, então pdoe usar a classe mãe, principal - POLIMORFISMO
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
