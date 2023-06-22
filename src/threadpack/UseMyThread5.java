 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpack;

/**
 *
 * @author LENOVO
 */
class MyThread extends Thread
{
	long  count;
        boolean stop;
        public MyThread(String name,int p)
	{
	  super(name);
          super.setPriority(p);
          stop=false;
       }
       public void run()
       {
                while(true)
                {
                      ++count;
                      if(stop==true)
                           break;
                 }
       }
}
public class UseMyThread5 {
    	public static void main(String [] args)
	{
		Thread th=Thread.currentThread();
                th.setPriority(Thread.MAX_PRIORITY);
                MyThread m1=new MyThread("hi thread",Thread.NORM_PRIORITY+3);
                MyThread m2=new MyThread("low thread",Thread.NORM_PRIORITY-3);
                try
                {
                 m1.start();
                 m2.start();
                 m1.join(2000);  
                 m1.stop=true;
                 m2.stop=true;
                                
                 System.out.println("hi thread count:"+m1.count);
                 System.out.println("low thread count:"+m2.count);
        }
        catch(InterruptedException ex)
        {
         System.out.println("main interrupted!");
        }
    }
    
}
