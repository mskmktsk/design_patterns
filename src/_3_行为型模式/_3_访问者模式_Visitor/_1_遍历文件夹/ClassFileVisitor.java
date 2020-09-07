package _3_行为型模式._3_访问者模式_Visitor._1_遍历文件夹;

import java.io.File;

public class ClassFileVisitor implements Visitor {
    public void visitDir(File dir) {
    }

    public void visitFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Found class file: " + file);
        }
    }
}
