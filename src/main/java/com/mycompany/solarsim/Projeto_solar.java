/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solarsim;

/**
 *
 * @author Aluno
 */
public class ProjetoSolar {

    private float demanda;
    private int qtdPlacas;
    private int potInversor;
    private int qtdInversor;
    private float valorEquip;
    private float maoDeObra;

    // Construtor da classe
    public ProjetoSolar(float demanda, int qtdPlacas, int potInversor, int qtdInversor, float valorEquip, float maoDeObra) {
        this.demanda = demanda;
        this.qtdPlacas = qtdPlacas;
        this.potInversor = potInversor;
        this.qtdInversor = qtdInversor;
        this.valorEquip = valorEquip;
        this.maoDeObra = maoDeObra;
    }

    // Métodos de acesso para a demanda
    public float getDemanda() {
        return demanda;
    }

    public void setDemanda(float demanda) {
        this.demanda = demanda;
    }

    // Métodos de acesso para qtdPlacas
    public int getQtdPlacas() {
        return qtdPlacas;
    }

    public void setQtdPlacas(int qtdPlacas) {
        this.qtdPlacas = qtdPlacas;
    }

    // Métodos de acesso para potInversor
    public int getPotInversor() {
        return potInversor;
    }

    public void setPotInversor(int potInversor) {
        this.potInversor = potInversor;
    }

    // Métodos de acesso para qtdInversor
    public int getQtdInversor() {
        return qtdInversor;
    }

    public void setQtdInversor(int qtdInversor) {
        this.qtdInversor = qtdInversor;
    }

    // Métodos de acesso para valorEquip
    public float getValorEquip() {
        return valorEquip;
    }

    public void setValorEquip(float valorEquip) {
        this.valorEquip = valorEquip;
    }

    // Métodos de acesso para maoDeObra
    public float getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(float maoDeObra) {
        this.maoDeObra = maoDeObra;
    }
}
