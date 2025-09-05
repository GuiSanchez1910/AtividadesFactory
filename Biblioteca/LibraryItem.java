public abstract class LibraryItem implements Borrowable {
    
    String title;
    String autor;
    int ano;

    public LibraryItem(String title, String autor, int ano) {
        this.title = title;
        this.autor = autor;
        this.ano = ano;
    }

    public LibraryItem() {}
    
    @Override
    public abstract String toString();

    @Override
    public abstract void borrow();
    
    @Override
    public abstract void returnItem();
}
