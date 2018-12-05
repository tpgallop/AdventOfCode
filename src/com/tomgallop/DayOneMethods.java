package com.tomgallop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class DayOneMethods {

    // Day 1 - 1 method
    int getFrequency() {
        try {
            File file = new File("data","input1.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data;
            int value = 0;
            while ((data = br.readLine()) != null) {
                value += Integer.parseInt(data);
            }
            return value;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    // Day 1 - 2 method
    int getDuplicate() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int value = 0;
        while(true) {
            try {
                File file = new File("data","input1.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String data;
                while ((data = br.readLine()) != null) {
                    value += Integer.parseInt(data);
                    if (findValue(arrayList,value)) {
                        return value;
                    } else {
                        arrayList.add(value);
                    }
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    private static boolean findValue(ArrayList<Integer> arrayList, int value) {
        for (Integer i : arrayList) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
