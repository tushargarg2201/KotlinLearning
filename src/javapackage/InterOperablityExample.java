package javapackage;

import kotlinpackage.samplefunctions.*;

public class InterOperablityExample {
    public static void main(String[] args) {
        int result = InterOperablityKt.sumOfThreeNumbers(1, 2, 3);
        System.out.println("Sum of three numbers using InterOperablity -->" + result);
    }
}
