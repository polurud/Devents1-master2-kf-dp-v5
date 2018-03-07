package com.dartmouth.kd.devents;


import android.util.Log;

import com.google.firebase.database.Exclude;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by kathrynflattum on 2/25/18.
 */

public class CampusEvent {

    private Long mId;
    private String Title;
    private String Location;
    private String Description;
//    private Calendar newDate;
//    private Calendar Start;
//    private Calendar End;



    private String Date;
    private String Start;
    private String End;

    private String URL;
    private Double Latitude;
    private Double Longitude;
    private int Food;
    private int EventType;
    private int ProgramType;
    private int Year;
    private int Major;
    private int GreekSociety;
    private int Gender;

    public CampusEvent(){
        this.Title = "";
        this.Location = "";
        this.Description = "";
//        this.newDate =Calendar.getInstance();
////                new GregorianCalendar(2018, 02, 07);;
//        this.Start = Calendar.getInstance();
//        this.End = Calendar.getInstance();
        this.Date ="";

        this.Start= "";
        this.End= "";
        this.URL = "";
        double dub = 0;
        this.Latitude = dub;
        this.Longitude = dub;
        this.Food = 0;
        this.EventType = 0;
        this.ProgramType = 0;
        this.Year = 0;
        this.Major = 0;
        this.Gender = 0;
        this.GreekSociety=0;

    }


    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String start) {
        Start = start;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String end) {
        End = end;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long id) {
        this.mId = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

//    @Exclude
//    public Calendar getDate() {
//        return newDate;
//    }

//
//    public void setDate(String date) {
//
//        SimpleDateFormat mparser = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
//        try {
//            this.newDate.setTime(mparser.parse(date));
//        }catch (java.text.ParseException e) {
//            e.printStackTrace();
//        }
//
//    }

    public void setDate(int day, int month, int year) {

        Log.d("Date.....", String.valueOf(day)+"..."+String.valueOf(month)+"..."+String.valueOf(year) );

//         Calendar newDate = Calendar.getInstance();
//         newDate.set(01,01,2010);
//        Log.d("New date example", newDate.toString());

//            this.Date.set(year, month, day);

//        this.newDate = new GregorianCalendar(2010, 06, 23);

//
//        this.newDate = new GregorianCalendar(year,month , day);
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//        String formatted = format1.format(this.newDate.getTime());
//        System.out.println(formatted);
//                Log.d("Try new date", formatted);
//

//        Log.d("Try new date", formatted);
//        Log.d("Date.....", String.valueOf(day)+"..."+String.valueOf(month)+"..."+String.valueOf(year) );
//            this.Date =  Date.set(year, month, day);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
//        Calendar calendar = new GregorianCalendar(year,month,day);
//
//        Log.d("New Date.....", sdf.format(calendar.getTime()));

    }

//    public long getDateInMillis() {
//
//
////        Log.d("new date return value", String.valueOf(newDate.getTimeInMillis()));
//        return newDate.getTimeInMillis();
//    }
//
//    public long getStartInMillis() {
//        return Start.getTimeInMillis();
//    }
//
//    public long getEndInMillis(){
//        return End.getTimeInMillis();
//    }

//
//    public void setStart(String start) {
//        SimpleDateFormat mparser = new SimpleDateFormat("HH:mm");
//
//        try {
//            Start.setTime(mparser.parse(start));
//        }catch (java.text.ParseException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void setStart(int hour, int minute) {
//
//
//        Start.set(Calendar.HOUR_OF_DAY, hour);
//        Start.set(Calendar.MINUTE, minute);
//
//    }

    //public void setDateTime(String date){
    //    this.Date = date;
    //}

//    @Exclude
//    public Calendar getStart() {
//        return Start;
//    }
//
//
//    public void setEnd(String end) {
//        SimpleDateFormat mparser = new SimpleDateFormat("HH:mm");
//        try {
//            End.setTime(mparser.parse(end));
//        }catch (java.text.ParseException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void setEnd(int hour, int minute) {
//        End.set(Calendar.HOUR_OF_DAY, hour);
//        End.set(Calendar.MINUTE, minute);
//
//    }

//    @Exclude
//    public Calendar getEnd() {
//        return End;
//    }

    public String getURL() {
        Log.d("URL........", URL);
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getFood(){
        return Food;
    }

    public void setFood(int Food){
        this.Food = Food;
    }

    public int getEventType() {
        return EventType;
    }

    public void setEventType(int EventType) {
        this.EventType = EventType;
    }

    public int getProgramType() {
        return ProgramType;
    }

    public void setProgramType(int ProgramType) {
        this.ProgramType = ProgramType;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMajor() {
        return Major;
    }

    public void setMajor(int Major) {
        this.Major = Major;
    }

    public int getGreekSociety() {
        return GreekSociety;
    }

    public void setGreekSociety(int GreekSociety) {
        this.GreekSociety = GreekSociety;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

}