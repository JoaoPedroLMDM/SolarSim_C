    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solarsim;

public class Orcamento {
    private Cliente cliente;
    private String tetodegastos;
    private String custo;

    // Método construtor
    public Orcamento(Cliente cliente, String tetodegastos, String custo) {
        this.cliente = cliente;
        this.tetodegastos = tetodegastos;
        this.custo = custo;
    }

    // Métodos de acesso para o cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos de acesso para tetodegastos
    public String getTetodegastos() {
        return tetodegastos;
    }

    public void setTetodegastos(String tetodegastos) {
        this.tetodegastos = tetodegastos;
    }

    // Métodos de acesso para custo
    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }
}
