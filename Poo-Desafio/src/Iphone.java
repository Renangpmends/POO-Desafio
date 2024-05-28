import java.util.Scanner;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione uma opção: 1-ReproducaoMusical 2-AparelhoTelefonico 3-NavegadorInternet");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            ReprodutorMusical reprodutor = new ReprodutorMusical();
            System.out.println("Selecione uma musica");
            String musica = scanner.next();
            reprodutor.SelecionarMusica(musica);
            reprodutor.Tocar();
            reprodutor.Pausar();
        }
        else if(opcao == 2){
            AparelhoTelefonico telefone = new AparelhoTelefonico();
            System.out.println("Digite um numero");
            String numero = scanner.next();
            telefone.ligar(numero);
            telefone.Atender();
            telefone.CorreioVoz();
        }
        else{
            NavegadorInternet internet = new NavegadorInternet();
            System.out.println("Digite um link");
            String link = scanner.next();
            internet.ExibirPagina(link);
            internet.AdicionarNovaAba();
            internet.AtualizarPagina();
        }
    }
}
