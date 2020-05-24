package auca.library.model;
// Generated May 6, 2020 1:50:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * CheckinoutView generated by hbm2java
 */
@Entity
@Table(name = "CheckinoutView")
public class CheckinoutView  implements java.io.Serializable {
     @Id
     private String opnumber;
    @ManyToOne
     private ClientView clientView;
    @ManyToOne
     private BookView bookView;
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date datetime;
     private String status;
     private String operationcategory;

    public CheckinoutView() {
    }

	
    public CheckinoutView(String opnumber) {
        this.opnumber = opnumber;
    }

    public CheckinoutView(String opnumber, ClientView clientView, BookView bookView, Date datetime, String status, String operationcategory) {
        this.opnumber = opnumber;
        this.clientView = clientView;
        this.bookView = bookView;
        this.datetime = datetime;
        this.status = status;
        this.operationcategory = operationcategory;
    }
    
   
    public String getOpnumber() {
        return this.opnumber;
    }
    
    public void setOpnumber(String opnumber) {
        this.opnumber = opnumber;
    }
    public ClientView getClientView() {
        return this.clientView;
    }
    
    public void setClientView(ClientView clientView) {
        this.clientView = clientView;
    }
    public BookView getBookView() {
        return this.bookView;
    }
    
    public void setBookView(BookView bookView) {
        this.bookView = bookView;
    }
    public Date getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getOperationcategory() {
        return operationcategory;
    }

    public void setOperationcategory(String operationcategory) {
        this.operationcategory = operationcategory;
    }




}

