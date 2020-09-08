package _3_行为型模式._3_访问者模式_Visitor._2_歌手评分;

public class Fail implements Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人投了失败票！");
    }

    @Override
    public void getWoManResult(WoMan man) {
        System.out.println("女人投了失败票！");
    }
}
