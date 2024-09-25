package com.example.Prisao;

import java.util.List;


public class Presidio {
    private List<Cela> celas;

    public Presidio(List<Cela> celas) {
        this.celas = celas;
    }

    public void alocarPreso(Preso preso) throws AlocacaoException {
        for (Cela cela : celas) {
            if (cela.podeAlocar(preso)) {
                cela.alocarPreso(preso);
                return;
            }
        }
        throw new AlocacaoException("Sem espaço para: " + preso.getNome());
    }
}
