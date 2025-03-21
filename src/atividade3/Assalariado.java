/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author ProgramaçãoComDaniel
 */
public class Assalariado extends Funcionario {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public Assalariado(float salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }    
    
    @Override
    public void exibirDados() {
        
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
        System.out.println("Salário: " + salario);
        System.out.println("----------------");
    }

    @Override
    public float aplicarAumento(float valor) {
        salario += salario * (valor/100);
        return salario;
    }

    @Override
    public float pagamentoApenas() {
        return salario;
    }

    @Override
    public float calcular() {
        return salario;
    }
    
}
