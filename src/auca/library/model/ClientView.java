package auca.library.model;
// Generated May 6, 2020 1:50:29 PM by Hibernate Tools 4.3.1


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClientView generated by hbm2java
 */
@Entity
@Table(name = "ClientView")
public class ClientView  implements java.io.Serializable {

     private String regno;
     private String firstname;
     private String lastname;
     private String phonenumber;
     private String emailaddress;
     private String clientcategory;
     private String  photo;
     private Set<CheckinoutView> checkinoutViews;

    public ClientView() {
    }

	
    public ClientView(String regno) {
        this.regno = regno;
    }

    public ClientView(String regno, String firstname, String lastname, String phonenumber, String emailaddress, String clientcategory, String photo, Set<CheckinoutView> checkinoutViews) {
        this.regno = regno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
        this.clientcategory = clientcategory;
        this.photo = photo;
        this.checkinoutViews = checkinoutViews;
    }
    
    @Id
    @Column(name = "regno")
    public String getRegno() {
        return this.regno;
    }
    
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmailaddress() {
        return this.emailaddress;
    }
    
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getClientcategory() {
        return this.clientcategory;
    }
    
    public void setClientcategory(String clientcategory) {
        this.clientcategory = clientcategory;
    }
    public String  getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String  photo) {
        this.photo = photo;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CheckinoutView")
    public Set<CheckinoutView> getCheckinoutViews() {
        return checkinoutViews;
    }

    public void setCheckinoutViews(Set<CheckinoutView> checkinoutViews) {
        this.checkinoutViews = checkinoutViews;
    }
    
}


