import java.util.Scanner;

public class SistemaSentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do profissional: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua ocupação: (zelador, engenheiro, cientista ou administrativo)");
        String cargo = sc.nextLine();

        System.out.println("Digite seu nível de acesso: (1-10) ");
        int acesso = sc.nextInt();

        System.out.println("Digite o nível da área que deseja acessar: (1-10) ");
        int area = sc.nextInt();

        if (acesso < 1 || acesso > 10) {
            System.out.println("ERRO: Nível de acesso inválido.");
            return;
        }
            boolean acessoPermitido = acesso >= area; 

            System.out.println(nome + " (" + cargo +") - ");
            
        if (acessoPermitido) {
            int SaldoAutoridade = acesso - area;
            System.out.println("ACESSO PERMITIDO. Saldo de autoridade positivo: " + SaldoAutoridade);
        }

        else {
            System.out.println("ACESSO NEGADO");
        }

        if (acesso < 3 && area > 7) {
            System.out.println("ALERTA: tentativa de acesso indevida detectada!");            
        }

        sc.close();

        
    }
}