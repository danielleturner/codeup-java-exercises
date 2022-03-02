package movies;


import java.util.Arrays;
import java.util.Scanner;

public class MovieApplication {

    public static Movie[] movielist =  MoviesArray.findAll();

    public static void MovieMenu(){


        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - would you like to add a movie\n" +
                "7 - would you like to add a movie\n" +
                "\n" +
                "Enter your choice: ");

        int userInput = input.nextInt();
//        System.out.println(userInput);
        if(userInput == 1){
            System.out.println(Arrays.toString(movielist));
            for(Movie movie : movielist){
                System.out.println("Movie name: " + movie.getMoviename() + " Category: " + movie.getCategory());
            }
        }else if(userInput == 2){
            for(Movie movie : movielist){
                if(movie.getCategory().equalsIgnoreCase("animated")){
                    System.out.println("Movie name: " + movie.getMoviename() + " Category: " + movie.getCategory());
                }
            }
        }else if(userInput == 3){
            for(Movie movie : movielist){
                if(movie.getCategory().equalsIgnoreCase("drama")){
                    System.out.println("Movie name: " + movie.getMoviename() + " Category: " + movie.getCategory());
                }
            }
        }else if(userInput == 4){
            for(Movie movie : movielist){
                if(movie.getCategory().equalsIgnoreCase("horror")){
                    System.out.println("Movie name: " + movie.getMoviename() + " Category: " + movie.getCategory());
                }
            }
        }else if(userInput == 5){
            for(Movie movie : movielist){
                if(movie.getCategory().equalsIgnoreCase("scifi")){
                    System.out.println("Movie name: " + movie.getMoviename() + " Category: " + movie.getCategory());
                }
            }
        }else if(userInput == 6){
            System.out.println("Please enter the movie name");
            String moviename = input.next();
//            System.out.println(moviename);
            System.out.println("Please enter the movie category");
            String moviecategory = input.next();
//            System.out.println(moviecategory);
            System.out.println(moviename + " " + moviecategory);

            Movie movie = new Movie(moviename, moviecategory);
            Movie[] newMovieList = Arrays.copyOf(movielist, movielist.length + 1);
            newMovieList[newMovieList.length - 1] = movie;
            movielist = newMovieList;
            MovieMenu();


        }else if(userInput == 7){
            movielist = MoviesArray.findAll(); // <-- this changes the new movilist back to the original
        }
        MovieMenu();
    }


    public static void main(String[] args) {

        MovieMenu();




    }
}
