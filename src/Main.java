import java.io.File;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    private static final String a = "C:";
    private static SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");


    public static void main(String[] args)  {

       final File file = new File(a);
        final File dirBackUP = new File("C:\\Users\\si.romanov\\Desktop\\BackUP");
        long totalSpace = file.getTotalSpace();
        long freeSpace = file.getFreeSpace();
        System.out.println("Total " + totalSpace + " Bytes ");
        System.out.println("Avaible "+ freeSpace + " Bytes");
        LocalDate timeNow = LocalDate.now();
        if (freeSpace < 226754275328l) {
            try {
                for (File f : dirBackUP.listFiles()) {
                    for (File s : f.listFiles()) {
                        for (File c : s.listFiles()) {

                            System.out.print(c.getName());
                            System.out.print("  date create: ");
                            System.out.println(c.lastModified());
                            System.out.println(formatForDateNow.format(new Date(c.lastModified())));


                        }
                    }
                }
            }
            catch (NullPointerException e) {
                System.out.println("any files not found at");
            }

        }


        System.out.println(timeNow.minusMonths(5));
    }
}
