package com.example.Prisao;
import java.util.ArrayList;
import java.util.List;

public class Cela {
    private int capacidadeCela;
    private List<Preso> presos;

    public Cela(int capacidadeCela) {
        this.capacidadeCela = capacidadeCela;
        this.presos = new ArrayList<>();
    }

    public boolean podeAlocar(Preso preso) {
        int ocupacaoAtual = presos.stream().mapToInt(Preso::getOcupacao).sum();
        return ocupacaoAtual + preso.getOcupacao() <= capacidadeCela && validaRegras(preso);
    }
    // Regras:
    private boolean validaRegras(Preso preso) {

        if (preso.chefeDeGangue()) {
            return presos.stream().allMatch(Preso::chefeDeGangue);
        }
        if (preso.temDeficiencia()) {
            return presos.size() > 0;
        }
        return true;
    }

    public void alocarPreso(Preso preso) {
        presos.add(preso);
    }
}
