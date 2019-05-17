import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        writeFile();
    }

    public static void writeFile() throws IOException {

        Path FILE_PATH = Path.of("D:\\projects\\Leetcode\\README.md");
        List<String> fileContent = new ArrayList<>(Files.readAllLines(FILE_PATH, StandardCharsets.UTF_8));

        Path COMPANY = Path.of("D:\\projects\\Leetcode\\companies.txt");
        List<String> companyContent = new ArrayList<>(Files.readAllLines(COMPANY, StandardCharsets.UTF_8));

        for (String queNo : new HashSet<>(companyContent)) {
            queNo = "_" + queNo.trim() + ".java";

            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).contains(queNo)) {
                    String updatedLine = updateLine(fileContent.get(i));
                    fileContent.set(i, updatedLine);
                    break;
                }
            }
        }

        Files.write(FILE_PATH, fileContent, StandardCharsets.UTF_8);
    }

    private static String updateLine(String s) {
        String companyName = "Snapchat,Square,Twitter,Uber,Yelp";

        String[] splits = s.split("\\|");
        if (splits[6].trim().isEmpty()) {
            splits[6] = companyName;
        } else {
            splits[6] = splits[6] + "<br>" + companyName;
        }
        return String.join("|", splits);
    }
}
