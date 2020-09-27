package group1.userdemo;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;//Each user will be given an auto-generated unique identifier when stored

    @Column(name = "email", nullable = false, unique = true)
    private String email;      //save the user email

    //save the user name
    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "loginTime", nullable = true)
    private OffsetDateTime loginTime;

    @Column(name = "logoutTime", nullable = true)
    private OffsetDateTime logoutTime;

    @Column(name = "loginSource", nullable = false)
    private String loginSource;


    //getter && setter
    public String getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(String value) {
        this.loginSource = value;
    }


    public OffsetDateTime getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(OffsetDateTime value) {
        this.loginTime = value;
    }


    public OffsetDateTime getLogoutTime() {
        return logoutTime;
    }
    public void setLogoutTime(OffsetDateTime value) {
        this.logoutTime = value;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String value) {
        this.firstname = value;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String value) {
        this.lastname = value;
    }
}
