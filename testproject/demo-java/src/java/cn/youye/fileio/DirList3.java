package cn.youye.fileio;

import org.h2.server.web.PageParser;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * DirList3:进一步修改DirList2
 * 定义一个作为list()参数的匿名内部类
 * Created by pc on 2016/8/5.
 */
public class DirList3 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                //args参数是final的
                private Pattern pattern=Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String filename : list) {
            System.out.println("|--" + filename);
        }
    }
}
