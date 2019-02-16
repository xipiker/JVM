package pers.xipiker.jvm5;

import java.util.Date;

public class User {
    private String name;
    private Integer age;
    private Date birth;
    private Boolean flag;

    //会先执行构造方法
    public User(){
        System.out.println("start ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    //然后执行toString()
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", flag=" + flag +
                '}';
    }
}
