package com.example.gpx;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
public class MainActivity extends Activity implements OnClickListener {
	Button b1, num1, num2, num3, num4, next, prev;
	//ImageView image;
	int a[] = {1, 2, 3, 4};
	MediaPlayer mp[] = new MediaPlayer[12];
	ImageView des[] = new ImageView[12];
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
      
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
        
        //image = (ImageView)findViewById(R.id.imageView1);
        des[0] = (ImageView)findViewById(R.id.im1);
        des[1] = (ImageView)findViewById(R.id.im2);
        des[2] = (ImageView)findViewById(R.id.im3);
        des[3] = (ImageView)findViewById(R.id.im4);
        des[4] = (ImageView)findViewById(R.id.im5);
        des[5] = (ImageView)findViewById(R.id.im6);
        des[6] = (ImageView)findViewById(R.id.im7);
        des[7] = (ImageView)findViewById(R.id.im8);
        des[8] = (ImageView)findViewById(R.id.im9);
        des[9] = (ImageView)findViewById(R.id.im10);
        des[10] = (ImageView)findViewById(R.id.im11);
        des[11] = (ImageView)findViewById(R.id.im12);
        
        
        mp[0] = MediaPlayer.create(MainActivity.this, R.drawable.one);
        mp[1] = MediaPlayer.create(MainActivity.this, R.drawable.two);
        mp[2] = MediaPlayer.create(MainActivity.this, R.drawable.three);
        mp[3] = MediaPlayer.create(MainActivity.this, R.drawable.four);
        mp[4] = MediaPlayer.create(MainActivity.this, R.drawable.five);
        mp[5] = MediaPlayer.create(MainActivity.this, R.drawable.six);
        mp[6] = MediaPlayer.create(MainActivity.this, R.drawable.seven);
        mp[7] = MediaPlayer.create(MainActivity.this, R.drawable.eight);
        mp[8] = MediaPlayer.create(MainActivity.this, R.drawable.nine);
        mp[9] = MediaPlayer.create(MainActivity.this, R.drawable.ten);
        mp[10] = MediaPlayer.create(MainActivity.this, R.drawable.eleven);
        mp[11] = MediaPlayer.create(MainActivity.this, R.drawable.twelve);
        
        
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
/////////////////////////////////////////////////////////////////
				
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140-30;
rel_btn.topMargin = 110-30;
rel_btn.width=160;
rel_btn.height=175;
//num1.setT
//num1.setTextColor(Color.BLUE);
num1.setLayoutParams(rel_btn);


RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);
//num2.setTextSize(100);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);
//num1.setTextSize(65);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//num1.setTextSize(65);
//////////////////////////////////////////////////////////////////
			 
			 
		invisiAll();
			
			Handler handler = new Handler(); 
    	    handler.postDelayed(new Runnable() { 
    	         public void run() { 
    	        	 
    	        	func(a[0]);
    	        	
    	         } 
    	    }, 1000);
	        
		}
		else if(v.getId() == R.id.num2) {
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280-30;
rel_btn1.topMargin = 110-30;
rel_btn1.width=160;
rel_btn1.height=175;
num2.setLayoutParams(rel_btn1);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//////////////////////////////////////////////////////////////////
			
			
			
			
			
			
			invisiAll();
			
			Handler handler = new Handler(); 
    	    handler.postDelayed(new Runnable() { 
    	         public void run() { 
    	        	 
    	        	 func(a[1]);
    	        	
    	         } 
    	    }, 1000);
		}
		
		else if(v.getId() == R.id.num3){
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420-30;
rel_btn2.topMargin = 110-30;
rel_btn2.width=160;
rel_btn2.height=175;
num3.setLayoutParams(rel_btn2);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//////////////////////////////////////////////////////////////////
			
			invisiAll();
				
			Handler handler = new Handler(); 
    	    handler.postDelayed(new Runnable() { 
    	         public void run() { 
    	        	 
    	        	 func(a[2]);
    	        	
    	         } 
    	    }, 1000);
		}
		
		else if(v.getId() == R.id.num4){
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560-30;
rel_btn3.topMargin = 110-30;
rel_btn3.width=160;
rel_btn3.height=175;
num4.setLayoutParams(rel_btn3);
//////////////////////////////////////////////////////////////////
			
		invisiAll();
				
			Handler handler = new Handler(); 
    	    handler.postDelayed(new Runnable() { 
    	         public void run() { 
    	        	 
    	        	 func(a[3]);
    	        	
    	         } 
    	    }, 1000);
		}
		
		else if(v.getId() == R.id.next){
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//////////////////////////////////////////////////////////////////
			
			
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
		}
		
		else if(v.getId() == R.id.prev){
			
			
/////////////////////////////////////////////////////////////////
RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn.leftMargin = 140;
rel_btn.topMargin = 110;
rel_btn.width=100;
rel_btn.height=110;
num1.setLayoutParams(rel_btn);

RelativeLayout.LayoutParams rel_btn1 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn1.leftMargin = 280;
rel_btn1.topMargin = 110;
rel_btn1.width=100;
rel_btn1.height=110;
num2.setLayoutParams(rel_btn1);

RelativeLayout.LayoutParams rel_btn2 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn2.leftMargin = 420;
rel_btn2.topMargin = 110;
rel_btn2.width=100;
rel_btn2.height=110;
num3.setLayoutParams(rel_btn2);

RelativeLayout.LayoutParams rel_btn3 = new RelativeLayout.LayoutParams(
LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
rel_btn3.leftMargin = 560;
rel_btn3.topMargin = 110;
rel_btn3.width=100;
rel_btn3.height=110;
num4.setLayoutParams(rel_btn3);
//////////////////////////////////////////////////////////////////
			
			
			
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
		}
		
		else
			throw new RuntimeException("Something");
		
	}
	
	void invisiAll(){
		AlphaAnimation animation1 = new AlphaAnimation(1.0f, 0.0f);
	    animation1.setDuration(0);
		for(int i=0; i<12; i++){
			des[i].startAnimation(animation1);
			//des[i].setVisibility(View.INVISIBLE);
		}		
		
	}
	
	void func(int n){
		
		int l2 = 6 + (int) Math.ceil(n/2);
		int l1 = 6 - (int) Math.floor(n/2);
		
		if(n%2 != 0){
			l2++;
		}
		final int m1 = l1;
		final int m2 = l2;
		
		
		AlphaAnimation animation1 = new AlphaAnimation(0.0f, 1.0f);
	    animation1.setDuration(100);
		for(int i=l1; i<l2; i++){
			des[i].startAnimation(animation1);
			//des[i].setVisibility(View.VISIBLE);
		}
		
		final int nn =n;
		Handler handler = new Handler(); 
	    handler.postDelayed(new Runnable() { 
	         
			public void run() { 
	        	
	        	 for(int i=m1; i<m2; i++){
	        	int a = (int) des[i].getTranslationX();
 	 			int b = (int) des[i].getTranslationY();
	        	TranslateAnimation anim1 = new TranslateAnimation(a, a, b, b-80);
	        	//anim1.setStartOffset((i-m1)*2000+1000);
	        	anim1.setStartOffset((i-m1)*1000+500);
	 	        anim1.setDuration(250);
	 	        anim1.setFillAfter(true);
	 	        
	 	       final int ii=i;
	 	        anim1.setAnimationListener(new Animation.AnimationListener() {
	 	                    @Override
	 	                    public void onAnimationStart(Animation animation) {

	 	                    }

	 	                    @Override
	 	                    public void onAnimationEnd(Animation animation) {
	 	                    	mp[ii-m1].start();
	 	                    	int a = (int) des[ii].getTranslationX();
	 	        	 			int b = (int) des[ii].getTranslationY();
	 	                        Animation anim2 = new TranslateAnimation(a, a, b-80, b);
	 	                        anim2.setDuration(250);
	 	                        anim2.setFillAfter(true);
	 	                        //des[ii].clearAnimation();
	 	                        des[ii].startAnimation(anim2);
	 	                    }

	 	                    @Override
	 	                    public void onAnimationRepeat(Animation animation) {

	 	                    }
	 	                }); 

	 	        	des[i].startAnimation(anim1);
	 	        	
	        	 }//end of for loop
	 	        	
	        	
	         } 
	    }, 500);
		
		
		
		
			
	}
    
}