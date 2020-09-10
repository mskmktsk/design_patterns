package _3_行为型模式._7_备忘录模式_Memento._2_游戏角色状态;

public class GameRole {
    private int atk;
    private int def;

    public void display() {
        atk -= 70;
        def -= 70;
    }

    public Memento saveRoleToMemento() {
        return new Memento(atk, def);
    }

    public void recoverRoleFromMemento(Memento memento) {
        atk = memento.getAtk();
        def = memento.getDef();
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
