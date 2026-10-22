package GameTest;

import java.util.Random;

public class Role {
    private String name;
    private String face;
    private int blood;
    private char gender;
    private String[] boyfaces = {"目若朗星", "面如冠玉", "玉树临风", "风神俊朗", "眉如墨画", "容仪如玉"};
    private String[] girlfaces = {"明眸皓齿", "艳若桃李", "凤目含威", "容色绝丽", "飒艳绝尘", "螓首蛾眉"};

    public Role(char gender, int blood, String name) {
        this.gender = gender;
        this.blood = blood;
        this.name = name;
        setFace(gender);

    }

    public Role() {
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if (gender == '男') {
            Random r = new Random();
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            Random r = new Random();
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }
    }

    //攻击函数
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainblood = role.getBlood() - hurt;
        //判断血量是否为负
        remainblood = remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);
        System.out.println(this.getName() + "攻击了" + role.getName() +
                ",造成" + hurt + "点伤害，" + role.getName() + "还剩" + role.getBlood() + "点血");
    }

    public void show(Role role, char gender) {
        System.out.printf("人物：%s", role.getName());
        System.out.println();
        System.out.printf("血量：%d", role.getBlood());
        System.out.println();
        System.out.printf("外貌：%s", role.getFace());
        System.out.println();
    }

}
