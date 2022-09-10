package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recipesouth extends AppCompatActivity {
    RecyclerView mRecyclerview;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipesouth);
        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(recipesouth.this,1);
        mRecyclerview.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("High Protein Soya Idli","4.7","Ingredients\n" +
                "2 cups Idli Rice\n" +
                "1 cup Soybeans (Whole Soya dal)\n" +
                "1-1/4 cups White Urad Dal (Whole)\n" +
                "1 teaspoon Methi Seeds (Fenugreek Seeds)\n" +
                "1 teaspoon Chana dal (Bengal Gram Dal)\n" +
                "4 teaspoons Salt\n" +
                "Water , as required\n" +
                "\n" +
                "How to make High Protein Soya Idli Recipe\n" +
                "To begin making high protein soya idli, we will first make the idli batter. Soak the rice in water, such that the all the rice is completely immersed in water. Let it soak for about 6 hours.\n" +
                "\n" +
                "Soak the soya bean in water, such that the all the soya bean is completely immersed in water and the water is at least 2 inches above as the soya will absorb water and fluff up. Let it soak for about 6 hours.\n" +
                "\n" +
                "Soak the urad dal, methi seeds and chana dal in water such that all of the dal is completely immersed in water. Let it soak for about 6 hours.\n" +
                "\n" +
                "First grind the urad dal into a fine smooth batter. While grinding add just enough water to make it into a very very smooth batter. The batter will look fluffy. Pour this batter into a large container.\n" +
                "\n" +
                "Next grind the soya bean into a fine smooth batter. While grinding add just enough water to make it into a very very smooth batter. The batter will look fluffy. Pour this batter into the urad dal.\n" +
                "\n" +
                "Grind the rice into a smooth paste, adding just the required amount of water to grind into a almost smooth batter. Adding too much water will make the dosa batter too watery. If required grind a little at a time to get a almost smooth batter .\n" +
                "\n" +
                "The rice batter is a little coarser, but the urad dal batter is super smooth.\n" +
                "\n" +
                "Combine the urad , soya bean and rice batter, add salt to taste and set aside for at least 12 hours or overnight until the batter ferments. You will notice the batter would have risen in volume.\n" +
                "\n" +
                "Hence you should place the batter in a large container so it has enough room to increase in its volume.\n" +
                "\n" +
                "To make the soya idlis\n" +
                "Grease the idli molds with a little sesame oil or ghee. This process is purely optional. I like to do this as it adds to the flavor of the idli’s. Pour spoonfuls of the batter into these moulds.\n" +
                "\n" +
                "Do make sure you fill the soya idli batter only half way through as they will rise up to the top when steamed. Once all the plates are filled, place the filled soya idli racks one above the other making sure the holes are facing the filled portion.\n" +
                "\n" +
                "Prepare the idli steamer with a little water in the bottom. Place the filled soya idli racks in the steamer. Place the steamer on high heat and steam the idli’s for 10 minutes.\n" +
                "\n" +
                "After 10 minutes of steaming, turn off the heat. Open the steamer and insert a knife or a pick to test whether the soya idli are cooked. If nothing sticks then the soya idlis are perfectly steamed.\n" +
                "\n" +
                "Now you can remove the soya idlis from the steamer. Have a small bowl filled with water. Dip a spoon in the water and then scoop the soya idli out starting from the edges. Dipping the spoon in water helps in the easy removal of idli from the plates.\n" +
                "\n" +
                "The wholesome high protein soft soya idli are now ready to be served for breakfast, lunch or dinner.\n" +
                "\n" +
                "Serve High Protein Soya Idli Recipe with Coconut Chutney, Tomato Onion Chutney, Thakkali Vengayam Sambar, Idli Milagai Podi & Filter Coffee for a delicious breakfast at home.",R.drawable.s1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData(" South Indian Rice And Lentil Pudding\n","4.5","Ingredients\n" +
                "1 cup Rice\n" +
                "1 cup Yellow Moong Dal (Split)\n" +
                "Salt , to taste\n" +
                "Ingredients for Seasoning\n" +
                "2 tablespoons Ghee , plus plus more\n" +
                "1 teaspoon Cumin seeds (Jeera)\n" +
                "1 inch Ginger , grated\n" +
                "1 teaspoon Whole Black Peppercorns , coarsely pounded\n" +
                "2 tablespoons Cashew nuts , halved\n" +
                "1 sprig Curry leaves\n" +
                "\n" +
                "How to make Ven Pongal Recipe - South Indian Rice And Lentil Pudding\n" +
                "To begin making the Ven Pongal Recipe; we will first cook the rice and lentils in the pressure cooker. Heat the cooker on medium heat, add a tablespoon of ghee. Add the washed moong dal and roast the dal in the ghee for about a minute.\n" +
                "\n" +
                "Once the dal is roasted, add the rice, salt and 5 cups of water. Cover the pressure cooker, place the weight on and cook until you hear a whistle. After the first whistle, turn the heat to low and simmer for 3 to 4 minutes. After 3 to 4 minutes, turn off the heat and allow the pressure to release naturally.\n" +
                "\n" +
                "While the pressure is releasing, heat a tablespoon of ghee in a small pan, add in the cashew nuts and roast on low heat until lightly browned. Next add in a teaspoon of cumin seeds, 2 teaspoons of pounded black pepper, a tablespoon of grated ginger, the roughly torn curry leaves. Turn off the heat and stir all the ingredients in the remaining heat. \n" +
                "\n" +
                "Once the pressure has released from the cooker, we will add in the prepared seasoning into the rice. Stir the seasoning into the rice until well \n" +
                "\n" +
                "Stir the prepared seasoning and an additional 2 to 3 tablespoons of ghee into the rice. Stir until all the ingredients and the ghee are well combined into the Ven Pongal.\n" +
                "\n" +
                "Spoon the Ven Pongal onto a rounded cup and press the rice in. Invert the cup onto a plate you voila you get a cup of Ven Pongal on your platter. Pick a cashew piece from the Pongal and place on the top to decorate.\n" +
                "\n" +
                "Serve the Ven Pongal for the Pongal Festival or a Sunday Breakfast along with Sakkarai Pongal, Vada Sambar and Kathirikai Gothsu - Eggplant in a Tangy Gravy. ",R.drawable.s2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("High Protein Soya Dosa","4.8","Ingredients\n" +
                "2 cups Idli Rice\n" +
                "1 cup Soybeans (Whole Soya dal)\n" +
                "1-1/4 cups White Urad Dal (Whole)\n" +
                "1 teaspoons Methi Seeds (Fenugreek Seeds)\n" +
                "1 teaspoon Chana dal (Bengal Gram Dal)\n" +
                "4 teaspoons Salt\n" +
                "Water , as required\n" +
                "Ghee , for making the dosa\n" +
                "\n" +
                "How to make High Protein Soya Dosa Recipe\n" +
                "To begin making High Protein Soya Dosa Recipe, we will first make the soya dosa batter. \n" +
                "\n" +
                "First we will soak all the ingredients. Soak the soy bean separately in a bowl. \n" +
                "\n" +
                "In a bowl soak the urad dal, methi seeds and chana dal together. In another bowl, soak the rice. Soak them for at least 6 hours or overnight.\n" +
                "\n" +
                "Once soaked, you can grind them. Into a mixer grinder, add the soaked urad dal and methi seeds. Add little water at a time and grind to make a thick flowing batter.\n" +
                "\n" +
                "Transfer the ground urad dal into a large bowl. In the same mixer grinder, add the rice and add just little water at a time and make thick batter. Transfer the rice into the same bowl as the urad dal. \n" +
                "\n" +
                "Similarly, grind the soaked soya bean adding little water at a time to make a thick batter and add it to the same bowl as the rice and dal.\n" +
                "\n" +
                "Add the salt and stir well to combine. Cover the bowl and ferment the High Protein Soya Idli & Dosa Batter for 8 hours/ overnight. \n" +
                "\n" +
                "Once fermented, give it a stir gently. You can make idli the first day when batter is fresh with air pockets. \n" +
                "\n" +
                "Refrigerate the High Protein Soya Idli & Dosa Batter in an airtight container for 4 to 5 days and use it as required.\n" +
                "\n" +
                "The next step is the make the dosa, stir the fermented batter, and add just a little water to adjust the consistency for making dosa. It should be a smooth flowing batter and not thick. \n" +
                "\n" +
                "Preheat a dosa tawa over medium heat. Pour a ladleful of the soya dosa batter and spread it in concentric circles until you get a thin 6 to 8 inch dosa. Drizzle ghee around the inside and outside edges.\n" +
                "\n" +
                "Cook on medium heat and once you notice the soya dosa turn golden brown, flip and cook on the other side for a few seconds. Flip back again, fold the soya dosa and serve hot. \n" +
                "\n" +
                "Serve this High Protein Soya Dosa Recipe for breakfast along with Coconut Chutney, Varutharacha Sambar and filter coffee.",R.drawable.s3);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Mangalorean Chicken Ghee Roast","4.6","Ingredients\n" +
                "1 Chicken breasts , cut into small pieces\n" +
                "3 tablespoon Curd (Dahi / Yogurt)\n" +
                "1/2 teaspoon Turmeric powder (Haldi)\n" +
                "1 tablespoon Lemon juice\n" +
                "1 sprig Curry leaves\n" +
                "1 teaspoon Jaggery\n" +
                "3 tablespoons Ghee\n" +
                "Salt , to taste\n" +
                "For the ghee roast masala\n" +
                "6 Dry Red Chillies\n" +
                "1 teaspoon Whole Black Peppercorns\n" +
                "2 Cloves (Laung)\n" +
                "1 teaspoon Methi Seeds (Fenugreek Seeds)\n" +
                "2 teaspoon Coriander (Dhania) Seeds\n" +
                "1 teaspoon Cumin seeds (Jeera)\n" +
                "4 cloves Garlic\n" +
                "1 tablespoon Tamarind Paste\n" +
                "\n" +
                "How to make Mangalorean Chicken Ghee Roast Recipe\n" +
                "To begin making the Mangalorean Chicken Ghee Roast Recipe, wash and clean the chicken thoroughly and drain all the water.\n" +
                "\n" +
                "To Marinate the Chicken\n" +
                "In a mixing bowl, add curd, turmeric and lemon juice and mix well. Add the washed chicken pieces in the curd mixture and marinate for at least 1 hour. \n" +
                "\n" +
                "For the ghee roast masala\n" +
                "Heat a flat skillet and add dry red chilies, fenugreek seeds, cumin seeds, coriander seeds, cloves and peppercorns. Roast them on low flame till the aroma of the spices wafts through the air. Turn off the flame and allow to cool. \n" +
                "\n" +
                "Once the spices are cool, add them to a mixer jar along with the garlic and tamarind paste along with a tablespoon of water into a smooth paste. Keep it aside. \n" +
                "\n" +
                "Heat a kadai with ghee, add curry leaves and allow it to crackle. Now, lower the flame and add chicken that is marinated with curd into the kadai and cook until the chicken has become firm. \n" +
                "\n" +
                "Add the ghee roast masala into the kadai and mix everything together until it combines. Cook the chicken in the pan until the ghee separates out and reaches the surface. \n" +
                "\n" +
                "Finally add in the jaggery, salt to taste and mix well. Once the jaggery has melted, mix well and check for seasoning. Switch off the heat and serve hot.\n" +
                "\n" +
                "Serve the Mangalorean Chicken Ghee Roast Recipe along with neer dosa, steamed rice and Palak Tovve or Palak Dal Recipe by the side to complete your Sunday meals.",R.drawable.s4);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(recipesouth.this,myFoodList);
        mRecyclerview.setAdapter(myAdapter);
    }
}
