package me.jdan.po;

import java.util.Date;

/**
 * Created by jdan on 2016/10/31.
 */
public class ShortNews {
    private String newsid;
    private String title;
    private String authorname;
    private Date releasedate;
    private String newsintro;
    private String categoryname;

    public ShortNews() {
    }

    public ShortNews(String newsid, String title, String authorname, Date releasedate, String newsintro, String categoryname) {
        this.newsid = newsid;
        this.title = title;
        this.authorname = authorname;
        this.releasedate = releasedate;
        this.newsintro = newsintro;
        this.categoryname = categoryname;
    }

    public String getNewsid() {
        return newsid;
    }

    public void setNewsid(String newsid) {
        this.newsid = newsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getNewsintro() {
        return newsintro;
    }

    public void setNewsintro(String newsintro) {
        this.newsintro = newsintro;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
