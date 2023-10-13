
package com.mycompany.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class GerenciaBanco {
public static class ManipulaDados {
        private String nome;
        private long cpf;
        private int idade;
        private int numeroConta;
        private int senha;
        private double saldo = 1.000;
        private int entradaUsu;

        public ManipulaDados() {
            
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("INÍCIO DE PROGRAMA\n");
        
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
        
            System.out.print("Digite o seu CPF: ");
            cpf = scanner.nextLong();
        
            System.out.print("Digite sua Idade: ");
            idade = scanner.nextInt();
        
            System.out.print("Digite a numeração da sua conta (de 5 dígitos): ");
            numeroConta = scanner.nextInt();
        
            System.out.print("Digite a sua senha (de 4 Dígitos): ");
            senha = scanner.nextInt();
            
            
        
        }
        
        // Métodos para acessar os dados
        public String getNome() {
            return nome;
        }

        public long getCPF() {
            return cpf;
        }

        public int getIdade() {
            return idade;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public int getSenha() {
            return senha;
        }
        
        public double getSaldo() {
            return saldo;
        }
    }
    
    public static void main(String[] args) {
        ManipulaDados maniDados = new ManipulaDados();
        Scanner scanner = new Scanner(System.in);
        // Acesso aos dados
        System.out.println("\nDADOS DA CONTA: \n");
        
        System.out.println("Nome: " + maniDados.getNome());
        System.out.println("CPF: " + maniDados.getCPF());
        System.out.println("Idade: "+ maniDados.getIdade() + " anos.");
        System.out.println("Número da Conta: " + maniDados.getNumeroConta());
        System.out.println("Senha: ****\n");
        
        int escolha;
        int escolhaCase2;
        double valorTransferencia;
        double novoSaldo = 1000;
        double valorDeposito;
        double valorSaque;

        do {
            System.out.println("\nOPÇÕES DE MOVIMENTAÇÃO: \n");
            System.out.println("1 - Mostrar saldo.                            2 - Transferir.");
            System.out.println("3 - Sacar.                                    4 - Depositar.");
            System.out.println("5 - Sair.");
            System.out.print("\nDigite um número: \n");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu a Opção 1.\n");
                    System.out.println("                             Seu saldo é de: 1.000$");
                    break;
                case 2:
                    System.out.println("\nPara quem desejaria transferir? ");
                    System.out.println("1- João");
                    System.out.println("2- Maria");
                    System.out.println("3- Paulo");
                    System.out.print("\nDigite um número: ");
                    escolhaCase2 = scanner.nextInt();
                    
                    if (escolhaCase2 == 1 || escolhaCase2 == 2 || escolhaCase2 == 3) {
                        System.out.print("\nDigite uma quantia: ");
                        valorTransferencia = scanner.nextDouble();
                        novoSaldo = novoSaldo - valorTransferencia; 
                        System.out.println("\n                         Seu saldo atual é: " + novoSaldo + "0$");
                    } else {
                        System.out.println("\nOpção inválida, tente novamente!");
                    };
                    break;
                case 3:
                    System.out.println("\nVocê escolheu a Opção 3.");
                    System.out.print("\nDigite uma quantia: ");
                    valorSaque = scanner.nextDouble();
                    novoSaldo = novoSaldo - valorSaque;
                    System.out.println("\n                         Transferência concluída com sucesso.");
                    System.out.println("\n                           Seu saldo atual é: " + novoSaldo + "0$");
                    break;
                case 4:
                    System.out.println("\nVocê escolheu a Opção 4.");
                    System.out.print("\nDigite uma quantia: ");
                    valorDeposito = scanner.nextDouble();
                    novoSaldo = novoSaldo + valorDeposito;
                    System.out.println("\n                         Transsferência concluída com sucesso.");
                    System.out.println("\n                           Seu saldo atual é: " + novoSaldo + "0$");
                    break;
                case 5:
                    System.out.println("\n                         FIM DO PROGRAMA!");
                    break;
                default:
                    System.out.println("\n                         Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);
        
        scanner.close();

    }
}
