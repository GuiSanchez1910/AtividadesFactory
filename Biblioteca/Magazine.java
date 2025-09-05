public class Magazine extends LibraryItem {

    int issueNumber;

    public Magazine(String title, String autor, int ano, int issueNumber) {
        super(title, autor, ano);
        this.issueNumber = issueNumber;
    }

    public Magazine() {}

    @Override
    public void borrow() {
        System.out.println("------------------------------------------" 
            + "\nA Magazine '" + title + "' foi emprestada!" 
            + "\n------------------------------------------");
    }

    @Override
    public void returnItem() {
        System.out.println("------------------------------------------" 
            + "\nA Magazine '" + title + "' foi devolvida!" 
            + "\n------------------------------------------");
    }

    @Override
    public String toString() {
        return "Detalhes da Magazine\n"
            + "Título = " + title 
            + ", \nAutor = " + autor 
            + ", \nAno = " + ano 
            + ", \nNúmero da edição = " + issueNumber 
            + "\n------------------------------------------";
    }

    void flipPages() {
        System.out.println("Folheando as páginas da magazine: " + this.title 
            + "\n------------------------------------------");
    }
}
