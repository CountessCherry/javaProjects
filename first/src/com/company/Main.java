package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.trafficLights;

public class Main {


   /*public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        IntStream thirdStream = IntStream.concat(evenStream, oddStream).filter(i -> (i%3 == 0 && i%5==0));
        List<Integer> result = thirdStream.sorted().mapToObj(i->i).collect(Collectors.toList());
        Collections.sort(result);
        if (result.size() > 2) {
            result.remove(0);
            result.remove(0);
        }
        return result.stream().mapToInt(x->x);// write your stream here
    }*/

   static void getWeirdList() {
       /*Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Integer> list = Arrays.stream(reader.readLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(list);
        List<Integer> ResultList = new ArrayList<Integer>();
        for (int i=0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) ResultList.add(list.get(i));
            out.println(list.get(i) + "ha");
        }
        for(int i=0; i < ResultList.size()-1; i++) {
            if (ResultList.get(i).equals(ResultList.get(i+1))) ResultList.remove(i);
        }
        for (int i:
             ResultList) {
            out.println(i);
        }*/

       // 2
        /*ListIterator<String> listIter = list.listIterator();
        while (listIter.hasNext()) {
            String p = listIter.next();
            if(p.equals("Hip")) listIter.add("Hop");
        }
        while (listIter.hasPrevious()) { listIter.previous(); }
        while (listIter.hasNext()) {
            out.println(listIter.next()); }*/
       //paste your code here

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String str = reader.readLine();
        String[] str1 = str.split(" ");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(Integer.parseInt(str1[0]));
        for (int i = 0; i < str1.length; i++) {
            ll.add(Integer.parseInt(str1[i]));
        }
        ll.remove(0);
        ll.remove(0);
        ll.remove(0);
        Collections.sort(ll);
        ll.stream().forEach(out::println);*/
       //your code
   }

    public static void main(String[] args) throws IOException {
        //PraktychnaKostika1.svetofor();

        trafficLights s = new trafficLights();
        s.work();


    }

    static void toDecimal(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        HashMap<String, Integer> symbols = new HashMap<>();
        symbols.put("IV", 4);
        symbols.put("IX", 9);
        symbols.put("XL", 40);
        symbols.put("XC", 90);
        symbols.put("CD", 400);
        symbols.put("CM", 900);
        symbols.put("I", 1);
        symbols.put("V", 5);
        symbols.put("X", 10);
        symbols.put("L", 50);
        symbols.put("C", 100);
        symbols.put("D", 500);
        symbols.put("M", 1000);

        Pattern p = Pattern.compile(".{2}");
        Matcher m = p.matcher(input);
        Integer resultNumber = 0;

        while (m.find()) {
            if (symbols.containsKey(m.group())) {
                resultNumber += symbols.get(m.group());
                System.out.println(m.group()+resultNumber + "holy f");
            }
            else {
                resultNumber += symbols.get(m.group());
                resultNumber += symbols.get(m.group());
                System.out.println(resultNumber);
            }
        }
    }
}






/*public class Main {

    public static void main(String[] args) throws IOException {

        // лаба костика 1
        /*int num, pow, in_arc, out_arc;
        Scanner s = new Scanner(System.in);
        GraphPoint[] newGraph = new GraphPoint[4];

        /*for (int i = 0; i < 4; i++) {
            out.print("Введи, пожалуйста, номер вершины ");
            num = s.nextInt();
            out.print("Теперь, будь добр, ее степень (количество ребер или дуг) ");
            pow = s.nextInt();
            out.print("Если граф ориентированнй, введи количество входящих в вершину дуг, если нет - 0 ");
            in_arc = s.nextInt();
            out.print("А теперь количество выходящих, опять же, если неориентированный - 0 ");
            out_arc = s.nextInt();
            newGraph[i] = new GraphPoint(num, pow, in_arc, out_arc);
        }

        out.println("номер третьей введенной точки: " + newGraph[2].getNumber_of_point());
        out.println("первая введенная вершина изолированная? " + newGraph[0].isIsolated());
        out.println("степень четвертой введенной точки: " + newGraph[3].getPower());*/

// ___________практична костика 1____________
        /*int[] array1 = {24, 42, 6, 9};
        int[] array2 = {2, 3, 5, 6};
        //out.println("количество одинаковых элементов" + PraktychnaKostika1.compareArrays(array1, array2));

        PraktychnaKostika1.svetofor();
        /*int[] ar = PraktychnaKostika1.sameFiguresInArray(array1);
        for (int value : ar) {
            if (value == 0) break;
            out.println(value);
        }

        String s = "rtfdgaabsfghaabsdrl";
        PraktychnaKostika1.SameFragments_yaTypaya();*/

        // лаба костика 2


 //   }
//}


