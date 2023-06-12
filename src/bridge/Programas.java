package bridge;

public class Programas extends ArquivoAbstrato{
    public Programas(ArquivoImplementado arq) {
        super(arq);
    }
    
    @Override
    public void mostrarInformacoes(){
        mostrandoProgramas("Mostrando programas que suportam ");
    }
   
}