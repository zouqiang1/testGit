package pojo;

import java.io.Serializable;

/**
 * 描述:
 * 公共类
 *
 * @ClassName: User
 * @author:zq
 * @create 2020-09-22 10:58
 * @Version:2.1
 */
public class User implements Serializable {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
