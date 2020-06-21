package com.company;
import static java.lang.System.*;
import javax.swing.*;

public class OOP_java {

    public void lesson1() {
        // lesson 1 "how to tell the world about ur feelings"
        out.println("Hello world!");
        JOptionPane.showMessageDialog(null, "учу джаву \nа как вы развлекаетесь?");
        out.println("");
    }

    public void lesson2() {
        // lesson 2 "how to convert ur feelings into something neutral
        String hochukkoste = "53.5";
        double pochemy_tak_grustno = Double.parseDouble(hochukkoste);
        out.println(pochemy_tak_grustno);
        int age_of_sad_girl = 17;
        out.println(age_of_sad_girl);
        out.println("");
    }

    public void lesson3 () {
        //lesson 3 "how to divide ur pain by the number of ur friends and other operations"
        double my_pain = 1000.5;
        double health_problems = 505.5;
        double time_with_o = 50;
        double time_without_k = 1000;
        double friends = 2;

        double amount_of_pain;
        amount_of_pain = my_pain + health_problems;
        out.println("health problems influence " + amount_of_pain);
        amount_of_pain = my_pain - time_with_o;
        out.println("time with o influence " + amount_of_pain);
        amount_of_pain = my_pain * time_without_k;
        out.println("time withoutk influence " + amount_of_pain);
        amount_of_pain = my_pain / friends;
        out.println("friends influence " + amount_of_pain);



        double notokay = amount_of_pain - (amount_of_pain % 1);
        int new_int = (int) amount_of_pain;

        out.println("float или что" + Integer.toString(new_int));


        new_int++;
        new_int--;

        out.println(new_int);

        new_int += 5;

        out.println(amount_of_pain % 3);

        int[] ar = new int[9];
    }

    public void lesson4() {
        //lesson 4 "don't forget to compare urself with other people"
        double howbeautifuliam = 0.5;
        double nastya_sBeauty = 100.0;

        out.println("Is Nastya more beautiful?"+(howbeautifuliam<nastya_sBeauty));
        out.println("mad. nastya is less beautiful? " + (howbeautifuliam>nastya_sBeauty));
        out.println("are our beauties equal? "+(howbeautifuliam==nastya_sBeauty));
        out.println("aren't our beauties equal?" + (howbeautifuliam!=nastya_sBeauty));

        out.println();
    }

    public void lesson5() {
        // lesson 5 "there's only 0 and 1"
        boolean happiness = true;
        boolean madness = false;
        boolean disappointment = false;

        boolean life_part1 = happiness || madness && disappointment;
        out.println(life_part1);
        boolean life_part2 = happiness&&disappointment || madness;
        out.println(life_part2);
        boolean life_part3 = happiness ^ disappointment;
        out.println(life_part3);
        out.println();
    }

    public void lesson6() {
        //lesson 6

        int a = 5;
        int b = 10;

        out.println(Integer.toBinaryString(a));
        out.println(Integer.toBinaryString(b));

        out.println(a&b);
        out.println(a|b);
        out.println(a^b);

        out.println(~a);
        out.println(Integer.toBinaryString(~a));
        out.println(a>>1);
        out.println(a<<1);
    }

    public void lesson7() {
        // lesson 7
        int first_number, second_number;
        while (true) {
            try {
                String aaa = JOptionPane.showInputDialog("Enter first positive number");
                first_number = Integer.parseInt(aaa);
                if (first_number < 0){
                    JOptionPane.showMessageDialog(null, "positive!!!");
                    continue;}
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter the number!!!");
            }
        }
        while (true) {
            try {
                String bbb = JOptionPane.showInputDialog("Enter second number(not 0)");
                second_number = Integer.parseInt(bbb);
                if (second_number == 0) {
                    JOptionPane.showMessageDialog(null, "great!!! the result is infinity, stupid");
                    continue;
                }
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter the number!!!");
            }
        }
        int result = second_number/first_number;
        JOptionPane.showMessageDialog(null, result);
    }

    public void lesson8() {
        //lesson 8
        int number;
        while (true) {
            try {
                String aaa = JOptionPane.showInputDialog("Enter int positive number");
                number = Integer.parseInt(aaa);
                if (number < 0){
                    JOptionPane.showMessageDialog(null, "positive!!!");
                    continue;}
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter correct number!!!");
            }
        }
        int res = 0;

        for (int i=1; i<=number; i++)
            res += i;
        JOptionPane.showMessageDialog(null, "sum from 1 to " + number + " = " + res);
    }

    public void lesson9() {
        // lesson 9
        int pos_num, i = 2, fac = 1;
        while (true) {
            try {
                String aaa = JOptionPane.showInputDialog("Enter first positive number");
                pos_num = Integer.parseInt(aaa);
                if (pos_num < 0){
                    JOptionPane.showMessageDialog(null, "positive!!!");
                    continue;}
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter the number!!!");
            }
        }
        while (i <= pos_num)
        {
            fac *= i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "factorial "+fac);
    }

    public void lesson10() {
// lesson 10
        do {
            try{
                String bb = JOptionPane.showInputDialog("Просто введите целое неотрицательное число, так надо");
                int kk = Integer.parseInt(bb);
                if (kk < 0)
                {
                    JOptionPane.showMessageDialog(null, "Читать научись - не-о-три-ца-тель-но-е");
                    continue;
                }
                JOptionPane.showMessageDialog(null, "Ну, спасибо");
                break;
            }
            catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Это целое число по-твоему?");
            }
        }
        while (true);
    }

    public void lesson11() {
        // lesson 11
        int f_num, s_num;
        while (true) {
            try {
                String aaa = JOptionPane.showInputDialog("Enter first number");
                f_num = Integer.parseInt(aaa);
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter the number!!!");
            }
        }

        while (true) {
            try {
                String aaa = JOptionPane.showInputDialog("Enter first number");
                s_num = Integer.parseInt(aaa);
                break;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "You didn't enter the number!!!");
            }
        }
        String operator = JOptionPane.showInputDialog("Enter the operator");

        switch (operator){
            case ("+"):
                JOptionPane.showMessageDialog(null, f_num+s_num);
                break;
            case ("-"):
                JOptionPane.showMessageDialog(null, f_num-s_num);
                break;
            case ("*"):
                JOptionPane.showMessageDialog(null, f_num*s_num);
                break;
            case("/"):
                JOptionPane.showMessageDialog(null, f_num/s_num);
                break;
            default:
                JOptionPane.showMessageDialog(null, "You have entered wrong operator");
                break;
        }
    }

    public void lesson12() {
        // lesson 12
        double summertime_sadness = 0, multiplex = 1;
        double[] elk = {2,3,4,5,6};

        int i = elk.length-1;
        while(i >= 0)
        {
            summertime_sadness += elk[i];
            i--;
        }
        out.println(summertime_sadness);
        for (int j = 0; j < elk.length; j++)
        {
            multiplex *= elk[j];
        }
        out.println(multiplex);
    }
}


