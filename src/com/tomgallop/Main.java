package com.tomgallop;

public class Main {

    public static void main(String[] args) {
        // Day 1 puzzle answers
        DayOneMethods day1 = new DayOneMethods();
        System.out.println("Day 1 - 1 : " + day1.getFrequency());
        System.out.println("Day 1 - 2 : " + day1.getDuplicate());

        // Day 2 puzzle answers
        DayTwoMethods day2 = new DayTwoMethods();
        System.out.println("Day 2 - 1 : " + day2.getChecksum());
        System.out.println("Day 2 - 2 : " + day2.getID());

        // Day 3 puzzle answers
        DayThreeMethods day3 = new DayThreeMethods();
        System.out.println("Day 3 - 1 : " + day3.getClaimsOverlap());
        System.out.println("Day 3 - 2 : " + day3.getIntactClaim());
    }

}
