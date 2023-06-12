package bridge;

public class TipoVideo implements ArquivoImplementado{
    @Override
    public void mostrarExtensoes(String mensagemExtensao){
        System.out.println(mensagemExtensao + "video:");
        System.out.println(".mp4");
        System.out.println(".avi");
        System.out.println(".mkv");
        System.out.println();
    }
    
    public void mostrarProgramas(String mensagemPrograma){
        System.out.println(mensagemPrograma + "video:");
        System.out.println("Windows Media Player");
        System.out.println("VLC Media Player");
        System.out.println("QuickTime Player");
        System.out.println();
    }
    
}
