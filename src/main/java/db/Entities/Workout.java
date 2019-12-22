package db.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Workout {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    private WorkoutCategory workoutCategory;

    public Workout(Integer id, String name, WorkoutCategory workoutCategory) {
        this.id = id;
        this.name = name;
        this.workoutCategory = workoutCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkoutCategory getWorkoutCategory() {
        return workoutCategory;
    }

    public void setWorkoutCategory(WorkoutCategory workoutCategory) {
        this.workoutCategory = workoutCategory;
    }
}
