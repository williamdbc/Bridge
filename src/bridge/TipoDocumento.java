package bridge;

public class TipoDocumento implements ArquivoImplementado{
    @Override
    public void mostrarExtensoes(String mensagemExtensao){
        System.out.println(mensagemExtensao + "documento:");
        System.out.println(".pdf");
        System.out.println(".docx");
        System.out.println(".txt");
        System.out.println();
    }
    
    public void mostrarProgramas(String mensagemPrograma){
        System.out.println(mensagemPrograma + "documento:");
        System.out.println("Microsoft Word");
        System.out.println("Google Docs");
        System.out.println("Adobe Acrobat Reader");
        System.out.println();
    }
    
}
