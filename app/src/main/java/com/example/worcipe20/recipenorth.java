package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recipenorth extends AppCompatActivity {

    RecyclerView mRecyclerview;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipenorth);
        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(recipenorth.this,1);
        mRecyclerview.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Matar Butter Masala","4.7","Ingredients\n" +
                "For the cashew paste\n" +
                "10 Cashew nuts , soaked in 1/2 cup hot water\n" +
                "To be ground into a fine paste\n" +
                "2 Onions , roughly chopped\n" +
                "1 inch Ginger\n" +
                "8 cloves Garlic\n" +
                "1 Green Chilli\n" +
                "Other ingredients\n" +
                "200 grams Green peas (Matar)\n" +
                "2 tablespoons Butter (Salted)\n" +
                "1 Bay leaf (tej patta)\n" +
                "1/2 teaspoon Turmeric powder (Haldi)\n" +
                "2 teaspoons Kashmiri Red Chilli Powder\n" +
                "1 teaspoon Coriander Powder (Dhania)\n" +
                "Salt , to taste\n" +
                "5 Tomatoes , pureed\n" +
                "1 teaspoon Sugar\n" +
                "1 teaspoon Garam masala powder\n" +
                "2 tablespoons Fresh cream\n" +
                "1 teaspoon Kasuri Methi (Dried Fenugreek Leaves)\n" +
                "6 sprig Coriander (Dhania) Leaves , finely chopped\n" +
                "\n" +
                "To begin making the Matar Butter Masala Recipe, firstly boil the peas in a pressure cooker. \n" +
                "\n" +
                "Place the fresh or frozen green peas in a pressure cooker with 1/2 cup of water and some salt. Pressure cook for one whistle and turn off the heat. Immediately release the pressure to prevent the peas from getting over cooked at the same time retaining its fresh green colours.  Set aside. \n" +
                "\n" +
                "To make the cashew paste, ensure the cashews are soaked in hot water for 15-20 minutes. Transfer the water and cashews into a mixer jar and blend to make a smooth paste. Set aside. \n" +
                "\n" +
                "To make the onion paste, in a mixer jar, combine the onions, ginger, garlic, green chilli and grind into a fine paste. Set aside. \n" +
                "\n" +
                "Roughly chop the tomatoes and blend to make a puree in a mixer grinder. Keep aside.\n" +
                "\n" +
                "Finally to make the Matar Butter Masala; heat butter in a heavy bottom pan over medium heat; add the bay leaf and the onion paste and saute for a good 2-3 minutes stirring continuously for about 2 minutes.\n" +
                "\n" +
                "After couple of minutes, stir in the salt, turmeric powder, coriander powder and red chilli powder. Saute for 30 to 40 seconds. This sauteeing along with spices helps the raw smell go away faster and uses less oil too. \n" +
                "\n" +
                "Next add the tomato puree, cover and cook for about 5 minutes or until the tomatoes get a bright red colour and are cooked completely.\n" +
                "\n" +
                "Stir in the boiled peas along with the water and adjust the consistency of the gravy to your preference by adding more water if required.\n" +
                "\n" +
                "Finally add in the sugar, kasuri methi and fresh cream, bring the Matar Butter Masala to a brisk boil and turn off the heat. \n" +
                "\n" +
                "Adjust the salt and seasoning according to your taste, stir in the freshly chopped coriander leaves and transfer the Matar Butter Masala to a serving bowl.\n" +
                "\n" +
                "Serve the hot Matar Butter Masala along with Garlic Naan Without Yeast Recipe and Jeera Rice Recipe and Mint Pomegranate Raita Recipe for a weekend lunch.",R.drawable.n1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Whole Wheat Soya Keema Kulchas\n","4.5","Ingredients\n" +
                "For the dough\n" +
                "3-1/2 cups Whole Wheat Flour\n" +
                "1/2 cup Curd (Dahi / Yogurt)\n" +
                "1 cup Milk , warm\n" +
                "1 teaspoon Ajwain (Carom seeds)\n" +
                "1 teaspoon Baking soda\n" +
                "1 teaspoon Sugar\n" +
                "3 tablespoon Oil\n" +
                "Lukewarm Water , as required\n" +
                "For stuffing:\n" +
                "1-1/2 cup Soy granules , (for keema)\n" +
                "1/3 cup Onions , finely chopped\n" +
                "1 teaspoon Cumin seeds (Jeera)\n" +
                "1 teaspoon Red Chilli powder\n" +
                "1/4 teaspoon Turmeric powder (Haldi)\n" +
                "1/2 teaspoon Garam masala powder\n" +
                "1 teaspoon Coriander Powder (Dhania)\n" +
                "1 teaspoon Garlic , finely chopped\n" +
                "1 teaspoon Ginger , grated\n" +
                "1 tablespoon Oil\n" +
                "2 teaspoon Lemon juice\n" +
                "Salt , to taste\n" +
                "1/2 cup Coriander (Dhania) Leaves , finely chopped\n" +
                "2 Green Chillies , finely chopped\n" +
                "2 tablespoons Mint Leaves (Pudina) , finely chopped\n" +
                "Ghee , or butter or oil for frying kulchas\n" +
                "\n" +
                "To begin making the Whole Wheat Soya Keema Kulchas, in a large bowl, combine all the ingredients mentioned under the “For the dough” ingredients except water. Start mixing the dough.\n" +
                "\n" +
                "Gradually add warm water and knead it to a soft dough. Cover with clean damp cloth and keep it aside for 2 to 3 hours. \n" +
                "\n" +
                "For stuffing, boil the soya granules as per the packet instruction and cook until soft. Once done, drain the water.\n" +
                "\n" +
                "In a heavy bottomed pan, heat 1 tablespoon of oil; add cumin seeds and allow it to crackle.\n" +
                "\n" +
                "Add onions, garlic and ginger and saute until the onions are soft. Add red chili powder, turmeric powder, coriander powder and mix. Sprinkle few drops of water and cook the masala for few seconds.\n" +
                "\n" +
                "Add soya keema, garam masala, salt and toss well. Soya keema should be combined well with the masalas.  Sprinkle lemon juice and cook for half a minute. Mixture should be dry, make sure that no water remains and you have a delicious mixture of the soy kheema. Check the salt and spices and adjust to suit your taste.\n" +
                "\n" +
                "Once done, turn off the heat and allow the soya kheema to cool down completely.\n" +
                "\n" +
                "Once the mixture is cooled, add green chilies, mint leaves and coriander leaves. Mix well.\n" +
                "\n" +
                "To prepare Kulchas, knead the rested dough once again.\n" +
                "\n" +
                "Divide the dough into equal dough balls depending on the size of the kulcha you need. Also divide the mixture in equal portions as many as the dough balls.\n" +
                "\n" +
                "Take one ball of the dough. Roll it out into a small circle. Take the rolled circle in your palm\n" +
                "\n" +
                "Place the keema mixture in the centre of the rolled small circle. Bring all the edges of the circle together to seal the mixture.\n" +
                "\n" +
                "On floured surface, gently press the stuffed ball, roll out into a uniform kulcha. Do not apply too much pressure at one place else the kulcha will tear and stuffing will come out.\n" +
                "\n" +
                "Place the Kheema Kulcha on the hot iron skillet and allow it to get brown spots on the lower side.  Flip it and repeat for the other side.  Apply ghee, butter or oil and fry till you get nice brown spots and kulcha is cooked well. Once done, remove from the pan and serve. Proceed to make the remaining Kheema Kulchas the similar way.\n" +
                "\n" +
                "Serve the Whole Wheat Soya Keema Kulchas along with a Boondi Raita, Tomato Garlic Chutney, Achar and your dinner will be ready in a giffy.",R.drawable.n4);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Rajma Kofta In Milk And Poppy Seed Gravy","4.8","Ingredients\n" +
                "1/2 cup Rajma (Large Kidney Beans)\n" +
                "1/4 cup Cashew nuts\n" +
                "2 tablespoons Sultana Raisins\n" +
                "1/4 teaspoon Asafoetida (hing)\n" +
                "1/4 teaspoon Cumin seeds (Jeera)\n" +
                "2 tablespoons Gram flour (besan)\n" +
                "1/4 teaspoon Red Chilli powder\n" +
                "2 teaspoons Coriander (Dhania) Leaves , chopped\n" +
                "2 teaspoons Ghee\n" +
                "3 teaspoons Poppy seeds , ground to paste\n" +
                "1 teaspoons Fresh cream\n" +
                "1/2 cup Milk\n" +
                "1/2 teaspoon Garam masala powder\n" +
                "Water , as required\n" +
                "Salt , to taste\n" +
                "Saffron strands , a few to garnish\n" +
                "\n" +
                "To begin making Rajma Kofta In Milk And Poppy Seed Gravy Recipe, prepare the koftas first. Remember to first soak the rajma overnight and pressure cook with salt until the rajma is cooked and softened.\n" +
                "\n" +
                "Blend the boiled rajma, besan, cashew, raisins, chilli powder, hing, coriander leaves and salt in a food processor. Check for seasoning and adjust. Spread this mashed spiced rajma on a thali or a large plate. Make small round balls of rajma kofta with your palm.\n" +
                "\n" +
                "Heat a frying pan with half ghee and fry the kofta balls for about 10 minutes. Set aside.\n" +
                "\n" +
                "What you can also do is, heat a kuzhi paniyaram pan, drop in a few drops of oil into each cavity and put in these balls into each cavity. Once browned on the bottom, you can rotate the kofta balls and brown them evenly from the other side as well. This is a healthier way to prepare koftas instead of deep frying them in traditional way.\n" +
                "\n" +
                "Take a kadai and heat ghee, add cumin and allow to sizzle.\n" +
                "\n" +
                "Once sizzling, add in milk, cream, poppy seed paste and garam masala powder. Add salt and stir. Add water only if needed.\n" +
                "\n" +
                "Cook till the mixture comes to one boil and add the koftas and Switch off heat after half a minute. Serve with your favourite garnish like saffron or coriander leaves.\n" +
                "\n" +
                "Serve Rajma Kofta In Milk And Poppy Seed Gravy Recipe along with Saffron Pilaf Recipe (Kesar Pulao) and Pudina Tawa Paratha Recipe for lunch or dinner with Green Moong Sprout Salad With Capsicum And Carrots to complete the meal.",R.drawable.n2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Soya Methi Sabzi","4.6","Ingredients\n" +
                "1 cup Methi Leaves (Fenugreek Leaves) , washed and finely chopped\n" +
                "1 cup Soya Chunks , soaked in one cup of hot water\n" +
                "1 tablespoon Mustard oil\n" +
                "1/2 teaspoon Cumin seeds (Jeera)\n" +
                "2 Onions , thinly sliced\n" +
                "1 inch Ginger , finely chopped\n" +
                "4 cloves Garlic , finely chopped\n" +
                "1 Bay leaf (tej patta)\n" +
                "1 inch Cinnamon Stick (Dalchini)\n" +
                "1/2 teaspoon Turmeric powder (Haldi)\n" +
                "1/2 teaspoon Garam masala powder\n" +
                "1/2 teaspoon Coriander (Dhania) Powder\n" +
                "1/4 teaspoon Red Chilli powder\n" +
                "1 teaspoon Amchur (Dry Mango Powder)\n" +
                "1 tablespoon Jaggery\n" +
                "Salt\n" +
                "\n" +
                "To begin making the Soya Methi Sabzi Recipe , first pressure cook the soya chunks for 2 whistles in the water that it is soaked in. \n" +
                "\n" +
                "Allow the pressure to release naturally. Drain off the excess water and keep the soya chunks aside. \n" +
                "\n" +
                "Heat oil in a pan on medium heat; add the cinnamon stick and cumin seeds and allow it to crackle. \n" +
                "\n" +
                "Next add in the finely chopped ginger, garlic and onions. Sauté for about a minute until the onions turn transparent and soft.\n" +
                "\n" +
                "Once the onions, ginger and garlic have cooked through, add the methi leaves and sauté for two to three minutes or until the Methi leaves have completely wilted down. \n" +
                "\n" +
                "To this add the salt, turmeric powder, Garam masala powder, coriander powder, red chilli powder and amchur powder and jaggery along with the cooked soya chunks.\n" +
                "\n" +
                "Give it a good stir until the masala has well coated into the Soya Methi Sabzi. Cover the the pan and simmer for 2 to 4 minutes until the masalas are well absorbed.\n" +
                "\n" +
                "Give the Soya Methi Sabzi a taste and adjust salt and seasoning accordingly. \n" +
                "\n" +
                "Once done, turn off the heat, transfer the Soya Methi Sabzi to a serving bowl and serve hot.\n" +
                "\n" +
                "Serve this Soya Methi Sabzi along with Dhaba Style Dal Fry and Jowar Atta Roti and Mooli Raita for a healthy and diabetic friendly meal.",R.drawable.n3);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(recipenorth.this,myFoodList);
        mRecyclerview.setAdapter(myAdapter);
    }
}
