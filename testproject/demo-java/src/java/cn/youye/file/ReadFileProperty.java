package cn.youye.file;

import java.io.*;

/**
 * Created by pc on 2016/7/8.
 */
public class ReadFileProperty {
    public static void main(String[] args) {
        String url;
        url = "testproject/demo-java/src/resources/hello.txt";
        File file;
        file = new File(url);
        ReadFileProperty readFileProperty = new ReadFileProperty();
        readFileProperty.FileHelper(file, "", 1);

        //修改文件属性
        url = "F:/other";
        file = new File(url);
        printFiles(file, 0);

        //读文件
        url = "testproject/demo-java/src/resources/hello.txt";
        file = new File(url);
        readFileProperty.fileRead(file, "UTF-8");
        //写文件

        readFileProperty.fileWritte(file, "UTF-8");

    }

    public void FileHelper(File file, String url, int flag) {

        try {
            if (file.exists()) {
                System.out.println("文件名称：" + file.getName());
                System.out.println("文件路径：" + file.getPath());
                System.out.println("文件绝对路径：" + file.getAbsolutePath());
                System.out.println("文件父路径：" + file.getParent());
                System.out.println("文件字节数：" + file.length() + "byte");
                System.out.println("文件大小：" + (float) file.length() / 1000 + "KB");
                System.out.println("文件是否可写：" + file.canWrite());
                //file.setReadOnly();
//                file.setWritable(true);
                System.out.println("文件是否可写：" + file.canWrite());
            } else {
                System.out.println("文件或路径不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFiles(File file, int tab) {
        try {
            if (file.exists()) {
                File files[] = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    for (int j = 0; j < tab; j++) {
                        System.out.print("|---");
                    }
                    System.out.println(i + ": " + files[i].getName());
                    if (files[i].isDirectory()) {
                        printFiles(files[i], tab + 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void fileRead(File file, String encoding) {
        if (file.exists()) {
            try {
                FileInputStream fins = new FileInputStream(file);
                InputStreamReader inreader = new InputStreamReader(fins, encoding);
                BufferedReader br = new BufferedReader(inreader);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                inreader.close();
                fins.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void fileWritte(File file, String encoding) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("hello world\n");
            bw.close();
            osw.close();
            fos.close();
            System.out.println("写入完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
