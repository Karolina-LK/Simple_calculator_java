package com.kodilla;

public class FirstClass_Calculator {

        public int addAToB(int a, int b) {
        return a + b;
        }

        public int substractAFromB(int a, int b) {
        return a - b;
        }
 }

    class Application
    {
        public static void main(String[] args) {

            SimpleCalculator simpleCalculator = new SimpleCalculator();

            int result = simpleCalculator.substractAFromB(10, 5);
            int result2 = simpleCalculator.addAToB(10,5);

            System.out.println("Substracting: " + result + "\n" + "Adding: " + result2);
        }
    }


