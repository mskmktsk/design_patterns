package _3_行为型模式._3_访问者模式_Visitor._1_遍历文件夹;

import java.io.File;

public class FileStructure {
    // 根目录
    private File path;

    public FileStructure(File path) {
        this.path = path;
    }

    public void handle(Visitor visitor) {
        scan(this.path, visitor);
    }

    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            // 让访问者处理文件夹
            visitor.visitDir(file);
            for (File sub: file.listFiles()) {
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            // 让访问者处理文件
            visitor.visitFile(file);
        }
    }
}
