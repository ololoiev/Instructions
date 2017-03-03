package StepByStepInstructions.model;

import javax.persistence.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STEPS")
public class Steps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "STEP_NUMBER")
    private int stepNumber;

    private Recipe idRecipe;

    @Column(name = "IMAGE_LINK")
    private URL imageLink;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BODY")
    private String body;

    private Set<Comments> commentsSet = new  HashSet<Comments>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    @ManyToOne
    @JoinColumn(name = "ID_RECIPE")
    public Recipe getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Recipe idRecipe) {
        this.idRecipe = idRecipe;
    }

    public URL getImageLink() {
        return imageLink;
    }

    public void setImageLink(URL imageLink) {
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @OneToMany(mappedBy = "COMMENTS", cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    public Set<Comments> getCommentsSet() {
        return commentsSet;
    }

    public void setCommentsSet(Set<Comments> commentsSet) {
        this.commentsSet = commentsSet;
    }

    @Override
    public String toString() {
        return "Name: " + name + "text " +body;
    }
}
