package cn.youye.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by pc on 2016/7/8.
 */
public class HelloFile {
    public static void main(String[] args) {
        String url="testproject/demo-java/src/resources/";
        String fileName;
        File file;
        int flag;
        HelloFile helloFile=new HelloFile();
        //文件创建、删除
        fileName= "hello.txt";
        flag=0;
        file=new File(url+fileName);
        helloFile.fileHelper(file,flag);
        //文件重命名 如果在不同分区 需要使用拷贝而不是重命名
        //重命名
//        File file1=new File(url+"test.txt");
//        file.renameTo(file1);

        //目录的创建、删除
        fileName= "test";
        flag=1;
        file=new File(url+fileName);
        helloFile.fileHelper(file,flag);

    }

    public void fileHelper(File file,int flag){
        if (file.exists()){
            if (file.isDirectory()){
                System.out.println("目录已存在");
                //只能删除空文件夹
                if (file.delete()){
                    System.out.println("文件夹删除成功");
                }else {
                    System.out.println("文件夹删除失败");
                }
            }
            if (file.isFile()){
                System.out.println("文件已存在");
                file.delete();
            }
        }else {
            try {
                if (flag==0){
                    //创建文件
                    file.createNewFile();
                    System.out.println("文件已创建");
                }
                else if (flag==1){
                    file.mkdir();
                    System.out.println("文件夹已创建");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
