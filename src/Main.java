import java.io.File;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static final String a = "C:";
    public static String aa = "C:\\Users\\si.romanov\\Desktop\\BackUP\\FULL";

    public static void main(String[] args) {

        final File file = new File(a);
        final File dirBackUP = new File("C:\\Users\\si.romanov\\Desktop\\BackUP");
        long totalSpace = file.getTotalSpace();
        long freeSpace = file.getFreeSpace();
        System.out.println("Total " + totalSpace + " Bytes ");
        System.out.println("Avaible " + freeSpace + " Bytes");
        LocalDate timeNow = LocalDate.now();
        System.out.println(timeNow.minusDays(90));
        int d = 5;

//        if (freeSpace < 226754275328l) {
//            try {
//                for (File f : dirBackUP.listFiles()) {
//                    for (File s : f.listFiles()) {
//                        for (File c : s.listFiles()) {
//                            if (timeNow.minusDays(90).isAfter((new Date(c.lastModified())).toInstant().atZone((ZoneId.systemDefault())).toLocalDate())) {
//                                c.delete();
//
//
//                            }
//                        }
//                    }
//                }
//            } catch (NullPointerException e) {
//                System.out.println("any files not found at");
//            }
//        }
        List<File> list = new ArrayList();
        String aa = "C:\\Users\\si.romanov\\Desktop\\BackUP\\FULL";
        File file1 = new File(aa);

        for (File g : file1.listFiles(new Filter())) {
            for (File k : g.listFiles()) {

            }
        }
    }
}