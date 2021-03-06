package com.az.ratedocs.webservice;

/* Parse call back for save account method.
 * */

import android.app.Activity;
import android.widget.Toast;
import com.parse.ParseException;
import com.parse.SaveCallback;

public class ParseSaveCallback extends SaveCallback {

	Activity activity;

	public ParseSaveCallback(Activity activity) {
		this.activity = activity;
	}

	/* Callback's cannot throw exceptions so we have to do error handling here */
	@Override
	public void done(ParseException e) {
		if (e == null) {
			Toast.makeText(activity.getBaseContext(), "Saved Successfully",
					Toast.LENGTH_SHORT).show();
		} 
		else {
			Toast.makeText(activity.getBaseContext(), "Failed to Save",
					Toast.LENGTH_SHORT).show();
		}
	}
}

