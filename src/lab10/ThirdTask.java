package lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ThirdTask {
    public static void Filelist(String path) {
        File f = new File(path);
        String[] fArray = null;

        if (f.isDirectory())
            fArray = f.list(null);
        else
            System.out.print("Папка не найдена");

        assert fArray != null;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(fArray));

        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

    public void testThirdTask() {
        Filelist("C:\\Users\\User\\IdeaProjects\\labs\\src");
    }

}
