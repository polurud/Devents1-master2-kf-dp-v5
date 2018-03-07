package com.dartmouth.kd.devents;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.text.SimpleDateFormat;


public class Utils {


	public static final String DATE_FORMAT = "MMM d yyyy";
	public static final String START_FORMAT = "H:mm";
	public static final String END_FORMAT = "H:mm";
	public static final String DISTANCE_FORMAT = "#.##";



	public static void showDialog(Context context, String title, String message){
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage(message);
		builder.setTitle(title);
		builder.setPositiveButton("ok", null);
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	public static void showActivity(Context context, Class c){
		Intent intent = new Intent(context, c);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
		context.startActivity(intent);
	}

	public static String parseStart(long timeInMs, Context context) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String formatted = sdf.format(timeInMs);
		/*GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(timeInMs);
		SimpleDateFormat timeFormat;
		timeFormat = new SimpleDateFormat(START_FORMAT, Locale.getDefault());

		return timeFormat.format(calendar.getTime());*/
		return formatted;
	}

	public static String parseEnd(long timeInMs, Context context) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String formatted = sdf.format(timeInMs);
		Log.i(Globals.TAGG, "End string is: " + formatted);
		/*GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(timeInMs);
		SimpleDateFormat timeFormat;
		timeFormat = new SimpleDateFormat(END_FORMAT, Locale.getDefault());

		return timeFormat.format(calendar.getTime());*/
		return formatted;
	}

	public static String parseDate(long timeInMs, Context context) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
		String formatted = sdf.format(timeInMs);
		Log.i(Globals.TAGG, "Date string is: " + formatted);
		return formatted;
		/*GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(timeInMs);
		SimpleDateFormat dateFormat;
		dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());

		return dateFormat.format(calendar.getTime());*/
	}
}
