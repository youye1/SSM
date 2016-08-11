package cn.youye.fileio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * DirList1:测试目录列表器
 * Created by pc on 2016/8/5.
 */
public class DirList1 {

    public static void main(String[] args) {
        //表示当前工作目录，是相对路径的一种写法,下面两种写法等价
        File path = new File(".");
        //File path = new File(".\\");

        //工作路径
        System.out.println("==>" + System.getProperty("user.dir"));
        //new File("..")工作目录的上层目录
        String[] list;
        //File[] fileList;
        if (args.length == 0) {
            //所有目录
            list = path.list();
            //所有文件
            //fileList = path.listFiles();
        } else {
            list = path.list(new DirFilter(args[0]));
            //            fileList = path.listFiles();
        }
        //排序
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String filename : list) {
            System.out.println("|--" + filename);
        }
    }
}

/**
 * DirFilter:文件过滤类
 * FilenameFilter:文件名过滤器接口,过滤不符合规范的文件名
 * 创建目的：将accept()方法提供给list()调用，list()回调accept().
 *   这是一个 策略模式 的例子。
 */
class DirFilter implements FilenameFilter {
    private Pattern pattern;

    //使用正则表达式来过滤文件名
    public DirFilter(String regex) {
        //pattern为正则表示编译后的模式
        //flag 参数介绍：
        //   CASE_INSENSITIVE：忽略大小写进行匹配
        pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    }

    public boolean accept(File dir, String name) {
        //matcher是一个状态机器，
        //由它根据pattern对象作为匹配模式对字符串展开匹配检查
        return pattern.matcher(name).matches();
    }
}
