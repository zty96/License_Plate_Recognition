package com.example.vlpr_version2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	
	private Button btn_denglu;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	//设置登录点击事件，调往activity_second.xml形成的界面 
	btn_denglu = (Button)findViewById(R.id.button_denglu);
	btn_denglu.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(MainActivity.this,SecondActivity.class);
			startActivity(intent);			
			}
		});
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
