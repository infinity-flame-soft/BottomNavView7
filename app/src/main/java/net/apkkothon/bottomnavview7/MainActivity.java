package net.apkkothon.bottomnavview7;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //------initial---------
        bottomNavigationView=findViewById(R.id.bottom_nav_view);

        //---onClick-------------
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.menu_home:

                        //Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout,new HomeFragment()).commit();

                        break;
                    case R.id.menu_music:
                        //Toast.makeText(MainActivity.this,"Music",Toast.LENGTH_SHORT).show();
                        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.frame_layout,new MusicFragment()).commit();

                        break;
                    case R.id.menu_video:
                        //Toast.makeText(MainActivity.this,"Video",Toast.LENGTH_SHORT).show();
                        FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.frame_layout,new VideoFragment()).commit();

                        break;

                }


                return true;
            }
        });



    }
}
