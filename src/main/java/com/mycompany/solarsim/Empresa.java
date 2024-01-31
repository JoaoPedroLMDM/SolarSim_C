/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solarsim;

/**
 *
 * @author Aluno
 */
public class Empresa extends Pessoa {
    String cnpj;

    // Construtor da classe Empresa
    public Empresa(String nome, String endereco, String email, String telefone, String cnpj) {
        super(nome, endereco, email, telefone);
        this.cnpj = cnpj;
    }

    // Método de acesso para a classe Empresa
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
