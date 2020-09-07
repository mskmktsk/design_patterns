package _3_行为型模式._3_访问者模式_Visitor._1_遍历文件夹;

import java.io.File;

public interface Visitor {
    // 访问文件夹
    void visitDir(File dir);
    // 访问文件
    void visitFile(File file);
}
