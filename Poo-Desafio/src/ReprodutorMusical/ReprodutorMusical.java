package ReprodutorMusical;

public class ReprodutorMusical implements Tocar, Pausar, SelecionarMusica{
    
    public void Tocar(){
        System.out.println("Tocando...");
    }

    public void Pausar(){
        System.out.println("Musica Pausada");
    }

    public String SelecionarMusica(String musica){
        return musica;
    }
}
