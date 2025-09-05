public class LibraryManagmentSystem {
    public static void main(String[] args) {

        FactoryLibraryItem bookFactory = new FactoryBook("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy");
        FactoryLibraryItem magazineFactory = new FactoryMagazine("National Geographic", "Vários", 2025, 12);
        FactoryLibraryItem digitalFactory = new FactoryDigitalMedia("Interstellar", "Christopher Nolan", 2014, "MP4");

        User user = new User();

        LibraryItem bookItem = bookFactory.create();
        user.borrow(bookItem);
        ((Book) bookItem).readSample();
        user.returnItem(bookItem);
        System.out.println(bookItem.toString());   

        LibraryItem magazineItem = magazineFactory.create();
        user.borrow(magazineItem);
        ((Magazine) magazineItem).flipPages();
        user.returnItem(magazineItem);
        System.out.println(magazineItem.toString());

        LibraryItem digitalItem = digitalFactory.create();
        user.borrow(digitalItem);
        ((DigitalMedia) digitalItem).play();
        user.returnItem(digitalItem);
        System.out.println(digitalItem.toString());

    }
}   