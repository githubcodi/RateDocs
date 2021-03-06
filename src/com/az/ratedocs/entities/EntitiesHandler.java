package com.az.ratedocs.entities;

/* This interface allows classes to generically generate entities including doctor, user 
 * and rating, as well as to generically access the server.
 * 
 * */

import java.util.ArrayList;
import java.util.HashMap;
import com.az.ratedocs.exceptionhandler.WebServiceException;
import android.app.Activity;

public interface EntitiesHandler {
	public void logIn(String uname, String pword, Activity activity,Class<?> class1);
	public void signUp(UserInfoInterface user, Activity activity,Class<?> class1);
	public void resetPassword(String email, Activity activity);
	public void setCurrentDoctor(DoctorInterface doctor);
	public DoctorInterface getDoctor();
	public UserInfoInterface getUser();
	public UserInfoInterface getCurrentUser() throws WebServiceException;
	public DoctorInterface getCurrentDoctor(Activity activity);
	void query(String title, Activity activity, HashMap<String, String> advSearch) throws WebServiceException;
	public ArrayList<DoctorInterface> getCurrentList(Activity activity);
	public void getRatings(Activity activity) throws WebServiceException;
}
