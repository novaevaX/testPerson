package example.Model;

import javax.persistence.*;

@Entity //модель / сущность
@Table(name = "person")
public class Person {
    @Id //PrimaryKey
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "mail")
    private String mail;
    @Column(name = "age")
    private int age;
    @Column(name = "position")
    private String position;

    public Person() {
    }

    public Person(int id, String name, String mail, int age, String position) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
