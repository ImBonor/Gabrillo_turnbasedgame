package mcm.edu.ph.gabrillo_turnbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView hpV1;
    TextView hpV2;
    TextView logV1;
    TextView logV2;
    TextView logV3;
    TextView logV4;
    TextView logV5;
    TextView logV6;
    TextView logV7;
    TextView logV8;
    Button btnAtk, btnHeal, btnInvoke, btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hpV1 = findViewById(R.id.hpV1);
        hpV2 = findViewById(R.id.hpV2);
        logV1 = findViewById(R.id.logV1);
        logV2 = findViewById(R.id.logV2);
        logV3 = findViewById(R.id.logV3);
        logV4 = findViewById(R.id.logV4);
        logV5 = findViewById(R.id.logV5);
        logV6 = findViewById(R.id.logV6);
        logV7 = findViewById(R.id.logV7);
        logV8 = findViewById(R.id.logV8);
        btnAtk = findViewById(R.id.btnAtk);
        btnHeal = findViewById(R.id.btnHeal);
        btnInvoke = findViewById(R.id.btnInvoke);
        btnEnd = findViewById(R.id.btnEnd);

        btnAtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                logV2.setText("You swung and dealt 3 dmg!");
                logV3.setText("Malenia winds up and does a thrust attack!");
                logV4.setText("Malenia thrusts and deals 5 dmg!");
                hpV2.setText("HP: 7/10");
                hpV1.setText("HP: 5/10");

                btnAtk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You swung and dealt 3 dmg!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 4/10");
                        hpV1.setText("HP: 0/10");

                    }
                });

                btnHeal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You healed for 3 hp!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 7/10");
                        hpV1.setText("HP: 0/10");
                        
                    }
                });

                btnInvoke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You're invulnerable for 1 turn and you counter-attack for 7 damage!");
                        logV6.setText("Malenia has died");
                        logV7.setText("You are victorious!");
                        hpV2.setText("HP: 0/10");
                        hpV1.setText("HP: 5/10");

                    }
                });
            }
        });

        btnHeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                logV2.setText("You healed for 3 hp!");
                logV3.setText("Malenia winds up and does a thrust attack!");
                logV4.setText("Malenia thrusts and deals 5 dmg!");
                hpV2.setText("HP: 10/10");
                hpV1.setText("HP: 5/10");

                btnAtk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You swung and dealt 3 dmg!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 7/10");
                        hpV1.setText("HP: 0/10");
                        
                    }
                });

                btnHeal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You healed for 3 hp!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 10/10");
                        hpV1.setText("HP: 0/10");
                        
                    }
                });

                btnInvoke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You're invulnerable for 1 turn and you counter-attack for 7 damage!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits but deals 10 dmg!");
                        hpV2.setText("HP: 3/10");
                        hpV1.setText("HP: 0/10");

                    }
                });
            }
        });

        btnInvoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                logV2.setText("You're invulnerable for 1 turn and you counter-attack for 7 damage!");
                logV3.setText("Malenia winds up and does a thrust attack!");
                logV4.setText("Malenia thrusts but deals 0 dmg!");
                hpV2.setText("HP: 3/10");
                hpV1.setText("HP: 10/10");

                btnAtk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You swung and dealt 3 dmg!");
                        logV6.setText("Malenia has died");
                        logV7.setText("You are victorious!");
                        hpV2.setText("HP: 0/10");
                        hpV1.setText("HP: 10/10");

                    }
                });

                btnHeal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You healed for 3 hp!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 3/10");
                        hpV1.setText("HP: 0/10");

                    }
                });

                btnInvoke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        logV5.setText("You were unable to Invoke!");
                        logV6.setText("Malenia leaps into the air and performs a Waterfowl Dance!");
                        logV7.setText("Malenia crits and deals 999 dmg!");
                        hpV2.setText("HP: 3/10");
                        hpV1.setText("HP: 0/10");

                    }
                });

            }
        });

        if (hpV1.equals("HP: 0/10")){
             logV8.setText("You died.");
             btnEnd.setVisibility(View.VISIBLE);
             btnAtk.setEnabled(false);
             btnHeal.setEnabled(false);
             btnInvoke.setEnabled(false);
            
        }

        else{
            logV8.setText("");
            btnEnd.setVisibility(View.GONE);
        }


        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                logV2.setText("");
                logV3.setText("");
                logV4.setText("");
                logV5.setText("");
                logV6.setText("");
                logV7.setText("");
                logV8.setText("");
                hpV1.setText("HP: 10/10");
                hpV2.setText("Hp: 10/10");

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}