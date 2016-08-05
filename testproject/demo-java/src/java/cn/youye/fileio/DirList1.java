package cn.youye.fileio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by pc on 2016/8/5.
 */
public class DirList1 {

    public static void main(String[] args) {
        //表示当前工作目录，是相对路径的一种写法,下面两种写法等价
//        File path = new File(".");
        File path = new File(".\\");
        //工作路径
        System.out.println("==>" + System.getProperty("user.dir"));
        //new File("..")工作目录的上层目录
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < list.length; i++) {
            System.out.println("/--" + list[i]);
        }
    }
}

/**
 * DirFilter:文件过滤类
 * FilenameFilter:文件名过滤器接口
 *
 *
 */
class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
