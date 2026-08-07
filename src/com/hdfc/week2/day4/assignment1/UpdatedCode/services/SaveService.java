package com.hdfc.week2.day4.assignment1.UpdatedCode.services;

import com.hdfc.week2.day4.assignment1.UpdatedCode.dbUtil.DatabaseConfig;
import org.w3c.dom.ls.LSOutput;

public class SaveService {
    public void save(){
        DatabaseConfig db = new DatabaseConfig();
        db.initiateConnection("admin","1234");
        //Saving Logic
        System.out.println("Data Saved in DB");
        db.terminateConnection();
    }

}
