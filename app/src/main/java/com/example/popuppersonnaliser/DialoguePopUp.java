package com.example.popuppersonnaliser;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;

public class DialoguePopUp extends Dialog {

    private String title,subtitle;
    private  Button button,button2;
    TextView titleView,subTitleView;

    public DialoguePopUp(Activity activity){

        super(activity,R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.pop_up);
        this.title = "Mon titre";
        this.subtitle = "je suis le sous titre";
        this.button = findViewById(R.id.button);
        this.button2 = findViewById(R.id.button2);
        this.titleView = findViewById(R.id.titleView);
        this.subTitleView = findViewById(R.id.subTitleView);

    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Button getButton() {
        return button;
    }

    public Button getButton2() {
        return button2;
    }

    public  void build(){
        show();
        titleView.setText(title);
        subTitleView.setText(subtitle);
    }
}
