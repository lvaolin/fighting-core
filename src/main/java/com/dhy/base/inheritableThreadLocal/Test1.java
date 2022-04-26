package com.dhy.base.inheritableThreadLocal;

/**
 * @Project fighting-core
 * @Description 主要用途描述
 * @Author lvaolin
 * @Date 2022/4/26 上午11:25
 */
public class Test1 {
    public static void main(String[] args) {
        InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
        threadLocal.set("userId-1001");
        System.out.println("父线程set：userId-1001");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程get："+threadLocal.get());
            }
        });
        thread.start();
        System.out.println("over");
        while (true);
    }
}
