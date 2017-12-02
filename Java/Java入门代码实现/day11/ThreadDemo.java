/*
进程：是一个正在执行中的程序。
		 每一个进程执行都有一个执行顺序。该顺序是一个执行路径，或者叫一个控制单元。
线程：就是进程中一个独立的控制单元。
		  线程在控制着进程的执行。

一个进程中至少有一个线程。

Java VM启动的时候会有一个进程Java.exe.
该进程中至少有一个线程负责Java程序的运行。
而且这个线程运行的代码存在于main方法中。
该线程称之为主线程。

扩展：其实更细节说明虚拟机，jvm启动不止一个线程，还有负责垃圾回收机制的线程（当对象不被使用时，就会被回收）。
当多个程序同时进行时，就构成了多线程。

1.如何在自定义的代码中，自定义一个线程呢？

通过对API的查找，Java已经提供了对线程这类事物的描述，就Thread类。

创建线程的第一种方式：继承Thread类。
步骤：
1.定义类继承Thread。
2.复写Thread类中的run方法。
	目的：将自定义的代码存储在run方法中，让线程运行。

3.调用线程的start方法。
		该方法的两个作用：启动线程，调用run方法。



发现运行结果每一次都不同。
因为多个线程都争夺获取CPU的执行权。CPU执行到谁，谁就运行。
明确一点，在某一个时刻，只能有一个程序在运行（双核除外）。
CPU在做着快速的切换以达到看上去是同时运行的效果。

我们可以形象的把多线程的运行称为在互相抢夺CPU的执行权。

这就是多线程的一个特性：随机性。谁抢到谁执行，至于执行多长时间，CPU决定。

为什么要覆盖run方法呢？
Thread类用于描述线程。
该类就定义了一个功能，用于存储线程要运行的代码，该存储功能就是run方法。

也就是说Thread类中的run方法，用于存储线程要运行的代码。


*/
class Demo extends Thread
{
	public void run()
	{
			for(int x=0;x<60;x++ )
				System.out.println("Demo run--"+x);
	}
}
class ThreadDemo
{
	public static void main(String[] args) 
	{
		//for(int x=0;x<400;x++)
		//System.out.print("Hello World!");

		Demo d=new Demo();//创建好一个对象就相当于创建了一个线程。
		d.start();//开启线程并执行该线程run方法。
		//d.run();仅仅是对象调用方法，而线程 创建了，并没有运行。
		//d.run();如果是这样的话，打印出来就是先打印Demorun，全完了再打印HelloWorld。因为都是在主线程中。
		for(int x=0;x<60;x++)
			 System.out.println("Hello World!--"+x);


		Thread t=new Thread();
		t.start();//Thread中的run方法没有内容。
	}
}
