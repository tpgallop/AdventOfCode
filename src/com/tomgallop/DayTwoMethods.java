package com.tomgallop;

import java.io.*;

class DayTwoMethods {

    // Day 2 - 1 Method
    int getChecksum() {
        int count2 = 0;
        int count3 = 0;
        boolean hasDouble = false;
        boolean hasTriple = false;
        try{
            File file = new File("C:\\Users\\Thomas\\Desktop\\InputFiles\\input2.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data;
            while ((data = br.readLine()) != null) {
                String[] stringArray = data.split("");
                for (String stringValue1 : stringArray) {
                    int count = 0;
                    for (String stringValue2 : stringArray) {
                        if (stringValue1.equals(stringValue2)) {
                            count++;
                        }
                    }
                    if(count == 3) {
                        hasTriple = true;
                    } else if(count == 2) {
                        hasDouble = true;
                    }
                }
                if(hasDouble) {
                    count2++;
                    hasDouble = false;
                }
                if(hasTriple) {
                    count3++;
                    hasTriple = false;
                }
            }
            return (count2 * count3);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    // Day 2 - 2 Method
    String getID() {
        try{
            File file1 = new File("C:\\Users\\Thomas\\Desktop\\InputFiles\\input2.txt");
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String data1;
            int count = 0;
            while ((data1 = br1.readLine()) != null) {
                String[] stringArray1 = data1.split("");
                File file2 = new File("C:\\Users\\Thomas\\Desktop\\InputFiles\\input2.txt");
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                String data2;
                while ((data2 = br2.readLine()) != null) {
                    String[] stringArray2 = data2.split("");
                    for (int i=0; i<stringArray1.length; i++) {
                        if(stringArray1[i].equals(stringArray2[i])) {
                            continue;
                        } else {
                            count++;
                            stringArray2[i] = "";
                        }
                    }
                    if(count == 1) {
                        return String.join("",stringArray2);
                    } else {
                        count = 0;
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
