package com.app.ordering;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView Pizza, Pasta, Sandwhich;
    private ImageView Burger, Fries, Wrap;
    private ImageView Coffe, Drinks,IceCream;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        Pizza = (ImageView) findViewById(R.id.pizza);
        Pasta = (ImageView) findViewById(R.id.pasta);
        Sandwhich = (ImageView) findViewById(R.id.sandwhich);


        Burger = (ImageView) findViewById(R.id.burger);
        Fries = (ImageView) findViewById(R.id.fries);
        Wrap = (ImageView) findViewById(R.id.wrap);


        Coffe = (ImageView) findViewById(R.id.coffe);
        Drinks = (ImageView) findViewById(R.id.drinks);
        IceCream = (ImageView) findViewById(R.id.icecream);


        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pizza");
                startActivity(intent);
            }
        });
        Pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pasta");
                startActivity(intent);
            }
        });


        Sandwhich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sandwhich");
                startActivity(intent);
            }
        });





        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Burger");
                startActivity(intent);
            }
        });


        Fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fries");
                startActivity(intent);
            }
        });



        Wrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Wrap");
                startActivity(intent);
            }
        });






        Coffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Coffe");
                startActivity(intent);
            }
        });


        Drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Drinks");
                startActivity(intent);
            }
        });

        IceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.ordering.AdminAddNewProductActivity.class);
                intent.putExtra("category", "IceCream");
                startActivity(intent);
            }
        });




    }
}
