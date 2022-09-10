package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recipemexican extends AppCompatActivity {

    RecyclerView mRecyclerview;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipemexican);
        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(recipemexican.this,1);
        mRecyclerview.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Grilled Onion & Skirt Steak Tacos","4.7","Ingredients\n" +
                "2 beef skirt or flank steaks (1 pound each)\n" +
                "1 bottle (12 ounces) beer\n" +
                "1/4 cup lime juice\n" +
                "3 tablespoons olive oil, divided\n" +
                "8 spring onions or green onions\n" +
                "1-1/4 teaspoons salt, divided\n" +
                "3/4 teaspoon pepper, divided\n" +
                "Corn tortillas, minced fresh cilantro and lime wedges\n" +
                "\n" +
                "Directions\n" +
                "Pound beef with a meat mallet to tenderize. In a large bowl, mix beer, lime juice and 2 tablespoons oil until blended. Add beef to marinade; turn to coat. Refrigerate, covered, at least 30 minutes.\n" +
                "Meanwhile, cut partially through onions, leaving tops intact. Drizzle with remaining oil; sprinkle with 1/4 teaspoon salt and 1/4 teaspoon pepper.\n" +
                "Drain beef, discarding marinade; sprinkle with the remaining salt and pepper. On a greased grill rack, grill steaks and onions, covered, over medium heat or broil 4 in. from heat until meat reaches desired doneness (for medium-rare, a thermometer should read 135°; medium, 140°; medium-well, 145°) and onions are crisp-tender, 2-4 minutes on each side. Cut steak diagonally across the grain into thin slices. Serve with tortillas, onions, cilantro and lime wedges.",R.drawable.m1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Carnitas Huevos Rancheros\n","4.5","Ingredients\n" +
                "1 boneless pork shoulder butt roast (3 pounds), halved\n" +
                "2 teaspoons olive oil\n" +
                "3 garlic cloves, thinly sliced\n" +
                "1/2 teaspoon salt\n" +
                "1/2 teaspoon pepper\n" +
                "1 medium onion, chopped\n" +
                "2 cans (4 ounces each) chopped green chiles\n" +
                "1 cup salsa\n" +
                "1/2 cup minced fresh cilantro\n" +
                "1/2 cup chicken broth\n" +
                "1/2 cup tequila or additional chicken broth\n" +
                "1 can (15 ounces) black beans, rinsed and drained\n" +
                "ASSEMBLY:\n" +
                "12 large eggs\n" +
                "1 jar (16 ounces) salsa\n" +
                "12 flour tortillas (6 inches), warmed and quartered\n" +
                "4 medium ripe avocados, peeled and sliced\n" +
                "\n" +
                "Directions\n" +
                "Rub roast with oil, garlic, salt and pepper. Place in a 4- or 5-qt. slow cooker. Top with onion, green chiles, salsa, cilantro, broth and tequila. Cook, covered, on low 7-8 hours or until meat is tender.\n" +
                "Remove roast; shred with 2 forks. Discard cooking juices, reserving 1 cup. Return cooking juices and meat to slow cooker. Stir in beans; heat through.\n" +
                "Meanwhile, coat a large skillet with cooking spray; place over medium-high heat. Working in batches, break eggs, 1 at a time, into pan; reduce heat to low. Cook until whites are set and yolks begin to thicken, turning once if desired. Divide pork mixture among 12 serving bowls. Top with salsa, eggs, avocados and additional cilantro. Serve with tortillas. Freeze option: Freeze cooled meat mixture and juices in freezer containers. To use, partially thaw in refrigerator overnight. Heat through in a saucepan, stirring occasionally; add a little water if necessary.",R.drawable.m2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Chicken Tamales","4.8","Ingredients\n" +
                "24 dried corn husks\n" +
                "1 broiler/fryer chicken (3 to 4 pounds), cut up\n" +
                "1 medium onion, quartered\n" +
                "2 teaspoons salt\n" +
                "1 garlic clove, crushed\n" +
                "3 quarts water\n" +
                "DOUGH:\n" +
                "1 cup shortening\n" +
                "3 cups masa harina\n" +
                "FILLING:\n" +
                "6 tablespoons canola oil\n" +
                "6 tablespoons all-purpose flour\n" +
                "3/4 cup chili powder\n" +
                "1/2 teaspoon salt\n" +
                "1/4 teaspoon garlic powder\n" +
                "1/4 teaspoon pepper\n" +
                "2 cans (2-1/4 ounces each) sliced ripe olives, drained\n" +
                "Hot water\n" +
                "\n" +
                "Directions\n" +
                "Cover corn husks with cold water; soak until softened, at least 2 hours.\n" +
                "Place chicken, onion, salt and garlic in a 6-qt. stockpot. Pour in 3 qt. water; bring to a boil. Reduce heat; simmer, covered, until chicken is tender, 45-60 minutes. Remove chicken from broth. When cool enough to handle, remove bones and skin; discard. Shred chicken. Strain cooking juices; skim fat. Reserve 6 cups stock.\n" +
                "For dough, beat shortening until light and fluffy, about 1 minute. Beat in small amounts of masa harina alternately with small amounts of reserved stock, using no more than 2 cups stock. Drop a small amount of dough into a cup of cold water; dough should float. If not, continue beating, rechecking every 1-2 minutes.\n" +
                "For filling, heat oil in a Dutch oven; stir in flour until blended. Cook and stir over medium heat until lightly browned, 7-9 minutes. Stir in seasonings, chicken and remaining stock; bring to a boil. Reduce heat; simmer, uncovered, stirring occasionally, until thickened, about 45 minutes.\n" +
                "Drain corn husks and pat dry; tear 4 husks to make 20 strips for tying tamales. (To prevent husks from drying out, cover with a damp towel until ready to use.) On wide end of each remaining husk, spread 3 tablespoons dough to within 1/2 in. of side edges; top each with 2 tablespoons chicken filling and 2 teaspoons olives. Fold long sides of husk over filling, overlapping slightly. Fold over narrow end of husk; tie with a strip of husk to secure.\n" +
                "Place a large steamer basket in the stockpot over water; place tamales upright in steamer. Bring to a boil; steam, covered, adding hot water as needed, until dough peels away from husk, about 45 minutes.\n",R.drawable.m4);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Instant Pot Black Beans","4.6","Ingredients\n" +
                "2 pounds dried black beans (about 4-1/2 cups)\n" +
                "4 teaspoons salt, divided\n" +
                "12 cups water, divided\n" +
                "1/2 cup lard\n" +
                "1 tablespoon ground cumin\n" +
                "2 teaspoons garlic powder\n" +
                "Optional: Queso fresco and cilantro\n" +
                "\n" +
                "Directions\n" +
                "Rinse and sort beans. Transfer to a 6-qt. electric pressure cooker. Add 2 teaspoons salt and 7 cups water. Lock lid; close pressure-release valve. Adjust to pressure-cook on high for 2 minutes. Allow pressure to naturally release for 20 minutes and then quick-release any remaining pressure.\n" +
                "Drain beans; discard liquid. Return beans to pressure cooker. Add remaining salt and water, lard, cumin and garlic powder. Lock lid; close pressure-release valve. Adjust to pressure-cook on high for 25 minutes. Allow pressure to naturally release for 10 minutes and then quick-release any remaining pressure; do not drain.\n" +
                "If desired, mash or puree beans in broth and sprinkle with queso fresco and cilantro.\n" +
                "\n" +
                "Test Kitchen tips\n" +
                "Once the beans have chilled in the refrigerator, stir them and divide into 1-cup portions to freeze for convenient reheating in the microwave.\n" +
                "Lard makes the tastiest beans, but vegetable shortening also works well. Just don't omit the fat entirely, as it changes the texture of the beans.",R.drawable.m3);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(recipemexican.this,myFoodList);
        mRecyclerview.setAdapter(myAdapter);
    }
}
