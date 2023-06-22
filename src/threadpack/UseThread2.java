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
class EvenThread2 implements Runnable
{
   
   
   public void run()
   {
          try
          {
              for(int i=2;i<=10;i+=2)
	      {
                 System.out.println("child thread:"+i);
		 Thread.sleep(500);
	      }
         }
	catch(InterruptedException ex)
	{
		System.out.println("child thread interrupted!");
        }
       System.out.println("child thread finished!");
  }
}
public class UseThread2 {
    
	public static void main(String [] args)
	{
		EvenThread2 obj=new EvenThread2();
                Thread th=new Thread(obj);
		th.start();
		try
          	{
              	for(int i=1;i<=10;i+=2)
	      	{
                 System.out.println("main thread:"+i);
		 Thread.sleep(1000);
	      }
         }
	catch(InterruptedException ex)
	{
		System.out.println("main thread interrupted!");
        }
       System.out.println("main thread finished!");
     }
    
    
}
