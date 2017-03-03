package StepByStepInstructions.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "COMMENTS")
public class Comments implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    private Steps idStep;
    private User idUser;

    @Column(name = "BODY")
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STEP")
    public Steps getIdStep() {
        return idStep;
    }

    public void setIdStep(Steps idStep) {
        this.idStep = idStep;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    public User getIdUser() {
        return this.idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Id: " + id + "/n" + body;
    }

}
