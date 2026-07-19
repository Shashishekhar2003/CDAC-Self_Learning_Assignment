package com.demo;

class Q25ThreadLocal {

    static ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {

        Runnable task = () -> {
            local.set((int)(Math.random() * 100));
            System.out.println(Thread.currentThread().getName() +
                    " value: " + local.get());
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}