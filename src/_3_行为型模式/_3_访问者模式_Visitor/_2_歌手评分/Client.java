package _3_行为型模式._3_访问者模式_Visitor._2_歌手评分;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        System.out.println("===== 男人/女人 是一种不变的数据结构 =====");
        objectStructure.attach(new Man());
        objectStructure.attach(new WoMan());

        System.out.println("===== 投票行为是经常变化的需求 =====");
        System.out.println("===== 投票成功行为（访问者） =====");
        objectStructure.display(new Success());
        System.out.println("===== 投票失败行为（访问者） =====");
        objectStructure.display(new Fail());
        System.out.println("===== 投票待定行为（访问者） =====");
        objectStructure.display(new Wait());
    }
}
