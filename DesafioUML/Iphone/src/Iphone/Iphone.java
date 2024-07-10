package Iphone;

import Iphone.apps.NavegadorDeInternet;
import Iphone.apps.ReprodutorMusical;
import Iphone.apps.TelefoneCelular;

public class Iphone implements NavegadorDeInternet, TelefoneCelular, ReprodutorMusical {

    public static void main(String[] args) {
        
    }

    public void ReproduzirMusica() {
        System.out.println("Reproduzindo música!");
    }
    
    public void PausarMusica() {
        System.out.println("Pausando música!");
    }
    
    public void ProximaMusica() {
        System.out.println("Próxima música!");
    }
    
    public void IniciarChamada(String contato) {
        System.out.println("Ligando para: " + contato);
    }
    
    public void FinalizarChamada() {
        System.out.println("Finalizando chamada!");
    }
    
    public void AtenderChamada() {
        System.out.println("Atendendo ligação!");
    }
    
    public void NavegarParaPagina(String endereco) {
        System.out.println("Navagando para página: " + endereco);
    }
    
    public void AtualizarPagina() {
        System.out.println("Atualizando página!");
    }
    
    public void FecharPagina() {
        System.out.println("Fechando página!");
    }
    
}