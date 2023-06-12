package bridge;

public abstract class ArquivoAbstrato {
    protected ArquivoImplementado arquivo;
    
    public ArquivoAbstrato(ArquivoImplementado arq){
        arquivo = arq;
    }
    
    public void mostrandoExtensoes(String tipoArquivo){
        arquivo.mostrarExtensoes(tipoArquivo);   
    }
    
    public void mostrandoProgramas(String tipoArquivo){
        arquivo.mostrarProgramas(tipoArquivo);
    }
  
    public abstract void mostrarInformacoes();

}
