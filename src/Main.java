import java.io.File;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import java.util.Date;

public class Main {
    private static final String a = "C:";



    public static void main(String[] args)  {

       final File file = new File(a);
        final File dirBackUP = new File("C:\\Users\\Сергей\\Desktop\\BackUP");
        long totalSpace = file.getTotalSpace();
        long freeSpace = file.getFreeSpace();
        System.out.println("Total " + totalSpace + " Bytes ");
        System.out.println("Avaible "+ freeSpace + " Bytes");
        LocalDate timeNow = LocalDate.now();
        System.out.println(timeNow.minusMonths(5));

        if (freeSpace < 226754275328l) {
            try {
                for (File f : dirBackUP.listFiles()) {
                    for (File s : f.listFiles()) {
                        for (File c : s.listFiles()) {
                            if (timeNow.minusMonths(5).isAfter((new Date(c.lastModified())).toInstant().atZone((ZoneId.systemDefault())).toLocalDate())) {
                                c.delete();


                            }
                        }
                    }
                }
            }
            catch (NullPointerException e) {
                System.out.println("any files not found at");
            }

        }


    }
}
