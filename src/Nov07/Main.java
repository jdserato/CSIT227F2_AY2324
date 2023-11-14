package Nov07;

import Sept05.Cat;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int a  = 5 / 0;
        } finally {
            System.out.println("FINALLY YEY");
        }


        BufferedWriter bw = null;
        try {
            // ABSOLUTE PATH
//            FileReader fr = new FileReader("C:\Users\User\IdeaProjects\CSIT227F2\src\Nov07\iloveyou.txt");
//             RELATIVE PATH
            FileReader fr = new FileReader("src/Nov07/iloveyou.txt");
//            int ch;
//            while ((ch = fr.read()) != -1){
//                System.out.printf("%c", ch);
//            }
//            BufferedReader br = new BufferedReader(fr);
            BufferedReader br = new BufferedReader(new FileReader("src/Nov07/iloveyou.txt"));
            BufferedReader br2 = new BufferedReader(fr);
            System.out.println("1b: " + br2.readLine());
            System.out.println("1a: " + br.readLine());
            System.out.println("2a: " + br.readLine());
            System.out.println("2b: " + br2.readLine());
            br.close();
            System.out.println("3b: " + br2.readLine());
//            System.out.println(br.readLine());
//            br.skip(5);
//            br.read();
//            br.readLine();
//            System.out.println(br.readLine());
//            String ch;
//            ArrayList<String> lines = new ArrayList<>();
//            while ((ch = br.readLine()) != null){
//                lines.add(ch);
//            }
//            System.out.println(lines.get(2));
            System.out.println("\nFound the file yey");

            FileWriter fw = new FileWriter("ihateyou.txt", true);
            bw = new BufferedWriter(fw);
            String name = "Jay Vince Serato";
            Cat cat = new Cat("Neko", 5);
            Scanner sc = new Scanner(System.in);
            int ctr = 0;
            while (true) {
                for (int i = 0; i < 100; i++) {
                    bw.write("Hello world");
                    bw.newLine();
                    ctr++;
                }
                System.out.println(ctr);
                String s = sc.nextLine();
                if (s.equals("x")){
                    break;
                }
            }
//            return;
//            int a = 5 / 0;
//            System.out.println("Done writing");
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found so sad");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ENTERED FINALLY");
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
