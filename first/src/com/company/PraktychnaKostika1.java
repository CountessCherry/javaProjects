package com.company;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class PraktychnaKostika1 {
    public static int compareArrays(int[] array1, int[] array2) {
        boolean fl = false;
        int result = 0;
        for (int item : array1) {
            for (int value : array2) {
                fl = false;
                if (item == value) {
                    fl = true;
                    System.out.println(item + " " + value);
                    break;
                }
            }
            if (fl) result++;
        }
        return result;
    }

    public static void svetofor() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("esc to terminate");
        String code;
        boolean running = true;
        while (running) {
            System.out.println("red");
            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("тебя никто не любит. еще и программа не работает. поздравляю, у тебя ужасная жизнь.");
            }
            System.out.println("yellow");
            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("тебя никто не любит. еще и программа не работает. поздравляю, у тебя ужасная жизнь.");
            }
            System.out.println("green");
            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("тебя никто не любит. еще и программа не работает. поздравляю, у тебя ужасная жизнь.");
            }
            System.out.println("yellow");
            code = sc.nextLine();
            if (code.equals("a")) running = false;
        }
    }

    public static int[] sameFiguresInArray(int[] array){
        int[] result_array = new int[array.length];
        boolean flag = false;
        int counter = 0;
        for (int i = 0; i < array.length-1; i++) {
            char[] ch_item = Integer.toString(array[i]).toCharArray();
            char[] ch_item2 = Integer.toString(array[i+1]).toCharArray();

            for (int item : ch_item) {
                for (int value : ch_item2) {
                    flag = false;
                    if (item == value) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag){
                result_array[counter++] = array[i];
                result_array[counter++] = array[i+1];
            }
        }
        return result_array;
    }

    public static void SameFragments_yaTypaya() {
        String str1 = "rrrrrterwterweswhonfghonf";
        int lenght = str1.length();
        int iter = (lenght - (lenght / 4));
        for (int i = 0; i < iter; i++){
            String temp1 = str1.substring(i,i+4);

            for (int j = 0; j < iter; j++){
                String temp2 = str1.substring(j, j+4);

                if (temp1.equals(temp2) && i != j) {
                    System.out.println(j + ", " + temp2);
                }
            }
        }
        /*char[] temp = new char[4];
        char[] str1 = str.toCharArray();
        char[][] result = new char[str1.length / 4][4];
        boolean flag = false;
        int c = 3;
        int l = 0;
        for(int i = 0; i < str.length() - 4; i++) {
            temp[0] = str1[l];
            temp[1] = str1[++l];
            temp[2] = str1[++l];
            temp[3] = str1[++l];
            for (int k = 0; k < str.length() - 4; k++) {
                for (int j = 0; j < 4; j++) {
                    if (temp[j] == str1[++c]) {
                        flag = true;
                    }
                    else {
                        flag = false;
                    break;
                    }
                }
                c -= 3;
                if (flag) return temp;
            }
        }
        return temp;*/
    }

}
