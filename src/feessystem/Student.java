/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feessystem;

/**
 *
 * @author MEMO
 */
public class Student {
    private String studentName, fathersName,batchTiming,mobileNumber;
    private int amount;
    
    public Student(String stnm,String fthsnm,String btiming,String mnumber,int amt)
    {
        this.studentName= stnm;
        this.batchTiming = btiming;
        this.fathersName = fthsnm;
        this.mobileNumber= mnumber;
        this.amount = amt;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getBatchTiming() {
        return batchTiming;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAmount() {
        return amount;
    }
    
    
}

