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
class EvenThread3 implements Runnable
{
    Thread th;
    public EvenThread3(String name)
   {
      th=new Thread(this,name);
      th.start();
   }
   
   public void run()
   {
          try
          {
              for(int i=2;i<=10;i+=2)
	      {
                 System.out.println(th.getName()+":"+i);
		 Thread.sleep(500);
	      }
         }
	catch(InterruptedException ex)
	{
		System.out.println(th.getName()+" interrupted!");
        }
       System.out.println(th.getName()+" finished!");
  }
}
public class UseThread3 {
    	public static void main(String [] args)
	{
		EvenThread3 obj1=new EvenThread3("child thread 1");
                EvenThread3 obj2=new EvenThread3("child thread 2");
                EvenThread3 obj3=new EvenThread3("child thread 3");
                
		try
          	{
              	    obj1.th.join();
	            obj2.th.join();
                    obj3.th.join();
		    System.out.println("All child dead");
                 }
	catch(InterruptedException ex)
	{
		System.out.println("main thread interrupted!");
        }
       System.out.println("main thread finished!");
     }
    
}
