public class FactoryMagazine implements FactoryLibraryItem {

    public String title;
    public String autor;
    public int ano;
    public int issueNumber;

    public FactoryMagazine(String title, String autor, int ano, int issueNumber) {
        this.title = title;
        this.autor = autor;
        this.ano = ano;
        this.issueNumber = issueNumber;
    }

    @Override
    public LibraryItem create(){
        return new Magazine(title, autor, ano, issueNumber);
    }

}
