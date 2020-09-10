package _3_行为型模式._7_备忘录模式_Memento._2_游戏角色状态;

public class Client {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        Caretaker caretaker = new Caretaker();

        role.setAtk(100);
        role.setDef(100);
        System.out.println("大战前，角色攻击力：" + role.getAtk() + "，防御力：" + role.getDef());
        caretaker.add(role.saveRoleToMemento());
        role.display();
        System.out.println("大战后，角色攻击力：" + role.getAtk() + "，防御力：" + role.getDef());
        role.recoverRoleFromMemento(caretaker.get());
        System.out.println("恢复到大战前的状态，角色攻击力：" + role.getAtk() + "，防御力：" + role.getDef());
    }
}
