package com.company;

public class Main {

    public static void main(String[] args) {
        


            Byte age = 21;
            Short height = 83;
            int myOnlineSalary = 70000000;
            long myWay = 3000000000000000000l;
            double cell = 2334655434534645345463465445665456456565445633765468764d;
            char money = '$';
            boolean student = true;
            String name = "Olexij";

            String history = ("    My name is " + name + ", and i'm " + age + ". I earn "
                    + myOnlineSalary + money +  " in GTA V every day."+"Passed on foot more "
                    + myWay + "km. " +"I like traveling."+ " I have " + cell +
                    " cells in my body and i'm a student -> " + student);

            System.out.println(history.length());
            System.out.println(history);
    }
}
