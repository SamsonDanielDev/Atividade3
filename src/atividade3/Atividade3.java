package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Informe o nome do funcionario: ");
            String nome = in.nextLine();
            System.out.print("Informe o CPF: ");
            String cpf = in.nextLine();
            System.out.print("Informe o endereço: ");
            String endereco = in.nextLine();
            System.out.print("Informe o telefone: ");
            String telefone = in.nextLine();
            System.out.print("Informe o setor: ");
            String setor = in.nextLine();

            System.out.print("Funcionário [A]ssalariado ou [H]orista? (não insira entradas inválidas)");

            String resposta = "A";
            resposta = in.nextLine();
            if (resposta.equalsIgnoreCase("A")) {
                System.out.print("Informe o salário: ");
                float salario = in.nextFloat();
                in.nextLine();
                funcionarios[i] = new Assalariado(salario, nome, cpf, endereco, telefone, setor);

            }
            if (resposta.equalsIgnoreCase("H")) {
                System.out.print("Informe o valor da hora: ");
                float valorHora = in.nextFloat();

                System.out.print("Informe as horas trabalhadas: ");
                float horasTrabalhadas = in.nextFloat();
                in.nextLine();
                
                funcionarios[i] = new Horista(horasTrabalhadas, valorHora, nome, cpf, endereco, telefone, setor);
                funcionarios[i].calcular();
            } else if (!resposta.equals("A") && !resposta.equals("H")) {
                System.out.println("Valor inválido.");
            }

        }

        System.out.println("\n Resultados: \n");
        
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Funcionário: " + (i + 1) + "\n");
            funcionarios[i].exibirDados();

        }
        
        System.out.println("\n Vamos aplicar um aumento geral!");
        System.out.println("Informe o aumento: ");
        float aumento = in.nextFloat();
        in.nextLine();
        
       for (int i = 0; i < funcionarios.length; i++) {
           funcionarios[i].aplicarAumento(aumento);
           System.out.println("Funcionário " + (i+1) + " receberá: " + funcionarios[i].pagamentoApenas());
       }

    }

}
