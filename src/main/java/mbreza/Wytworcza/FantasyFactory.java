package mbreza.Wytworcza;

public class FantasyFactory extends BookFactory {

    @Override
    public Book createBook() {
        return new Fantasy();
    }
}
