package NavegadorInternet;

public class NavegadorInternet implements AdicionarNovaAba, ExibirPagina, AtualizarPagina{
    
    public void AdicionarNovaAba(){
        System.out.println("Adicionando uma nova pagina");
    }

    public String ExibirPagina(String url){
        return url;
    }

    public void AtualizarPagina(){
        System.out.println("Atualizando a pagina");
    }
}
