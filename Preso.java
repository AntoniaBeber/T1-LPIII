package com.example.Prisao;

public class Preso {
    private String nome;
    private Periculosidade periculosidade;
    private boolean deficiencia;
    private boolean chefeDeGangue;

    public Preso(String nome, Periculosidade periculosidade, boolean deficiencia, boolean chefeDeGangue) {
        this.nome = nome;
        this.periculosidade = periculosidade;
        this.deficiencia = deficiencia;
        this.chefeDeGangue = chefeDeGangue;
    }

    public String getNome() {
        return nome;
    }

    public int getOcupacao() {
        switch (periculosidade) {
            case CRÍTICA:
                return 10;
            case ALTA:
                return 5;
            case MEDIA:
                return 3;
            case BAIXA:
                return 1;
            default:
                return 0;
        }
    }

    public boolean temDeficiencia() {
        return deficiencia;
    }

    public boolean chefeDeGangue() {
        return chefeDeGangue;
    }
}

