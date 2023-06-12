package bridge;

public class Bridge {
    public static void main(String[] args) {
        ArquivoAbstrato arquivo;
        
        arquivo = new Extensoes(new TipoImagem());
        arquivo.mostrarInformacoes();
        arquivo = new Programas(new TipoImagem());
        arquivo.mostrarInformacoes();

        arquivo = new Extensoes(new TipoDocumento());
        arquivo.mostrarInformacoes();
        arquivo = new Programas(new TipoDocumento());
        arquivo.mostrarInformacoes();
        
        /*
        arquivo = new Extensoes(new TipoMusica());
        arquivo.mostrarInformacoes();
        arquivo = new Programas(new TipoMusica());
        arquivo.mostrarInformacoes();
        
        arquivo = new Extensoes(new TipoVideo());
        arquivo.mostrarInformacoes();
        arquivo = new Programas(new TipoVideo());
        arquivo.mostrarInformacoes();
        */
    }
}
