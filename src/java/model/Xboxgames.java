
package model;



public class Xboxgames {
    private int gameid;
    private String title;
    private int relasedate;
    private String developer;
    private String rating;
    
    public Xboxgames() {
        this.gameid = 0;
        this.title = "";
        this.relasedate = 0;
        this.developer = "";
        this.rating = "";
    }

    public Xboxgames(int gameid, String title, int relasedate, String developer, String rating) {
        this.gameid = gameid;
        this.title = title;
        this.relasedate = relasedate;
        this.developer = developer;
        this.rating = rating;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelasedate() {
        return relasedate;
    }

    public void setRelasedate(int relasedate) {
        this.relasedate = relasedate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Xboxgames{" + "gameid=" + gameid + ", title=" + title + ", relasedate=" + relasedate + ", developer=" + developer + ", rating=" + rating + '}';
    }
    
    
    
    
    
}
