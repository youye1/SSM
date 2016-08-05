package cn.youye.smt.entity;

public class User {
    private String id;

    private String userName;

    private String loginName;

    private String password;

    private String phone;

    private String img;

    private String email;

    public User(String id, String userName, String loginName, String password, String phone, String img, String email) {
        this.id = id;
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.phone = phone;
        this.img = img;
        this.email = email;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}