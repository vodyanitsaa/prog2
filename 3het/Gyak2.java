class Movie
{
    String title;
    int year;
    double score;
    public static int movieCnt;
    public Movie(String title, int year, double score)
    {
        this.title = title;
        this.year = year;
        this.score = score;
        this.setScore(score);  //DRY

        Movie.movieCnt += 1;
    }

    public void setScore(double newScore)
    {
        this.score = newScore;
        if (newScore < 0)
        {
            this.score = 0.0;
        }
        if(newScore > 10)
        {
            this.score = 10.0;
        }
    }

    public double getScore()
    {
        return this.score;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%d), %.1f", this.title, this.year, this.score);
    }
}

public class Gyak2
{
    public static void main(String[] args) {
        Movie m1 = new Movie("The Terminator", 1984, 8.1);
        Movie m2 = new Movie("Star Wars V", 1980, 8.7);

        System.out.println(m1);
        System.out.println(m2.getScore());
        System.out.println(Movie.movieCnt);
    }
}