package StepByStepInstructions.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @NotEmpty
    @Column(name="USER")
    private String USER;

    @Column(name = "USER_NAME")
    @Size(min = 3, max = 60)
    private String USER_NAME;

    @Column(name = "RATING")
    private int RATING;

    @Column(name = "ID_ROLE")
    private String ID_ROLE;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CHECK_IN")
    private Date DATA_CHECK_IN;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_LAST_CHECK_IN")
    private Date DATA_LAST_CHECK_IN;

    private Set<Recipe> recipes = new HashSet<Recipe>();
    private Set<Comments> commentsSet = new HashSet<Comments>();
    private Set<Rating> ratingSet = new HashSet<Rating>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public int getRATING() {
        return RATING;
    }

    public void setRATING(int RATING) {
        this.RATING = RATING;
    }

    public String getID_ROLE() {
        return ID_ROLE;
    }

    public void setID_ROLE(String ID_ROLE) {
        this.ID_ROLE = ID_ROLE;
    }

    public Date getDATA_CHECK_IN() {
        return DATA_CHECK_IN;
    }

    public void setDATA_CHECK_IN(Date DATA_CHECK_IN) {
        this.DATA_CHECK_IN = DATA_CHECK_IN;
    }

    public Date getDATA_LAST_CHECK_IN() {
        return DATA_LAST_CHECK_IN;
    }

    public void setDATA_LAST_CHECK_IN(Date DATA_LAST_CHECK_IN) {
        this.DATA_LAST_CHECK_IN = DATA_LAST_CHECK_IN;
    }

    @OneToMany(mappedBy = "RECIPE", cascade = CascadeType.REMOVE,
        orphanRemoval = true)
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    @OneToMany(mappedBy = "COMMENTS", cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    public Set<Comments> getCommentsSet() {
        return commentsSet;
    }

    public void setCommentsSet(Set<Comments> commentsSet) {
        this.commentsSet = commentsSet;
    }

    @OneToMany(mappedBy = "RATING", cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    public Set<Rating> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<Rating> ratingSet) {
        this.ratingSet = ratingSet;
    }

    @Override
    public String toString(){
        return "User: {" + id + " - " + USER + " - " + USER_NAME + " - " + RATING + " - " + ID_ROLE
                + " - " + DATA_CHECK_IN + " - " + DATA_LAST_CHECK_IN;
    }
}
