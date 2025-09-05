public class User {

    public void borrow(LibraryItem item){
        item.borrow();
    }

    public void returnItem(LibraryItem item){
        item.returnItem();
    }
}
