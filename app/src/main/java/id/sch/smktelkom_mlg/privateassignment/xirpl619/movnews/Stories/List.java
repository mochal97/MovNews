package id.sch.smktelkom_mlg.privateassignment.xirpl619.movnews.Stories;

import java.io.Serializable;

/**
 * Created by Mochammad Alauddin on 5/14/2017.
 */

public class List implements Serializable {
    private String image;
    private String judul;
    private String popular;

    public List(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }
}