import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class JParser {

    public static void main(String[] args) throws IOException {

        FileWriter outputStream = null;
        Scanner linReader = null;

        int i = 0;
        for (String filePath : args) {
            try {

                linReader = new Scanner(new File(args[i++]));

                String fileFolder = "c:\\per\\out\\";
                String tempFileName = null;//tempFileName = fileFolder + "temp" + System.currentTimeMillis() + ".txt";;
                String fileName = null;

                while (linReader.hasNext()) {
                    String line = linReader.nextLine();

                    String trimmedLine = line.trim();
                    if (trimmedLine.startsWith("[ (AC)")) {

                        if (outputStream != null) {
                            outputStream.close();

                            if (fileName != null && !fileName.isEmpty()) {
                                //new File(tempFileName).renameTo(new File( fileFolder + "\\" + fileName.trim() + ".txt"));

                                moveFiles(tempFileName, fileFolder + "\\" + fileName.trim() + ".txt");
                            }

                            tempFileName = fileFolder + "temp" + System.currentTimeMillis() + ".txt";
                            outputStream = new FileWriter(tempFileName);
                        } else {
                            tempFileName = fileFolder + "temp" + System.currentTimeMillis() + ".txt";
                            outputStream = new FileWriter(tempFileName);
                        }
                    }

                    if (trimmedLine.startsWith("[ (MI)")) {
                        fileName = trimmedLine.substring(trimmedLine.indexOf("manufacturer"), trimmedLine.indexOf(" serial :"));
                        fileName = fileName.trim().replace("manufacturer : ", "").replace("model : ", "").replace("firmware : ", "");
                    }

                    if (outputStream != null) {
                        outputStream.write(line);
                    }
                }

            } finally {
                if (linReader != null) {
                    linReader.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }
            }

        }

    }

    private static void moveFiles(String source, String target) {
        Path movefrom = FileSystems.getDefault().getPath(source);
        Path moveTo = FileSystems.getDefault().getPath(target);

        //method 1
        try {
            Files.move(movefrom, moveTo, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}