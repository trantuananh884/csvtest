package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String COMMA = ",";
    private static String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {
        Country aus = new Country("Australia",1,"Aus");
        Country vie = new Country("Vietnam", 2,"VN");
        List<Country> Countries = new ArrayList<>();
        Countries.add(aus);
        Countries.add(vie);
        File f = new File("csv.csv");
        FileWriter fileWriter = new FileWriter(f);
        for(Country country:Countries){
            fileWriter.append(country.getName());
            fileWriter.append(COMMA);
            fileWriter.append(String.valueOf(country.getId()));
            fileWriter.append(COMMA);
            fileWriter.append(country.getShortname());
            fileWriter.append(NEW_LINE);
        }
        fileWriter.close();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = null;
        while ((line = br.readLine())!= null){
            String[]result = line.split(COMMA);
            if(result.length == 3){
                String name = result[0];
                String id = result[1];
                String shortname = result[2];
                System.out.println(name + id + shortname);
            }
        }
    }
}
