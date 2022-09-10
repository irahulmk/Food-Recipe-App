package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recipeitalian extends AppCompatActivity {

    RecyclerView mRecyclerview;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipeitalian);
        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(recipeitalian.this,1);
        mRecyclerview.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Easy Chicken Parmesan","4.7","INGREDIENTS\n" +
                "FOR THE CHICKEN\n" +
                "1 1/2 c. panko bread crumbs\n" +
                "1/2 tsp. garlic powder\n" +
                "1/4 c. freshly grated Parmesan, plus more for garnish\n" +
                "2 large eggs, beaten with 1 tbsp. water\n" +
                "1/2 c. all-purpose flour\n" +
                "1 1/2 lb. boneless skinless chicken cutlets\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Vegetable oil\n" +
                "1 c. shredded mozzarella\n" +
                "FOR THE MARINARA\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "1/2 small onion, finely chopped\n" +
                "4 cloves garlic, sliced\n" +
                "1 (28-oz.) can crushed tomatoes\n" +
                "1/4 c. water\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Pinch crushed red pepper flakes\n" +
                "2 tbsp. freshly chopped parsley, plus more for garnish\n" +
                "\n"+
                "DIRECTIONS\n" +
                "Preheat oven to 400º. Make chicken: Prepare breading station with three large mixing bowls: one bowl with panko, garlic powder, and Parmesan mixed with a fork; another with the egg mixture; and the third bowl with flour. Season chicken with salt and pepper, then coat each piece of chicken in flour and shake off excess. Dip chicken into egg mixture and then into bread crumb mixture; repeat steps for remaining chicken and set aside on a plate.\n" +
                "In a deep cast-iron skillet over medium-high heat, add 1/4\" oil. When pan is hot but not smoking, add chicken. Cook until golden brown, 5 to 7 minutes, flipping halfway through. Transfer to a paper towel-lined plate to drain.\n" +
                "Meanwhile, make marinara: In a medium pot over medium heat, heat oil. Add onion and garlic and cook until soft, 4 minutes. Add in tomatoes and water, season with salt, pepper, and red pepper flakes, and let simmer, 10 minutes. Remove from heat and stir in parsley.\n" +
                "Pour sauce into a 9\"-x-13\" baking dish and place chicken in sauce. Top with mozzarella and bake until cheese is melty, 10 to 12 minutes. If desired, broil until cheese is golden, 3 minutes.\n" +
                "Garnish with parsley and serve immediately.",R.drawable.itali1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Spaghetti and Meatballs","4.5","INGREDIENTS\n" +
                "1 lb. spaghetti\n" +
                "1 lb. ground beef\n" +
                "1/3 c. bread crumbs\n" +
                "1/4 c. finely chopped parsley\n" +
                "1/4 c. freshly grated Parmesan, plus more for serving\n" +
                "1 egg\n" +
                "2 garlic cloves, minced\n" +
                "Kosher salt\n" +
                "1/2 tsp. red pepper flakes\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "1/2 c. onion, finely chopped\n" +
                "1 (28-oz.) can crushed tomatoes\n" +
                "1 bay leaf\n" +
                "Freshly ground black pepper\n" +
                "\n"+
                "DIRECTIONS\n" +
                "In a large pot of boiling salted water, cook spaghetti according to package instructions. Drain. \n" +
                "In a large bowl, combine beef with bread crumbs, parsley, Parmesan, egg, garlic, 1 teaspoon salt, and red pepper flakes. Mix until just combined then form into 16 balls.\n" +
                "In a large pot over medium heat, heat oil. Add meatballs and cook, turning occasionally, until browned on all sides, about 10 minutes. Transfer meatballs to a plate.\n" +
                "Add onion to pot and cook until soft, 5 minutes. Add crushed tomatoes and bay leaf. Season with salt and pepper and bring to a simmer. Return meatballs to pot and cover. Simmer until sauce has thickened, 8 to 10 minutes.\n" +
                "Serve pasta with a healthy scoop of meatballs and sauce. Top with Parmesan before serving.",R.drawable.itali2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Homemade Ricotta","4.8","INGREDIENTS\n" +
                "3 3/4 c. whole milk\n" +
                "1/4 c. heavy cream\n" +
                "Pinch kosher salt\n" +
                "1 tbsp. plus 2 tsp white vinegar (or lemon juice)\n" +
                "\n"+
                "DIRECTIONS\n" +
                "Combine milk, cream, and salt in a medium pot over medium heat. Heat milk until a thermometer reads 185°.\n" +
                "Add vinegar or lemon juice and stir to incorporate—curds should begin forming immediately. Reduce heat to lowest setting and leave mixture undisturbed for 20 minutes. \n" +
                "Fit a strainer into a large bowl and line with a single layer of water-dampened cheesecloth. Use a slotted spoon to transfer curds into strainer and let stand until most liquid has strained into bowl, 3 to 4 minutes. Transfer to an airtight container and keep for up to 2 weeks.",R.drawable.itali3);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Chicken Marsala","4.6","INGREDIENTS\n" +
                "1 c. all-purpose flour\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "4 boneless skinless chicken breasts\n" +
                "2 tbsp. butter, divided\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "8 oz. baby bella or cremini mushrooms, sliced\n" +
                "2 cloves garlic, minced\n" +
                "3/4 c. marsala wine\n" +
                "3/4 c. low-sodium chicken broth\n" +
                "1/2 c. heavy cream\n" +
                "2 tbsp. Freshly chopped parsley\n" +
                "Cooked angel hair, for serving\n" +
                " \n" +
                "DIRECTIONS\n" +
                "In a shallow bowl, season flour with salt and pepper. Dredge chicken in flour.\n" +
                "In a large skillet over medium heat, melt 1 tablespoon butter and oil. Add chicken and cook until golden on both sides, about 5 minutes per side. Remove chicken from pan and place on a clean plate.\n" +
                "Make marsala sauce: Melt remaining 1 tablespoon butter in skillet and add mushrooms. Cook until mushrooms are golden and liquid has been released, 6 to 8 minutes (if the pan looks dry, add a splash of olive oil). Add garlic and cook until fragrant, then season with salt.\n" +
                "Add marsala, chicken broth, heavy cream, and parsley and bring to a simmer.\n" +
                "Return chicken to skillet and spoon sauce over breasts. Simmer until chicken is cooked through, about 10 minutes.\n" +
                "Serve over angel hair, if desired.",R.drawable.itali4);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(recipeitalian.this,myFoodList);
        mRecyclerview.setAdapter(myAdapter);
    }
}
