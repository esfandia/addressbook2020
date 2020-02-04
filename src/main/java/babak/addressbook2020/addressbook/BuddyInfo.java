package babak.addressbook2020.addressbook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String phone;

    public BuddyInfo() {
        name = "toto";
        phone = "1234";
    }

    public BuddyInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {return name;};
    public void setName(String name) {this.name = name;};

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
