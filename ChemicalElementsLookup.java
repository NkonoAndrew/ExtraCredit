package com.sjsu;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ChemicalElementsLookup {
    public static void main(String[] args) throws IOException, NoSuchChemicalElementException {
        Scanner userInput = new Scanner(System.in);
        //System.out.println("enter the name of chemical element:");
        //String elementName = userInput.next().toLowerCase();

        String filename = "elements.csv";
        String element = "helium";


        getMassFromCsvFile(filename, element);
        // TODO:
        //  call the method getMassFromCsvFile,
        //  handle the exception
        //  print the result if no exception happens

    }

    public static double  getMassFromCsvFile(String filename, String elementName) throws NoSuchChemicalElementException, IOException {
//        String name = " ";
//        String weight = " ";
        File file = new File(filename);
        ArrayList<Object> list = new ArrayList<>();
        Scanner atomics = new Scanner(file);
        atomics.useDelimiter("\\,");

        while (atomics.hasNext()) {
           String name = atomics.next().toLowerCase();
           String weight = atomics.next().toLowerCase();

           list.add(name);
           list.add(weight);

            //list.add(atomics.next().toLowerCase());
        }
        atomics.close();
        System.out.println(list);

        return 0;
    }
}
