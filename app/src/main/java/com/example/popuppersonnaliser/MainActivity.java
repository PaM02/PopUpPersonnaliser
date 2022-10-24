package com.example.popuppersonnaliser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button3 = findViewById(R.id.button3);
        this.activity = this;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DialoguePopUp dialoguePopUp = new DialoguePopUp(activity);
                dialoguePopUp.setTitle("title");
                dialoguePopUp.setSubtitle("Votre requête est prise en compte et l'achat est validé. Vous recevrez le code de recharge dans quelques instants");
                dialoguePopUp.getButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialoguePopUp.dismiss();

                    }
                });

                dialoguePopUp.getButton2().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialoguePopUp.dismiss();

                    }
                });
                dialoguePopUp.build();
            }
        });
    }
}
