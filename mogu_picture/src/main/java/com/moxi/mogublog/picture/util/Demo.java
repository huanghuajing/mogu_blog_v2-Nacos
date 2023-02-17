package com.moxi.mogublog.picture.util;

import java.util.concurrent.Semaphore;

public class Demo {


    final static Semaphore semaphore = new Semaphore(1);

    static int num = 10;

    public static void main(String[] args) {

        Thread a = new Thread(() -> {
//            try {
//                semaphore.acquire();
//                num--;
//                System.out.println("a线程执行"+num);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }finally {
//                semaphore.release();
//            }

            num--;
            System.out.println("a线程执行" + num);
        }, "a");
        Thread b = new Thread(() -> {
//            try {
//                semaphore.acquire();
//                num--;
//                System.out.println("b线程执行" + num);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                semaphore.release();
//            }
            num--;
                System.out.println("b线程执行" + num);
        }, "b");

        for (int i = 0; i < 5; i++) {
            a.run();
            b.run();
        }
    }



}
