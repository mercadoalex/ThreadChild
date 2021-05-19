package com.alex;
//Java program to demonstrate that a child thread gets same priority as parent

public class ThreadChild extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        //main thread priority is 6 now
        Thread.currentThread().setPriority(6);
        System.out.println("Main thread : " + Thread.currentThread().getPriority());
        ThreadChild t1 = new ThreadChild();
        //t1 thread is child of main thread
        //so t1 thread will also have priority 6
        System.out.println("t1 thread priority : " + t1.getPriority());

        //if two threads have same priority then we can´´ expect which thread will
        //execute first. First Come First Serve
    }
}
