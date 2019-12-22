package db.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Food {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    private FoodCategory foodCategory;
    private String ingredients;

    public Food(Integer id, String name, FoodCategory foodCategory, String ingredients) {
        this.id = id;
        this.name = name;
        this.foodCategory = foodCategory;
        this.ingredients = ingredients;
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

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
