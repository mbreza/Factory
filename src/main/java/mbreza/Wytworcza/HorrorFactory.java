package mbreza.Wytworcza;

public class HorrorFactory extends BookFactory {

    @Override
    public Book createBook() {
        return new Fantasy();
    }

}
