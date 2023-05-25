import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.toString().equalsIgnoreCase(Main.aa + "\\remont_it");
    }
}
