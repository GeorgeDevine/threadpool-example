/**
 * This class simulates a task that a thread must complete
 * 
 * @author George Devine
 * @version 13/10/2015
 */

public class Job implements Runnable
{
  private int jobNumber;
  Job (int jobNumber)
  {
    this.jobNumber = jobNumber;
  }
  public void run()
  {
    System.out.println("Job: " + jobNumber + " is being processed by thread : " + Thread.currentThread().getName());
      try
      {
        Thread.sleep((int) (1000));
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Job: " + jobNumber + " is ending in thread : " + Thread.currentThread().getName());
    }
}
