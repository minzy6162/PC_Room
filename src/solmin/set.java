package solmin;

import java.util.LinkedHashSet;
import java.util.Set;

//ÁÂ¼® ¼î ¾²·¹µå
class SeatThread extends Thread {
 @Override
 public void run() {
     Set<Integer> randomNumbers = new LinkedHashSet<Integer>();
     for (; randomNumbers.size() < 50;) {
         int x = (int) ((Math.random() * 50));
         randomNumbers.add(x);
     }
     int tmp = 0;
     try {
         for (Integer s : randomNumbers) {
             tmp++;
             if (tmp > 30)
                 Thread.sleep(5*s);
             if (tmp == 50) {
                 Thread.sleep(1000);
                 System.out.println("50¹øÂ°");
             }
             seat50.add(pan[s]);
         }
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}
