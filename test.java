package com.example.Prisao;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        Cela celaA = new Cela(10);
        Cela celaB = new Cela(20);
        Cela celaC = new Cela(5);
        Cela celaD = new Cela(7);


        Presidio presidio = new Presidio(Arrays.asList(celaA, celaB, celaC, celaD));

        Preso z = new Preso("Z", Periculosidade.ALTA, false, false);
        Preso y = new Preso("Y", Periculosidade.CRÍTICA, false, false);
        Preso x = new Preso("X", Periculosidade.MEDIA, true, false);
        Preso m = new Preso("M", Periculosidade.BAIXA, true, false);
        Preso k = new Preso("K", Periculosidade.ALTA, false, false);
        Preso l = new Preso("L", Periculosidade.CRÍTICA, false, true);
        Preso o = new Preso("O", Periculosidade.ALTA, false, true);


        try {
            presidio.alocarPreso(z);
            presidio.alocarPreso(y);
            presidio.alocarPreso(x);
            presidio.alocarPreso(m);
            presidio.alocarPreso(k);
            presidio.alocarPreso(l);
            presidio.alocarPreso(o);
        } catch (AlocacaoException e) {
            System.out.println(e.getMessage());
        }
    }
}

