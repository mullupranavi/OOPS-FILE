import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\CSE-Lab1\\Documents\\MATLAB\\Examples\\R2023a\\multibody_deeplearning\\TrainHumanoidWalkerExample\\AV.SC.U4CSE24302.java\\Alien.txt")
            );
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
