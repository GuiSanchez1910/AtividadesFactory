public class Book extends LibraryItem {

    String genre;

    public Book(String title, String autor, int ano, String genre) {
        super(title, autor, ano); 
        this.genre = genre;
    }

    public Book() {}

    @Override
    public void borrow() {
        System.out.println("------------------------------------------" + "\nO Livro '" 
                            + title +"' foi emprestado! " + "\n------------------------------------------");
    }

    @Override
    public void returnItem() {
        System.out.println("O Livro '" 
                            + title +"' foi devolvido! " + "\n------------------------------------------");
    }

    @Override
    public String toString() {
        return "Detalhes do Livro\n" + "Gênero = " + genre + ", \nTítulo = " + title + ", \nAutor = " + autor + ", \nAno = " + ano + "\n------------------------------------------";
    }

    void readSample() {
        System.out.println("Lendo amostra do livro: " + this.title +  "\n------------------------------------------");
    }
}
