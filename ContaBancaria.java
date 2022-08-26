import java.util.Scanner;

public class ContaBancaria {
  String nome;
  String cpf;
  double saldo;

  public ContaBancaria(String nome, String cpf, double saldo) {
    this.nome = nome;
    this.cpf = cpf;
    this.saldo = saldo;
  }

  public void sacar(double saldo, double saque) {
    if (saque > saldo)
      System.out.println("Você não possui saldo suficiente!");
    else
      this.saldo -= saque;
  }

  public void depositar(double saldo, double deposito) {
    this.saldo += deposito;
  }

  public void exibir(double saldo) {
    System.out.println(this.saldo);
  }

  public static void main(String[] args) {
    String nome, cpf;
    double saldo, saque, deposito;
    int opcao;

    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    nome = sc.nextLine();
    System.out.print("Cpf: ");
    cpf = sc.nextLine();
    System.out.print("Saldo: ");
    saldo = sc.nextDouble();

    ContaBancaria cliente = new ContaBancaria(nome, cpf, saldo);

    while (true) {
      System.out.println("(1) Realizar saque.");
      System.out.println("(2) Realizar depósito.");
      System.out.println("(3) Exibir saldo:");
      System.out.println("(4) Finalizar programa:");
      System.out.print("Selecione uma opção: ");
      opcao = sc.nextInt();

      if (opcao == 1) {
        System.out.print("Valor do saque: ");
        saque = sc.nextDouble();
        cliente.sacar(cliente.saldo, saque);
      } else if (opcao == 2) {
        System.out.print("Valor do deposito: ");
        deposito = sc.nextDouble();
        cliente.depositar(cliente.saldo, deposito);
      } else if (opcao == 3)
        cliente.exibir(cliente.saldo);

      else if (opcao == 4)
        break;

    }
  }
}
