package mbreza.Abstract;

public class IronManFactory extends PopCultureFactory{
    @Override
    public Comic createComic() {
        return new IronManComic();
    }

    @Override
    public Movie createMovie() {
        return new IronManMovie();
    }
}
