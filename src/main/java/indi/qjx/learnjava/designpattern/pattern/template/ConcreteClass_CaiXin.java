package indi.qjx.learnjava.designpattern.pattern.template;

/**
 * @version v1.0
 * @ClassName: ConcreteClass_BaoCai
 * @Description: 炒菜心类
 * @Author: 黑马程序员
 */
public class ConcreteClass_CaiXin extends AbstractClass {

    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
