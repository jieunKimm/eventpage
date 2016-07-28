package com.example.alab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void lotte (View view) {
        goToUrl("http://www.cgv.co.kr/culture-event/event/detail-view.aspx?idx=14177&menu=4");
    }

    public void vip (View view) {
        goToUrl("http://section.cgv.co.kr/event/2016/0609_vip_experience/default.aspx");
    }

    public void bccard (View view) {
        goToUrl("http://www.cgv.co.kr/culture-event/event/detail-view.aspx?idx=13641&menu=4");
    }

    public void bc2 (View view) {
        goToUrl("http://www.cgv.co.kr/culture-event/event/detail-view.aspx?idx=14535&menu=4");
    }

    public void b1a4 (View view) {
        goToUrl("http://event.megabox.co.kr/megaschool/");
    }

    public void coun (View view) {
        goToUrl("https://www.phoenixpark.co.kr/Site/event/event_view?seq=12336");
    }

    public void love (View view) {
        goToUrl("http://www.megabox.co.kr/?menuId=event-pat");
    }

    public void bcbc (View view) {
        goToUrl("https://www.bccard.com/app/card/evntPgrsDetailActn.do?evntNo=2016060024");
    }
}
