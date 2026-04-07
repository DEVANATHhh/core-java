package com.Project.myfile;


import com.Project.main.Information;

import java.sql.SQLOutput;

public class Home {
    public static void main(String[] args) {
        Information information=new Information(20,"Rahul");
        System.out.println(information.name);
        System.out.println(information.age);


    }
}
