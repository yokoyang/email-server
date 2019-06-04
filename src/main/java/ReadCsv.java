import com.csvreader.CsvReader;

import java.io.IOException;
import java.nio.charset.Charset;

public class ReadCsv {
    private static Student getEmail(String name) {
        Student student = new Student();
        String[] splitList = name.split("_");
        String email = splitList[0] + "@fudan.edu.cn";
        student.setEmail(email);
        student.setName(splitList[splitList.length - 1]);
        return student;
    }

    public static void read(String filePath) {
        SendMail sendMail = new SendMail();
        try {
            // 创建CSV读对象
            CsvReader csvReader = new CsvReader(filePath, ',', Charset.forName("GBK"));

            // 读表头
            csvReader.readHeaders();
            while (csvReader.readRecord()) {
                Student student = getEmail(csvReader.get("学号"));
                // 读这行的某一列
                student.setLab1(Float.valueOf(csvReader.get("lab1")));
                student.setLab2(Float.valueOf(csvReader.get("lab2")));
                student.setLab3(Float.valueOf(csvReader.get("lab3")));
                student.setAvg(Float.valueOf(csvReader.get("avg")));
                sendMail.sentStudent(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ReadCsv readCsv = new ReadCsv();
        readCsv.read("E:\\ta\\emailserver\\src\\main\\resources\\all.csv");
    }
}
