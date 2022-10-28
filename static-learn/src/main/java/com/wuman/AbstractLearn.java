package com.wuman;

/**
 * 外部抽象类不允许使用static声明，而内部的抽象类运行使用static声明。
 * 使用static声明的内部抽象类相当于一个外部抽象类，继承的时候使用“外部类.内部类”的形式表示类名称。
 * @author lmf
 * @version 1.0
 * @date 2022/10/28 10:29
 */
abstract class AbstractLearn {
    static abstract class B{
        public abstract void print();
    }
}

class C extends AbstractLearn.B{

    @Override
    public void print() {
        System.out.println("adaada");
    }
}

