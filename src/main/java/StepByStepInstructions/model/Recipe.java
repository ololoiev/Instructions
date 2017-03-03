package StepByStepInstructions.model;

import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "RECIPE")
public class Recipe implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    private User idUser;

    @Column(name = "ID_CATEGORY")
    private String idCategory;

    @Column(name = "VIDEO")
    private URL video;

    private Set<Steps> stepsSet = new HashSet<Steps>();
    private Set<Tags> tagsSet = new HashSet<Tags>();
    private Set<Rating> ratingSet = new HashSet<Rating>();


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

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    @OneToMany(mappedBy = "RATING", cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    public Set<Rating> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<Rating> ratingSet) {
        this.ratingSet = ratingSet;
    }

    public URL getVideo() {
        return video;
    }

    public void setVideo(URL video) {
        this.video = video;
    }

    @OneToMany(mappedBy = "STEPS", cascade = CascadeType.REMOVE,
        orphanRemoval = true)
    public Set<Steps> getStepsSet() {
        return stepsSet;
    }

    public void setStepsSet(Set<Steps> stepsSet) {
        this.stepsSet = stepsSet;
    }

    @ManyToMany
    @JoinTable(name = "RECIPE_TAGS", joinColumns = @JoinColumn(name =
        "ID_RECIPE"), inverseJoinColumns = @JoinColumn(name = "ID_TAGS"))
    public Set<Tags> getTagsSet() {
        return tagsSet;
    }

    public void setTagsSet(Set<Tags> tagsSet) {
        this.tagsSet = tagsSet;
    }

    @Override
    public String toString() {
        return "Recipe name - " + name;
    }
}
