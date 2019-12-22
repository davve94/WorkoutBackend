package db.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class WorkoutPlan {

    @Id
    @GeneratedValue
    private Integer id;
    private String timestamp;
    @OneToMany
    private List<Workout> workout;
    private String description;

    public WorkoutPlan(Integer id, String timestamp, List<Workout> workout, String description) {
        this.id = id;
        this.timestamp = timestamp;
        this.workout = workout;
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

    public List<Workout> getWorkout() {
        return workout;
    }

    public void setWorkout(List<Workout> workout) {
        this.workout = workout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
