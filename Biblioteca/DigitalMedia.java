public class DigitalMedia extends LibraryItem {

    String fileFormat;

    public DigitalMedia(String title, String autor, int ano, String fileFormat) {
        super(title, autor, ano);
        this.fileFormat = fileFormat;
    }

    public DigitalMedia() {}

    @Override
    public void borrow() {
        System.out.println("------------------------------------------"
            + "\nA Mídia Digital '" + title + "' foi emprestada!"
            + "\n------------------------------------------");
    }

    @Override
    public void returnItem() {
        System.out.println("------------------------------------------"
            + "\nA Mídia Digital '" + title + "' foi devolvida!"
            + "\n------------------------------------------");
    }

    @Override
    public String toString() {
        return "Detalhes da Mídia Digital\n"
            + "Título = " + title
            + ", \nAutor = " + autor
            + ", \nAno = " + ano
            + ", \nFormato = " + fileFormat
            + "\n------------------------------------------";
    }

    void play() {
        System.out.println("Tocando a mídia digital: " + this.title
            + "\n------------------------------------------");
    }
}
