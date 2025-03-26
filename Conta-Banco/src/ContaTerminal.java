import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome Completo: ");
        String nomeCompleto = captalized(sc.nextLine());

        System.out.print("Digite o número da Conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da Agência: ");
        String agencia = formatarAgencia(sc.nextLine());

        System.out.print("Digite seu saldo: R$");
        double saldo = sc.nextDouble();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
            nomeCompleto,
            agencia,
            conta,
            saldo
        );

    }

    static String captalized(String nomeString) {
        String[] nomeStringArray = nomeString.split("");
        String nomeFormatado = "";

        for (int i = 0; i < nomeStringArray.length; i++) {
            if (i == 0 || nomeStringArray[i-1].equals(" ")) {
                nomeFormatado += nomeStringArray[i].toUpperCase();
            } else {
                nomeFormatado += nomeStringArray[i];
            }
        }

        return nomeFormatado;
    }

    static String formatarAgencia(String agencia) {
        String[] agenciaArray = agencia.split("");
        String agenciaFormatada = "";

        for (int i = 0; i < agenciaArray.length; i++) {
            if (agenciaArray[i].equals("-")) {
                return agencia;
            }
        }

        for (int i = 0; i < agenciaArray.length; i++) {
            agenciaFormatada += agenciaArray[i];
            if(i == 2) {
                agenciaFormatada += "-";
            }
        }

        return agenciaFormatada;
    }
}
