package org.example;

import entities.Users;

import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        String path = "C:\\temp\\user.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<Users> set = new HashSet<>();
            String line = br.readLine();;

            while (line!= null){
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));

                set.add(new Users(userName, date));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }catch (IOException e){
            System.out.println("The file isn't empty: " + e.getMessage());
        }


    }
}