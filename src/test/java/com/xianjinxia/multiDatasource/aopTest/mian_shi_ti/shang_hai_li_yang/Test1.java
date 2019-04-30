package com.xianjinxia.multiDatasource.aopTest.mian_shi_ti.shang_hai_li_yang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    @Test
    public void test222(){

        char[] arr = {'a','b','c'};
        change(arr);
        System.out.println(arr);
        System.out.println(arr);

    }
    public void change(char[] arr2){
        arr2[0] = 'g';
    }

    class People{
        String name;
        public People(){
            System.out.print("1");
        }
        public People(String name){
            System.out.print("2");
            this.name = name;
        }
    }

    class Child extends People{
        People father;
        public Child(String name){
            System.out.print("3");
            this.name = name;
            father = new People(name + ":F");
        }
        public Child(){
            System.out.print("4");
        }
    }

    @Test
    public void test333(){
        new Child("mike");
        System.out.println("Done");
    }
//11111111111
//    new Child("Mike");

//    由于是调用带参数的构造函数，而Child中没有明确调用带参数的父类构造函数如super（）或者super(name),则
// 自动调用people的无参构造函数，此时输出 1，然后调用Child的带参数构造函数，故输出3，由于Child的带参数构造
// 函数内部实例化了一个People对象，其调用的是People的带参数的构造函数，故输出1。

//    故结果是132

//    新建一个对象时只调用一个构造函数，所以new Child("Mike");输出132，new Child();输出14，不可能输出1324的。
// 两个this.name = name我不清楚你指的什么意思，就其功能来说是一样的。


    //
//    222222222222222222
//    https://www.cnblogs.com/panxuejun/p/8157622.html
//    new子类会先运行父类的构造函数
//    发现子类构造函数运行时，先运行了父类的构造函数。为什么呢?
//    原因：子类的所有构造函数中的第一行，其实都有一条隐身的语句super();
//super(): 表示父类的构造函数，并会调用于参数相对应的父类中的构造函数。而super():是在调用父类中空参数的构造函数。
//    为什么子类对象初始化时，都需要调用父类中的函数？(为什么要在子类构造函数的第一行加入这个super()?)
//    因为子类继承父类，会继承到父类中的数据，所以必须要看父类是如何对自己的数据进行初始化的。所以子类在进行对象初始化时，先调用父类的构造函数，这就是子类的实例化过程。

//
//    3333333333333
//    https://zhidao.baidu.com/question/2073566699696714468.html
//    在Java中，子类的构造过程中，必须 调用其父类的构造函数， 所以说，子类对象比父类对象大，
// 子类对象里面包含了一个父类的对象，这是内存中真实的情况. 构造方法是new一个对象的时候，必须要调的方法，
// 这是规定，要new父类对象出来，那么肯定要调用其构造方法，所以 第一个规则：子类的构造过程中，必须 调用其父类
// 的构造方法 一个类，如果我们不写构造方法，那么编译器会帮我们加上一个默认的构造方法，所谓默认的构造方法，
// 就是没有参数的构造方法，但是如果你自己写了构造方法，那么编译器就不会给你添加了 所以有时候当你new一个子类
// 对象的时候，肯定调用了子类的构造方法，但是在子类构造方法中我们并没有显示的调用基类的构造方法，就是没写，
// 如：super(); 并没有这样写，但是 第二个规则：如果子类的构造方法中没有显示的调用基类构造方法，则系统默认调用
// 基类无参数的构造方法 注意：如果子类的构造方法中既没有显示的调用基类构造方法，而基类中又没有默认无参的构造方
// 法，则编译出错，所以，通常我们需要显示的：super(参数列表)，来调用父类有参数的构造函数 看我屏幕，听我讲课!
}
