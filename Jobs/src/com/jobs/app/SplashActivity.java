package com.jobs.app;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.Fullscreen;
import com.googlecode.androidannotations.annotations.NoTitle;

@EActivity(R.layout.activity_splash)
@NoTitle
public class SplashActivity extends Activity {

	@AfterViews
	void afterViews() {
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
					startActivity(new Intent().setClass(SplashActivity.this, MainActivity.class));
					finish();
				} catch (Exception e) {
					
				}
			}
		}).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater();
		return true;
	}

}
