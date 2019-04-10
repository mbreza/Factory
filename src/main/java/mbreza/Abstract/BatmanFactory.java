package mbreza.Abstract;

public class BatmanFactory extends PopCultureFactory {
    @Override
    public Comic createComic() {
        return new BatmanComic();
    }

    @Override
    public Movie createMovie() {
        return new BatmanMovie();
    }
}
