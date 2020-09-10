package _3_行为型模式._7_备忘录模式_Memento._2_游戏角色状态;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caretaker {
    // 单人，单状态记录
    private Memento memento;
    // 单人，多状态记录
//    private List<Memento> mementoList = new ArrayList<>();
    // 多人，多状态记录
//    private Map<String, List<Memento>> mementoListMap = new HashMap<>();

    public void add(Memento memento) {
        this.memento = memento;
    }

    public Memento get() {
        return memento;
    }
}
