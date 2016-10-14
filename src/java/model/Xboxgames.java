
package model;



public class Xboxgames {
    private int gameid;
    private String title;
    private int releasedate;
    private String developer;
    private String rating;
    
    
    public Xboxgames() {
        this.gameid = 0;
        this.title = "";
        this.releasedate = 0;
        this.developer = "";
        this.rating = "";
    }

    public Xboxgames(int gameid, String title, int releasedate, String developer, String rating) {
        this.gameid = gameid;
        this.title = title;
        this.releasedate = releasedate;
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

    public int getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
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
        return "Xboxgames{" + "gameid=" + gameid + ", title=" + title + ", releasedate=" + releasedate + ", developer=" + developer + ", rating=" + rating + '}';
    }
       
    
}
