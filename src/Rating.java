import java.util.Date;

public class Rating {
    private String user; //who gives the rating
    private int rating;
    private String comment;
    private Date date;

    public Rating(String user, int rating, String comment, Date date) throws Exception {
        if(rating < 1 || rating > 10){
            throw new Exception("Rating should be between 1 and 10");
        }
        this.user = user;
        this.rating = rating;
        if(comment == null) this.comment = "";
        else this.comment = comment;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }
}
