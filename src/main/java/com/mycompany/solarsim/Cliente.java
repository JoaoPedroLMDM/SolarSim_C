/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solarsim;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa {
    String cpf;
    String senha;

    // Construtor da classe Cliente
    public Cliente(String nome, String endereco, String email, String telefone, String cpf, String senha) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
        this.senha = senha;
    }

    // Métodos de acesso para a classe Cliente
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
