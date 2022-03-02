package movies;

public class Movie {

    public static void main(String[] args) {

    }

    private String moviename; // <----- Here i'm initializing my string name to be used
    private String category; // <----- Here i'm initializing my string name to be used


    // --- Here I'm defining my Constructor ---//
    public Movie(String moviename, String category){
        this.moviename = moviename;
        this.category = category;
    }

    public void addMovie(String moviename, String category){
        this.moviename = moviename;
        this.category = category;
    }


    // --- Below are my method getMovie to pull the movie name from the MoviesArray.java
    public String getMoviename(){
        return this.moviename;
    }

    // --- Below are my method getCategory to pull the movie category from the MoviesArray.java
    public String getCategory(){
        return this.category;
    }


}


