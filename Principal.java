package exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.cargo = "Assistente";

        System.out.print("Digite o número de seu crachá: ");
        funcionario.cracha = sc.nextInt();
        System.out.print("Digite seu salário: ");
        funcionario.salario = sc.nextFloat();

        Funcionario dados = new Funcionario(funcionario.cracha, funcionario.salario,  funcionario.cargo);

        System.out.println("Cargo: " + dados.cargo +"\n" + "Crachá: " + dados.cracha + "\n" +
                "Salário: " + dados.salario +"\n");

        System.out.println("Porcentagem de aumento: " +dados.calculaAumento() +"%");
        System.out.print("Tempo de trabalho(em anos): ");
        System.out.println("Salário com aumento: " +dados.calculaAumento(sc.nextInt()));
    }
}
