package DTO;

import lombok.Data;

@Data
public class Recipe {
    private String name; // title of recipe from web
    private Ingredient[]  ingredients; // every ingredient from web
}
