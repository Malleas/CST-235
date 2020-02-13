/**
 * All work is created by Matt Sievers on 02-13-2020 for use in CST-105
 */
public class Movie {

  private String title;
  private String imageLocation;
  private int year;
  private String genre;
  private String movieRating;
  private String studio;
  private String director;
  private double movieLength;
  private double rentalRate;
  private int inventoryCount;

  public Movie(String title, String imageLocation, int year, String genre, String movieRating, String studio,
               String director, double movieLength, double rentalRate, int inventoryCount) {
    this.title = title;
    this.imageLocation = imageLocation;
    this.year = year;
    this.genre = genre;
    this.movieRating = movieRating;
    this.studio = studio;
    this.director = director;
    this.movieLength = movieLength;
    this.rentalRate = rentalRate;
    this.inventoryCount = inventoryCount;
  }

  public Movie(){}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImageLocation() {
    return imageLocation;
  }

  public void setImageLocation(String imageLocation) {
    this.imageLocation = imageLocation;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(String movieRating) {
    this.movieRating = movieRating;
  }

  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public double getMovieLength() {
    return movieLength;
  }

  public void setMovieLength(double movieLength) {
    this.movieLength = movieLength;
  }

  public double getRentalRate() {
    return rentalRate;
  }

  public void setRentalRate(double rentalRate) {
    this.rentalRate = rentalRate;
  }

  public int getInventoryCount() {
    return inventoryCount;
  }

  public void setInventoryCount(int inventoryCount) {
    this.inventoryCount = inventoryCount;
  }

  @Override
  public String toString() {
    return "Movie{" +
            "title='" + title + '\'' +
            ", imageLocation='" + imageLocation + '\'' +
            ", year=" + year +
            ", genre='" + genre + '\'' +
            ", movieRating='" + movieRating + '\'' +
            ", studio='" + studio + '\'' +
            ", director='" + director + '\'' +
            ", movieLength=" + movieLength +
            ", rentalRate=" + rentalRate +
            ", inventoryCount=" + inventoryCount +
            '}';
  }
}
