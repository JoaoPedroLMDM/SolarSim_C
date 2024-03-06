/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solarsimc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import solarsimc.modelo.Cliente;
import solarsimc.modelo.Empresa;
import solarsimc.modelo.Orcamento;
import solarsimc.modelo.Projeto_solar;

/**
 *
 * @author Aluno
 */
public class SolarSim {

    static Scanner scanner = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<>();
    static List<Empresa> empresas = new ArrayList<>();
    static List<Orcamento> orcamentos = new ArrayList<>();
    static List<Projeto_solar> projetos = new ArrayList<>();
    
    public static void main(String[] args) {
        int opcao;

        do {
            menu();
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarEmpresa();
                    break;
                case 3:
                    cadastrarOrcamento();
                    break;
                case 4:
                    cadastrarProjetoSolar();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    listarEmpresas();
                    break;
                case 7:
                    listarOrcamentos();
                    break;
                case 8:
                    listarProjetos();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void menu() {
        System.out.println("----- MENU -------");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Empresa");
        System.out.println("3 - Cadastrar Orçamento");
        System.out.println("4 - Cadastrar Projeto Solar");
        System.out.println("5 - Listar Clientes");
        System.out.println("6 - Listar Empresas");
        System.out.println("7 - Listar Orçamentos");
        System.out.println("8 - Listar Projetos Solares");
        System.out.println("0 - Fechar");
    }

    private static void cadastrarCliente() {
        scanner.nextLine();
        System.out.println("---- CADASTRO DE CLIENTE ----");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a senha do cliente: ");
        String senha = scanner.nextLine();
        Cliente cliente = new Cliente(nome, endereco, email, telefone, cpf, senha);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarEmpresa() {
        scanner.nextLine();
        System.out.println("---- CADASTRO DE EMPRESA ----");
        System.out.print("Digite o nome da empresa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço da empresa: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o email da empresa: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone da empresa: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();
        Empresa empresa = new Empresa(nome, endereco, email, telefone, cnpj);
        empresas.add(empresa);
        System.out.println("Empresa cadastrada com sucesso!");
    }

    private static void cadastrarOrcamento() {
        scanner.nextLine();
        System.out.println("---- CADASTRO DE ORÇAMENTO ----");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorNome(nomeCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }
        System.out.print("Digite o tipo de gastos: ");
        String tipoGastos = scanner.nextLine();
        System.out.print("Digite o custo: ");
        String custo = scanner.nextLine();
        Orcamento orcamento = new Orcamento(cliente, tipoGastos, custo);
        orcamentos.add(orcamento);
        System.out.println("Orçamento cadastrado com sucesso!");
    }

    private static void cadastrarProjetoSolar() {
        System.out.println("---- CADASTRO DE PROJETO SOLAR ----");
        System.out.print("Digite a demanda: ");
        float demanda = scanner.nextFloat();
        System.out.print("Digite a quantidade de placas: ");
        int qtdPlacas = scanner.nextInt();
        System.out.print("Digite a potência do inversor: ");
        int potInversor = scanner.nextInt();
        System.out.print("Digite a quantidade de inversores: ");
        int qtdInversor = scanner.nextInt();
        System.out.print("Digite o valor dos equipamentos: ");
        float valorEquip = scanner.nextFloat();
        System.out.print("Digite o valor da mão de obra: ");
        float maoDeObra = scanner.nextFloat();
        Projeto_solar projeto = new Projeto_solar(demanda, qtdPlacas, potInversor, qtdInversor, valorEquip, maoDeObra);
        projetos.add(projeto);
        System.out.println("Projeto solar cadastrado com sucesso!");
    }

    private static void listarClientes() {
        System.out.println("---- CLIENTES CADASTRADOS ----");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println();
        }
    }

    private static void listarEmpresas() {
        System.out.println("---- EMPRESAS CADASTRADAS ----");
        for (Empresa empresa : empresas) {
            System.out.println("Nome: " + empresa.getNome());
            System.out.println("Endereço: " + empresa.getEndereco());
            System.out.println("Email: " + empresa.getEmail());
            System.out.println("Telefone: " + empresa.getTelefone());
            System.out.println("CNPJ: " + empresa.getCnpj());
            System.out.println();
        }
    }

    private static void listarOrcamentos() {
        System.out.println("---- ORÇAMENTOS CADASTRADOS ----");
        for (Orcamento orcamento : orcamentos) {
            System.out.println("Cliente: " + orcamento.getCliente().getNome());
            System.out.println("Tipo de gastos: " + orcamento.getTetodegastos());
            System.out.println("Custo: " + orcamento.getCusto());
            System.out.println();
        }
    }

    private static void listarProjetos() {
        System.out.println("---- PROJETOS SOLARES CADASTRADOS ----");
        for (Projeto_solar projeto : projetos) {
            System.out.println("Demanda: " + projeto.getDemanda());
            System.out.println("Quantidade de placas: " + projeto.getQtdPlacas());
            System.out.println("Potência do inversor: " + projeto.getPotInversor());
            System.out.println("Quantidade de inversores: " + projeto.getQtdInversor());
            System.out.println("Valor dos equipamentos: " + projeto.getValorEquip());
            System.out.println("Valor da mão de obra: " + projeto.getMaoDeObra());
            System.out.println();
        }
    }

    private static Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
    
}
