package com.technicalblogapplication.tecnicalblogapplication.Model;
import java.util.*;

public class Post {
    private String Title;
    private String Body;
    private Date date;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
