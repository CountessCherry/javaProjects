package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.*;

import static java.lang.System.*;
import static java.util.Arrays.stream;


import com.company.ListMultiplicator;

/*class Box<T>  {

    private T cake;


    public void put(T cake) {
        this.cake = cake;
    }

    public T get() {
        return this.cake;
    }
}
// This class and its subclasses should pass quality check
class Food {}

class Bakery extends Food {}

class Cake extends Bakery {}

class Pie extends Bakery {}

class Tart extends Bakery {}

class Packer {

    public void repackage(Box<?> to, Box<?> from) {
        Object inSecondBox = to.get();
        Object inFirstBox = from.get();
        if (inFirstBox instanceof Bakery && ) {
            to.put(inFirstBox);
        }
        // Implement repackaging
    }

}*/


public class Stepik {
    public static List<Integer> getList() {
        return Stream.of(1, 2, 3, 40).collect(Collectors.toList());
    }


    public void task1(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
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


        Integer resultNumber = 0;
        int i = 0;
        while (i < input.length()) {
            if (i == input.length() - 1) {
                resultNumber += symbols.get(input.substring(i, i + 1));
                i++;
            } else {
                if (symbols.containsKey(input.substring(i, i + 2))) {
                    resultNumber += symbols.get(input.substring(i, i + 2));
                    i += 2;
                } else if (symbols.containsKey(input.substring(i, i + 1))) {
                    resultNumber += symbols.get(input.substring(i, i + 1));
                    i++;
                }
            }
        }
        System.out.println(resultNumber);
    }

    public void task2(String[] args) throws IOException {
        int n = new Scanner(in).nextInt();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i == n / 2 - n % 2 + 1) || (j == n / 2 - n % 2 + 1) || (i == (n - j - 1)))
                    matrix[i][j] = "*";
                else matrix[i][j] = ".";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public void task5(String[] args) throws IOException {
        String[] genome = new Scanner(in).nextLine().toLowerCase().split("");

        double counterCG = 0;
        for (String i :
                genome) {
            if (i.equals("c") || i.equals("g")) counterCG++;
        }
        double EGcontent = counterCG / genome.length;
        System.out.println(EGcontent);
    }

    public void task7(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Integer> InputList = Stream.of(reader.readLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ResultList = InputList.stream().sorted().filter(e -> Collections.frequency(InputList, e) > 1).distinct()
                .collect(Collectors.toList());
        for (int i :
                ResultList) {
            System.out.print(i + " ");
        }
    }

    public void task8(String[] args) throws IOException{
    // read words and write them to dictionary
    Scanner s = new Scanner(in);
    int d = s.nextInt();
    String word;
    String[] dictionary = new String[d + 1];
        for(
    int i = 0;
    i<=d;i++)

    {
        word = s.nextLine();
        dictionary[i] = word.toLowerCase();
    }

    // read words which need to be checked
    int l = Integer.parseInt(s.nextLine());
    String[] text;
    List<String> wrongText = new ArrayList<>();

    boolean fl = false;
        for(
    int i = 0;
    i<l;i++)

    {
        text = s.nextLine().split(" ");
        for (String w : text) {
            w = w.toLowerCase();
            for (String cw : dictionary) {
                if (!(w.equals(cw))) {
                    fl = true;
                } else {
                    fl = false;
                    break;
                }
            }
            if (fl) wrongText.add(w);
            fl = false;
        }
    }

        wrongText.stream().

    distinct().

    sorted().

    forEach(System.out::println);

}
    public void task9(String[] args) throws IOException {
        Scanner s = new Scanner(in);
        System.out.println(IntStream.rangeClosed(s.nextInt(), s.nextInt()).filter(x->(x%3==0)).average().getAsDouble());

    }



    public static long factorial(long n) {

        /*return Stream.iterate(1, i -> i + 1)
                .limit(n).reduce((x,y)->x*y).orElse(1);*/
        return LongStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    }
    public void task10(String[] args) throws IOException {
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        int i = 0, j, number = 1;
        int start = 0, end = n;
        while (number < n * n) {
            i = start;
            for (j = start; j < end - 1; j++) matrix[i][j] = number++;
            for (i = start; i < end - 1; i++) matrix[i][j] = number++;
            for (j = end - 1; j > start; j--) matrix[i][j] = number++;
            for (i = end - 1; i > start; i--) matrix[i][j] = number++;
            --end;
            ++start;
        }
        if (n % 2 == 1) matrix[n / 2][n / 2] = n * n;
        for (int l = 0; l < n; l++) {
            for (int k = 0; k < n; k++) {
                System.out.print(matrix[l][k] + " ");
            }
            System.out.println();
        }
    }

    public void task11(String[] args) throws IOException {
        Collectors.partitioningBy((String x)->{StringBuilder l = new StringBuilder();
        return l.append(x).reverse().toString().equals(x);});

    }

   /* public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        long res =  accounts.stream()
                .filter(x->x.getBalance()>0)
                .flatMap(x->x.getTransactions()
                        .stream()
                        .filter(y->y.getState().equals("Canceled")))
                .reduce(0, x->x.getSum());
        return res;
    }*/

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate predicate = predicates.get(0);
        for(int i = 1; i < predicates.size(); i++) {
            predicate = predicate.or(predicates.get(i));
        }
        return predicate;
    }

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return Stream.of(text.split(" ")).filter(badWords::contains).sorted().distinct();
    }

    public static void setsFromStr(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = stream(sets[0].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());

        Set<Integer> set2 =  stream(sets[1].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());

        Set<Integer> set3 = stream(sets[2].split(" ")).map(Integer::valueOf).collect(Collectors.toSet());

        TreeSet<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

        NavigableSet<Integer> treeReverse = resultTreeSet.descendingSet();

        treeReverse.forEach(System.out::println);
    }

   static long IhateThisLife (long x, long y) {
       long x1 = x;
       if (x!= y) while (x<y) {
           x1*=++x;
       }
       return x1;
   }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            Integer t = it.next();
            System.out.println();
            if (set2.contains(t)) {
                set2.remove(t);
                it.remove();
            }
        }
        set1.addAll(set2);
        return set1;
    }


    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    static List<String> changeList(List<String> list){
        List<String> resList = new ArrayList<String>();
        String maxElem = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > maxElem.length()) maxElem = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            resList.add(maxElem);
        }
        return resList;
    }

    public static final IntBinaryOperator sumOperator =
        (int a, int b) -> {
            while (a != b) b += a++;
            return b;
        };
     // write your code here

    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = (a, b) -> a * b;

    public static void filterLists() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = bigList.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> div3list = bigList.stream()
                .filter(x -> x % 3 == 0)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> otherlist = bigList.stream()
                .filter(x -> x % 2 != 0 && x % 3 != 0)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists

        //get result list from createListOfLists
        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        //call printInLine() for resultList
        //printInLine(resultList);
    }

    public static void main(String[] args) throws IOException {



    }

    public static boolean isPrime(final long number) {
        return LongStream.rangeClosed(2, number-1).allMatch(x -> number % x !=0);
    }

    public static List<Integer> createBigList(String str){
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");
        bigList = stream(strarr).map(Integer::valueOf).collect(Collectors.toList());
        bigList.forEach(System.out::println);
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list ,List<Integer> otherList){
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(div2list);
        resultList.add(div3list);
        resultList.add(otherList);

        return resultList;
    }

    public static void print(List<Double> list){
        Spliterator<Double> split = list.spliterator();
        split.trySplit().forEachRemaining(x -> { if (x >= 2) { System.out.println(x); }});
        split.forEachRemaining(x -> { if (x >= 10) { System.out.println(x); }});
    }

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map){
        if (map.firstEntry().getKey() % 2 != 0) {
            map.subMap(map.firstKey(), true, map.firstKey()+5, true).descendingMap();
        } else {
            map.subMap(map.lastKey(), true, map.lastKey()-5, true).descendingMap();
        }
        return map;
    }

    public static void reverseList(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<String>(
                Arrays.asList(reader.readLine().split(" ")));
        ListIterator<String> listIter = list.listIterator();
        while (listIter.hasNext()) {
            String t = listIter.next();
            if (t.startsWith("J")) {
                listIter.set(t.substring(1));
            } else {
                listIter.remove();
            }
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    public static void wellHello(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String[] strings = reader.readLine().split(" ");
            List<Integer> helpList = getList();
            Set<Integer> set = Arrays.stream(strings).map(Integer::valueOf).collect(Collectors.toSet());
            set.addAll(helpList);

            set = removeAllNumbersMoreThan10(set);
            set.forEach(System.out::println);
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer you dumb rotted fish");
        }
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
        Iterator<Integer> iterator = set.iterator();
        iterator.forEachRemaining(x -> { if (x > 10) iterator.remove(); });
        return set;
    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));
        return resultSet;
    }
}


class CaloryGrader {

    /**
     * Returns sorted in ascending order copy of items list.
     *
     * Sort order is defined by item calories.
     *
     * @param items collection of items to sort
     * @return sorted copy
     */
   /* public List<?> grade(List<?> items) {
        for (var item : items) {
            if (!Calorie.class.isAssignableFrom(item.getClass())) {
                throw new RuntimeException();
            }
        }
        List listCopy = new ArrayList();
        for (int i = 0; i<items.size(); i++) {
            for (int j = 0; j < items.size()-1; j++) {
                if (items.get(j).compareTo() > items.get(j+1).getCalories()) {
                    listCopy.add(items.get(j+1));
                    listCopy.add(items.get(j));
                } else {
                    listCopy.add(items.get(j));
                    listCopy.add(items.get(j+1));
                }
            }
        }
        return listCopy;
        //items.stream().map(x->x.getCalories()).sorted();
    }*/

}

class Paper {}

class Bakery {}

class Cake extends Bakery {}

class ReflexiveBaker {

    /**
     * Create bakery of the provided class.
     *
     * @param order class of bakery to create
     * @return bakery object
     */
    public Object bake(Class order) {
        try {
        Class<?> clazz = Class.forName(order.getName());
        Constructor<?> ctor = clazz.getConstructor(String.class);
        Object object = ctor.newInstance();
        return object;

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }

        // Add implementation here
    }

}
