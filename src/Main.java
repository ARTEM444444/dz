import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int count = 0;
        File file = new File("2_5386817483803989884.txt");
        Parser parser = new Parser();

        ArrayList<String> lines = parser.parser(file);

        Pattern pattern = Pattern.compile("[Сс]трад.*");
        for (String line : lines) {
            if (pattern.matcher(line).find()) {
                count++;
                }
            }
        System.out.println(count);

        try{
            int occurrences = 0;
            Scanner scanner = new Scanner(file);
            Pattern patter = Pattern.compile("[Сс]трад.*");
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
             if (patter.matcher(line).find()){
                 occurrences++;
             }
            }
            System.out.println(occurrences);
        } catch(FileNotFoundException ignored){
        }


        int sum = 10;
        for (int i = 1; i <= sum; i++){
            for (int j = 1; j <= sum; j++) {
                int w = i * j;
                System.out.print(w  + " ");
            }
            System.out.println("");

        }

    }





    }


















