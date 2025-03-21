/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author ProgramaçãoComDaniel
 */
public class Horista extends Funcionario {

    private float horasTrabalhadas;
    private float valorHora;
    private float total = calcular();

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Horista(float horasTrabalhadas, float valorHora, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora; 
    }
 
    
    @Override
    public float calcular() {
        return total = horasTrabalhadas*valorHora;
    }
    @Override
    public void exibirDados() {
     
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
        System.out.println("Total a receber: " + total);
        System.out.println("----------------");
    }

    @Override
    public float aplicarAumento(float valor) {
        total += total * (valor / 100);
        return total;
    }

    @Override
    public float pagamentoApenas() {
       return total;
    }

   
}
