import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class var12 {
    /** Class */
    private String inputFileName;
    private String outputFileName;
    private ArrayList<String> sorted = new ArrayList<>();
    public var12() {

    }
    public void getInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input file: ");
        inputFileName = in.nextLine();
        System.out.print("Output file: ");
        outputFileName = in.nextLine();
    }
    public HashMap<String, Integer> GetMap(String inputFileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String line;
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Input file: ");

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] words = line.split(" ");
            for (String word: words){
                if (!map.containsKey(word)){
                    map.put(word,1);
                }else{
                    map.replace(word,map.get(word)+1);
                }
            }
        }
        reader.close();
        return map;
    }
    public void WritetoFile(String outputFileName, HashMap<String, Integer> map) throws IOException {
        System.out.println("\nOutput file: ");
        FileWriter writer = new FileWriter(outputFileName, false);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 3){
                sorted.add(key);
            }
        }
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String word: sorted) {
            System.out.print(word+ " ");
            writer.write(word + " ");
        }
        //запись в новый файл

        writer.flush();
    }
}
