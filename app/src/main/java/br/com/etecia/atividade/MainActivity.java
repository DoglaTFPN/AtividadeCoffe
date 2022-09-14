package br.com.etecia.atividade;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    fragmentCoffe coffefragment = new fragmentCoffe();
    fragmentTea fragmentTea = new fragmentTea();
    fragmentMuffin fragmentMuffin = new fragmentMuffin();
    fragmentDonuts fragmentDonuts = new fragmentDonuts();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, coffefragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mCoffe:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, coffefragment).commit();
                        return true;
                    case R.id.mDonuts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragmentDonuts).commit();
                        return true;
                    case R.id.mMuffin:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragmentMuffin).commit();
                        return true;
                    case R.id.mTea:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragmentTea).commit();
                        return true;
                }

                return false;
            }

        });


    }
}