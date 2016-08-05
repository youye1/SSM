package cn.youye.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by pc on 2016/7/8.
 */
public class DirList {
    public static void main(String[] args) {

    }

    class DirFilter implements FilenameFilter{

        private Pattern pattern;
        public DirFilter(String regex){
            pattern=Pattern.compile(regex);
        }
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }
}
