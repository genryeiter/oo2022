import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<List<Double>> readFile(String path) {
        BufferedReader reader;

        List<List<Double>> returnArray = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while(line != null) {
                List<Double> tempArray = new ArrayList<>();

                String[] splittedString = line.split("/");

                for (int i = 0; i < splittedString.length; i++) {
                    tempArray.add(Double.valueOf(splittedString[i]));
                }

                returnArray.add(tempArray);

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnArray;
    }
}
