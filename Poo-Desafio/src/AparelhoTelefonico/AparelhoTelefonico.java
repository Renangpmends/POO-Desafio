package AparelhoTelefonico;

public class AparelhoTelefonico implements Ligar, Atender, CorreioVoz{
    
    public String ligar(String numero){
        return numero;
    }

    public void Atender(){
        System.out.println("Atendendo");
    }

    public void CorreioVoz(){
        System.out.println("Deixe uma mensagem");
    }
}