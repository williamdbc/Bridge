package bridge;

public class TipoMusica implements ArquivoImplementado{
    @Override
    public void mostrarExtensoes(String mensagemExtensao){
        System.out.println(mensagemExtensao + "musica:");
        System.out.println(".mp3");
        System.out.println(".wav");
        System.out.println(".flac");
        System.out.println();
    }
    
    public void mostrarProgramas(String mensagemPrograma){
        System.out.println(mensagemPrograma + "musica:");
        System.out.println("iTunes");
        System.out.println("Spotify");
        System.out.println("Groove Music");
        System.out.println();
    }
    
}
