package com.az.ratedocs;

/* This activity can send the user an email to help them find their password.
 * */

import com.az.ratedocs.onclick.OnClickFactory;
import com.az.ratedocs.onclick.OnClickInterface;
import android.app.Activity;
import android.os.Bundle;

public class ForgetPasswordActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forget_password);
		
		@SuppressWarnings("unused")
		OnClickInterface onClickInterface = OnClickFactory.getOnClick(this, ForgetPasswordActivity.this);
	}
}
