package id.sch.smktelkom_mlg.privateassignment.xirpl619.movnews;

import java.io.Serializable;

/**
 * Created by Farras on 15-May-17.
 */

public class ListItem implements Serializable {
    private String head;
    private String desc;
    private String imageUrl;

    public ListItem(String head, String desc, String imageUrl) {
        this.head = head;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
