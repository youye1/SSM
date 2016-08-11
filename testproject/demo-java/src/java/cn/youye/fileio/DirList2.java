package cn.youye.fileio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * DirList2:匿名内部类改写DirList1,实现回调accept()
 * Created by pc on 2016/8/5.
 */
public class DirList2 {
    /**
     * 匿名内部类
     * @param regex 正则表达式，必需为final，
     *              只是匿名内部类的必要要求，
     *              这样才能引用来自该类范围之外的对象
     * @return 返回一个指向filenameFilter的引用
     */
    public static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String filename : list) {
            System.out.println("|--" + filename);
        }
    }

}
