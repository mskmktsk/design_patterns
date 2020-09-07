package _3_行为型模式._3_访问者模式_Visitor._1_遍历文件夹;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileStructure fileStructure = new FileStructure(new File("E:\\Developer\\Java\\"));
        Visitor javaFileVisitor = new JavaFileVisitor();
        Visitor classFileVisitor = new ClassFileVisitor();
        fileStructure.handle(javaFileVisitor);
        fileStructure.handle(classFileVisitor);
    }
}
