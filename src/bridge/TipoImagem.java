package bridge;

public class TipoImagem implements ArquivoImplementado{
    @Override
    public void mostrarExtensoes(String mensagemExtensao){
        System.out.println(mensagemExtensao + "imagem:");
        System.out.println(".jpg");
        System.out.println(".png");
        System.out.println(".gif");
        System.out.println();
    }
    
    public void mostrarProgramas(String mensagemPrograma){
        System.out.println(mensagemPrograma + "imagem:");
        System.out.println("Adobe Photoshop");
        System.out.println("GIMP");
        System.out.println("Paint 3D");
        System.out.println();
    }
    
}
