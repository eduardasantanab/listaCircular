package com.atividade;
import java.util.LinkedList;

public class Solucao  {
    public LinkedList<Integer> elementos;
    int quantidadeDeRotacoes;

    public Solucao(LinkedList<Integer> elementos, int quantidadeDeRotacoes){
        this.elementos = elementos;
        this.quantidadeDeRotacoes = quantidadeDeRotacoes;
    }

    public LinkedList<Integer> rotacaoEsquerda(){
        int aux, rotaciona = 0;
            do{
                aux = this.elementos.getFirst();
                this.elementos.removeFirst();
                this.elementos.addLast(aux);
                rotaciona++;
            }while (rotaciona < this.quantidadeDeRotacoes);

        return this.elementos;
    }
}
