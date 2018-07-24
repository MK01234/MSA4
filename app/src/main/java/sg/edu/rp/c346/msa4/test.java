package sg.edu.rp.c346.msa4;

import java.util.Calendar;

/**
 * Created by 17045740 on 24/7/2018.
 */

public class test {
    private String name;
    private String year;
    private String rating;
    private String genre;
    private Calendar date;
    private String theatre;
    private String des;
    private boolean rate;

    public boolean isRate() {
        return rate;
    }

    public void setRate(boolean rate) {
        this.rate = rate;
    }

    public test(String name, String year, String rating, String genre, Calendar date, String theatre, String des, boolean rate) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.date = date;
        this.theatre = theatre;
        this.des = des;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", date=" + date +
                ", theatre='" + theatre + '\'' +
                ", des='" + des + '\'' +
                ", rate=" + rate +
                '}';
    }



}

