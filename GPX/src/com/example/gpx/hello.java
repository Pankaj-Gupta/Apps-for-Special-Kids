package com.example.gpx;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
public class hello extends Activity implements OnClickListener {

	Button num1, num2, num3, num4, next, prev;
	int a[] = {1, 2, 3, 4};
	MediaPlayer mp[] = new MediaPlayer[12];
	ImageView image;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
       
        
        num1 = (Button) findViewById(R.id.num1); 
        num1.setOnClickListener(this);
        
        num2 = (Button) findViewById(R.id.num2); 
        num2.setOnClickListener(this);
        
        num3 = (Button) findViewById(R.id.num3); 
        num3.setOnClickListener(this);
        
        num4 = (Button) findViewById(R.id.num4); 
        num4.setOnClickListener(this);
        
        next = (Button) findViewById(R.id.next); 
        next.setOnClickListener(this);
        
        prev = (Button) findViewById(R.id.prev); 
        prev.setOnClickListener(this);
        
        
        image = (ImageView)findViewById(R.id.imageView1);
        
        
        mp[0] = MediaPlayer.create(hello.this, R.drawable.one);
        mp[1] = MediaPlayer.create(hello.this, R.drawable.two);
        mp[2] = MediaPlayer.create(hello.this, R.drawable.three);
        mp[3] = MediaPlayer.create(hello.this, R.drawable.four);
        mp[4] = MediaPlayer.create(hello.this, R.drawable.five);
        mp[5] = MediaPlayer.create(hello.this, R.drawable.six);
        mp[6] = MediaPlayer.create(hello.this, R.drawable.seven);
        mp[7] = MediaPlayer.create(hello.this, R.drawable.eight);
        mp[8] = MediaPlayer.create(hello.this, R.drawable.nine);
        mp[9] = MediaPlayer.create(hello.this, R.drawable.ten);
        mp[10] = MediaPlayer.create(hello.this, R.drawable.eleven);
        mp[11] = MediaPlayer.create(hello.this, R.drawable.twelve);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		if(v.getId() == R.id.num1)
		{
			/*TranslateAnimation anim1 = new TranslateAnimation(50, 50, 0, 100);
        anim1.setDuration(500);
        
        anim1.setFillAfter(true);
        func(a[0]);
        anim1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Animation anim2 = new TranslateAnimation(50, 50, 100, 0);
                        anim2.setDuration(500);
                        anim2.setFillAfter(true);
                        image.clearAnimation();
                        image.startAnimation(anim2);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

        	image.startAnimation(anim1);*/
			func(a[0]);
			
			
/////////////////////////////////////////////////////////////////
			
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140-30;
rel_btn.topMargin = 110-30;
rel_btn.width=160;
rel_btn.height=175;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(130);
//num1.setTextAlignment(Align.CENTER);


//num1.setTextColor(Color.BLUE);


RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(65);
//num2.setGravity(Gravity.CENTER);
//num2.setPadding(10, 10, 10, 50);
//num2.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(65);
//num3.setGravity(Gravity.CENTER);
//num3.setPadding(10, 10, 10, 50);
//num3.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(65);
//num4.setTextColor(Color.BLACK);    
//num3.setGravity(Gravity.CENTER_VERTICAL);


//num1.setTextSize(65);   
//////////////////////////////////////////////////////////////////
			
			
		}
		else if(v.getId() == R.id.num2) {
			func(a[1]);
						
			/*ViewGroup.LayoutParams params = num2.getLayoutParams();			
			params.width = 180;
			params.height=180;
			num2.setLayoutParams(params);*/
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(65);
//num1.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280-30;
rel_btn1.topMargin = 110-30;
rel_btn1.width=160;
rel_btn1.height=175;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(130);
//num2.setTextColor(Color.BLUE);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(65);
//num3.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(65);
//num4.setTextColor(Color.BLACK);
//////////////////////////////////////////////////////////////////
		
		}
		
		else if(v.getId() == R.id.num3){
			
			func(a[2]);
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(65);
//num1.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(65);
//num2.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420-30;
rel_btn2.topMargin = 110-30;
rel_btn2.width=160;
rel_btn2.height=175;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(130);
//num3.setTextColor(Color.BLUE);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(65);
//num4.setTextColor(Color.BLACK);
//////////////////////////////////////////////////////////////////
		}
		
		else if(v.getId() == R.id.num4){

			func(a[3]);
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(65);
//num1.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(65);
//num2.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(65);
//num3.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560-30;
rel_btn3.topMargin = 110-30;
rel_btn3.width=160;
rel_btn3.height=175;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(130);
//num4.setTextColor(Color.BLUE);
//////////////////////////////////////////////////////////////////
			
		}
		else if(v.getId() == R.id.next){
			if(a[0] != 9){
			num1.setText(""+(a[0]+4));
			a[0]+=4;
			num2.setText(""+(a[1]+4));
			a[1]+=4;
			num3.setText(""+(a[2]+4));
			a[2]+=4;
			num4.setText(""+(a[3]+4));
			a[3]+=4;
			}
			if(a[0] == 9){
				//next.setVisibility(View.INVISIBLE);
			}
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(65);
//num1.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(65);
//num2.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(65);
//num3.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(65);
//num4.setTextColor(Color.BLACK);
//////////////////////////////////////////////////////////////////
		}
		
		else if(v.getId() == R.id.prev){
			if(a[0] == 9){
				//next.setVisibility(View.VISIBLE);
			}
			if(a[0] !=1) {
			num1.setText(""+(a[0]-4));
			a[0]-=4;
			num2.setText(""+(a[1]-4));
			a[1]-=4;
			num3.setText(""+(a[2]-4));
			a[2]-=4;
			num4.setText(""+(a[3]-4));
			a[3]-=4;
			}
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);
//num1.setTextSize(65);
//num1.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(65);
//num2.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num3.setTextSize(65);
//num3.setTextColor(Color.BLACK);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num4.setTextSize(65);
//num4.setTextColor(Color.BLACK);
//////////////////////////////////////////////////////////////////
		}
		
		
		else
			throw new RuntimeException("Something");
		
	}
	
	
	
	void func(int n){
		mp[n-1].start();
		
		
		
		
			
	}
    
}