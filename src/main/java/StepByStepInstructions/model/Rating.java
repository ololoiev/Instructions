package StepByStepInstructions.model;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "RATING")

public class Rating implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ID_RECIPE")
    private Recipe idRecipe;

    @Column(name = "ID_USER")
    private User idUser;

    @Column(name = "MARK")
    private int mark;


    @ManyToOne
    @JoinColumn(name = "ID_RECIPE")
    public Recipe getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Recipe idRecipe) {
        this.idRecipe = idRecipe;
    }

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
