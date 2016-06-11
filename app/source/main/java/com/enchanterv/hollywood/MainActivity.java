package com.enchanterv.hollywood;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int ctr=0;
    TextView tc,tm,tlg1;
    String mname,hname,convStr,tempde,tempde1,convStrFormat;
    Button bbq;
    Button    bbw;
    Button bbr;
    Button      bbt;
    Button  bby;
    Button   bbp;
    Button bbs;
    Button    bbd;
    Button bbf;
    Button         bbg;
    Button bbh;
    Button  bbj;
    Button bbk;
    Button       bbl;
    Button bbz;
    Button        bbx;
    Button bbc;
    Button      bbv;
    Button bbb;
    Button     bbn;
    Button bbm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        InitialName();
        hname ="HOLLYWOOD";
        String []movies={"The dark knight rises","argo","inception","now you see me","better luck chuck","the offer","ex machina"
                ,"the mask","warriors","rush hour","john wick","the untouchables","memento","insomnia","the machinist","catch me if you can",
                "john carter","star wars","back to future","american psycho"  };

        Random rnd=new Random();
        mname=movies[rnd.nextInt(20)].toUpperCase();


        convStr=mname.replaceAll("[QWRTYPSDFGHJKLZXCVBNM]", "_");
        convStrFormat=mname.replaceAll("[QWRTYPSDFGHJKLZXCVBNM]"," _ ");

        tm.setText(convStrFormat);

        bbq.setOnClickListener(this);
        bbw.setOnClickListener(this);
        bbr.setOnClickListener(this);
        bbt.setOnClickListener(this);
        bby.setOnClickListener(this);
        bbp.setOnClickListener(this);
        bbs.setOnClickListener(this);
        bbd.setOnClickListener(this);
        bbf.setOnClickListener(this);
        bbg.setOnClickListener(this);
        bbh.setOnClickListener(this);
        bbj.setOnClickListener(this);
        bbk.setOnClickListener(this);
        bbl.setOnClickListener(this);
        bbz.setOnClickListener(this);
        bbx.setOnClickListener(this);
        bbc.setOnClickListener(this);
        bbv.setOnClickListener(this);
        bbb.setOnClickListener(this);
        bbn.setOnClickListener(this);
        bbm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {case R.id.bq:
          InSwFunc('Q');
            bbq.setVisibility(View.INVISIBLE);
            break;
            case R.id.bw:
                InSwFunc('W');    bbw.setVisibility(View.INVISIBLE);
                break;
            case R.id.br:
                InSwFunc('R');    bbr.setVisibility(View.INVISIBLE);
                break;
            case R.id.bt:
                InSwFunc('T');    bbt.setVisibility(View.INVISIBLE);
                break;
            case R.id.by:
                InSwFunc('Y');    bby.setVisibility(View.INVISIBLE);
                break;
            case R.id.bp:
                InSwFunc('P');    bbp.setVisibility(View.INVISIBLE);
                break;
            case R.id.bs:
                InSwFunc('S');    bbs.setVisibility(View.INVISIBLE);
                break;
            case R.id.bd:
                InSwFunc('D');    bbd.setVisibility(View.INVISIBLE);
                break;
            case R.id.bf:
                InSwFunc('F');    bbf.setVisibility(View.INVISIBLE);
                break;
            case R.id.bg:
                InSwFunc('G');    bbg.setVisibility(View.INVISIBLE);
                break;
            case R.id.bh:
                InSwFunc('H');    bbh.setVisibility(View.INVISIBLE);
                break;
            case R.id.bj:
                InSwFunc('J');    bbj.setVisibility(View.INVISIBLE);
                break;
            case R.id.bk:
                InSwFunc('K');    bbk.setVisibility(View.INVISIBLE);
                break;
            case R.id.bl:
                InSwFunc('L');    bbl.setVisibility(View.INVISIBLE);
                break;
            case R.id.bz:
                InSwFunc('Z');    bbz.setVisibility(View.INVISIBLE);
                break;
            case R.id.bx:
                InSwFunc('X');    bbx.setVisibility(View.INVISIBLE);
                break;
            case R.id.bc:
                InSwFunc('C');    bbc.setVisibility(View.INVISIBLE);
                break;
            case R.id.bv:
                InSwFunc('V');    bbv.setVisibility(View.INVISIBLE);
                break;
            case R.id.bb:
                InSwFunc('B');    bbb.setVisibility(View.INVISIBLE);
                break;
            case R.id.bn:
                InSwFunc('N');    bbn.setVisibility(View.INVISIBLE);
                break;
            case R.id.bm:
                InSwFunc('M');    bbm.setVisibility(View.INVISIBLE);
                break;
        }
        if(convStr.equals(mname))
        {
            Intent movep=new Intent("com.enchanterv.hollywood.WELCOMEACTIVITY");
            startActivity(movep);
        }
        else if(ctr>8)
        { Intent move1p=new Intent("com.enchanterv.hollywood.WELCOME1ACTIVITY");
            startActivity(move1p);
        }}

public void InSwFunc(char entCh){

    int yu=0,flag=0;
    while(yu<mname.length())
    {  char[] tpp=mname.toCharArray();
        if (tpp[yu]==entCh)
        {StringBuffer buf=new StringBuffer(convStr);
            buf.setCharAt(yu,entCh);
            convStr=buf.toString();
            flag=1;}

                                          yu++;}
    convStrFormat=convStr.replaceAll("[_?!]"," _ ");

    tm.setText(convStrFormat);

    if(flag==0){
        ctr++;
        tempde=hname.substring(ctr, hname.length());
        tempde1=hname.substring(0,ctr);
        tc.setText(tempde);
        tlg1.setText(tempde1);
        tlg1.setPaintFlags(tc.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);}


}

    public void InitialName()
    {
     tlg1=(TextView)findViewById(R.id.tlg);
        tc=(TextView)findViewById(R.id.t1) ;
        tm=(TextView)findViewById(R.id.t2);
        bbq=(Button)findViewById(R.id.bq);
    bbw=(Button)findViewById(R.id.bw);
    bbr=(Button)findViewById(R.id.br);
    bbt=(Button)findViewById(R.id.bt);
    bby=(Button)findViewById(R.id.by);
    bbp=(Button)findViewById(R.id.bp);
    bbs=(Button)findViewById(R.id.bs);
    bbd=(Button)findViewById(R.id.bd);
    bbf=(Button)findViewById(R.id.bf);
    bbg=(Button)findViewById(R.id.bg);
    bbh=(Button)findViewById(R.id.bh);
    bbj=(Button)findViewById(R.id.bj);
    bbk=(Button)findViewById(R.id.bk);
    bbl=(Button)findViewById(R.id.bl);
    bbz=(Button)findViewById(R.id.bz);
    bbx=(Button)findViewById(R.id.bx);
    bbc=(Button)findViewById(R.id.bc);
    bbv=(Button)findViewById(R.id.bv);
    bbb=(Button)findViewById(R.id.bb);
    bbn=(Button)findViewById(R.id.bn);
    bbm=(Button)findViewById(R.id.bm);}

                                   }
