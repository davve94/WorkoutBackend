package db.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FoodPlan {

    @Id
    @GeneratedValue
    private Integer id;
    private String timestamp;
    @OneToMany
    private List<Food> food;
    private String description;

    public FoodPlan(Integer id, String timestamp, List<Food> food, String description) {
        this.id = id;
        this.timestamp = timestamp;
        this.food = food;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
