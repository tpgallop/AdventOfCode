package com.tomgallop;

import java.io.*;

class DayThreeMethods {

    // Day 3 - 1 Method
    int getClaimsOverlap() {
        try {
            File file = new File("data", "input3.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data;
            int[][] array = new int[1000][1000];
            while((data = br.readLine()) != null) {
                String coordinates = data.substring((data.indexOf("@")+2),data.indexOf(":"));
                String size = data.substring(data.indexOf(":")+2);
                String[] coordinatesArray = coordinates.split(",");
                String[] sizeArray = size.split("x");
                int tempX = Integer.parseInt(coordinatesArray[1]);
                int tempY = Integer.parseInt(coordinatesArray[0]);
                int tempWidth = Integer.parseInt(sizeArray[0]);
                int tempHeight = Integer.parseInt(sizeArray[1]);
                for(int i=0; i<tempHeight; i++) {
                    for(int j=0; j<tempWidth; j++) {
                        array[tempX+i][tempY+j]++;
                    }
                }
            }
            int count = 0;
            for(int i=0; i<array.length; i++) {
                for(int j=0; j<array.length; j++) {
                    if(array[i][j] > 1) {
                        count++;
                    }
                }
            }
            return count;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    // Day 3 - 2 Method
    int getIntactClaim() {
        try{
            File file1 = new File("data", "input3.txt");
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String data;
            int[][] array = new int[1000][1000];
            while((data = br1.readLine()) != null) {
                String coordinates = data.substring((data.indexOf("@")+2),data.indexOf(":"));
                String size = data.substring(data.indexOf(":")+2);
                String[] coordinatesArray = coordinates.split(",");
                String[] sizeArray = size.split("x");
                int tempX = Integer.parseInt(coordinatesArray[1]);
                int tempY = Integer.parseInt(coordinatesArray[0]);
                int tempWidth = Integer.parseInt(sizeArray[0]);
                int tempHeight = Integer.parseInt(sizeArray[1]);
                for(int i=0; i<tempHeight; i++) {
                    for(int j=0; j<tempWidth; j++) {
                        array[tempX+i][tempY+j]++;
                    }
                }
            }
            br1.close();
            File file2 = new File("data", "input3.txt");
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            while((data = br2.readLine()) != null) {
                String coordinates = data.substring((data.indexOf("@")+2),data.indexOf(":"));
                String size = data.substring(data.indexOf(":")+2);
                String id = data.substring(data.indexOf("#")+1,data.indexOf("@")-1);
                String[] coordinatesArray = coordinates.split(",");
                String[] sizeArray = size.split("x");
                int tempX = Integer.parseInt(coordinatesArray[1]);
                int tempY = Integer.parseInt(coordinatesArray[0]);
                int tempWidth = Integer.parseInt(sizeArray[0]);
                int tempHeight = Integer.parseInt(sizeArray[1]);
                boolean failedClaim = false;
                for(int i=0; i<tempHeight; i++) {
                    for(int j=0; j<tempWidth; j++) {
                        if(array[tempX+i][tempY+j] > 1) {
                            failedClaim = true;
                            break;
                        }
                    }
                    if(failedClaim) {
                        break;
                    }
                }
                if(!failedClaim) {
                    return Integer.parseInt(id);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return -1;
    }
}
