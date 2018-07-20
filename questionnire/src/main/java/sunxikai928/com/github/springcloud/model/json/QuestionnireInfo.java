package sunxikai928.com.github.springcloud.model.json;

import sunxikai928.com.github.springcloud.core.model.DBObject;

/**
 * Created by sunxikai on 18/7/20.
 */
public class QuestionnireInfo extends DBObject {
    /**
     * 问卷id
     */
    private long id;
    /**
     * 问卷名称
     */
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
