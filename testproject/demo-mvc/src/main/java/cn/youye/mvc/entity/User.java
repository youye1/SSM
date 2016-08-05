package cn.youye.mvc.entity;


/**
 * Created by pc on 2016/7/12.
 */
public class User {

    private String id;

    private String name;

    private String password;

    private String icon;

    public User(String id, String name, String password, String icon) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.icon = icon;
    }

    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
