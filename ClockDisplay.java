/*********************************
 * ClockDisplay class
 * Simphiwe Mchunu
 * 12 August 2016
 *
 *********************************/

public class ClockDisplay
{
   private int pHours;
   private int pMinutes;

   public ClockDisplay(int pHours,int pMinutes)
   {
      this.pHours = pHours;
      this.pMinutes = pMinutes;
   }
   public void setTime(int pHours,int pMinutes)
   {
      this.pHours = pHours;
      this.pMinutes = pMinutes;
   }
   public void tick(){
      if(pMinutes==59){
            pHours++;
            int a = 0;
            pMinutes = 0;
            return;
          }

      else
      {
         pMinutes++;
         return;
      }
      /*else if((pHours==23)&&(pMinutes=59)){
        int n = 0;
        int p = 0;
        String pMinutes = String.valueOf(z+"0");
        String pHours = String.valueOf(z+"0");
        return;
       }
      else{
        pHours++;
        int p = 0;
        String pMinutes = String.valueOf(z+"0");
        return;

        }*/
      }
      //else{
         //pHours++;
         //return;

   public String getDisplayValue()
   {
      if((pMinutes>=1)&&(pHours<=9))
            return("0"+pHours+":"+pMinutes);

        else
            return(pHours+":"+pMinutes);
       }
    }
