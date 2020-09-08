package _3_行为型模式._3_访问者模式_Visitor._2_歌手评分;

public interface Action {
    void getManResult(Man man);
    void getWoManResult(WoMan man);
}
