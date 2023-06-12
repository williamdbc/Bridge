package bridge;

public class Extensoes extends ArquivoAbstrato{
    public Extensoes(ArquivoImplementado arq) {
        super(arq);
    }
    
    @Override
    public void mostrarInformacoes(){
        mostrandoExtensoes("Mostrando extensoes de ");
    }
   
}

    /*public void programas(){
        mostrandoProgramas("Mostrando programas que suportam ");
    }
*/