package com.example.block;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Frontview extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bitmap_layout);
		Thread timer=new Thread(){
			public void run(){
				try{
					sleep(15000);
					
				}catch(InterruptedException e){
				e.printStackTrace();
				}finally{
					Intent start=new Intent(Frontview.this,Blockers.class);
					startActivity(start);
				}
			}
		};
		timer.start();
	}
	

}
