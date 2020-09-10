package _3_行为型模式._7_备忘录模式_Memento._2_游戏角色状态;

public class Memento {
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public Memento(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
