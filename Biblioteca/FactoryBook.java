public class FactoryBook implements FactoryLibraryItem {

    public String title;
    public String autor;
    public int ano;
    public String genre;

    public FactoryBook(String title, String autor, int ano, String genre) {
        this.title = title;
        this.autor = autor;
        this.ano = ano;
        this.genre = genre;
    }

    @Override
    public LibraryItem create(){
        return new Book(title, autor, ano, genre);
    }

}
