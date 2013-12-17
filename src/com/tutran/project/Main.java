package com.tutran.project;

import com.tutran.problem.*;
import com.tutran.problem.handler.BaseHandler;

import java.io.*;

public class Main {
    static String path = "C:\\Users\\Tu_Tran\\ProjectEuler\\src\\com\\tutran\\input\\problem11.txt";
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File(path));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String current = "";
        int[][] input = null;
        int row = 0;
        while ((current = bufferedReader.readLine()) != null) {
            String[] strArray = current.split(" ");
            if (input == null) {
                int length = strArray.length;
                input = new int[20][length];
            }
            for (int i=0; i<strArray.length; i++) {
                input[row][i] = Integer.parseInt(strArray[i]);
            }
            row++;
        }
        bufferedReader.close();
        fileReader.close();
        BaseHandler handler = new Problem11();
        Object result = handler.solve(input);
        System.out.println(result);
    }
}
