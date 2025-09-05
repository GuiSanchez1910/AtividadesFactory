public class FactoryDigitalMedia implements FactoryLibraryItem {

    public String title;
    public String autor;
    public int ano;
    public String fileFormat;

    public FactoryDigitalMedia(String title, String autor, int ano, String fileFormat) {
        this.title = title;
        this.autor = autor;
        this.ano = ano;
        this.fileFormat = fileFormat;
    }

    @Override
    public LibraryItem create(){
        return new DigitalMedia(title, autor, ano, fileFormat);
    }

}