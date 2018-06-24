/***************************************
 * JUMPRECORD CLASS
 * SIMPHIWE MCHUNU
 * 13 AUGUST 2016
 *
 **************************************/

public class JumpRecord
   {
   private double distance_1;
   private double distance_2;
   private double distance_3;
   private int jump_no;
   private int foul_no;
   private int increment;
   private int p;
   private int first;
   private int second;
   private int third;


   public JumpRecord(){
      this.distance_1=0;
      this.distance_2=0;
      this.distance_3=0;
      this.jump_no=0;
      this.foul_no=0;
      this.increment=0;
      this.p =3;

    }
   public void recordJump(double distance)
      {
      increment++;
         if(finished()==false ||increment<=3 ){
            if(increment==1)
               distance_1 = distance;
            else if(increment==2)
               distance_2 = distance;
             else
               distance_3 = distance;
          }
       }
     public void recordFoulJump(){
      if(jumps()==1){
         first = jumps();
         }
       else if(jumps()==2){
         second = jumps();
         }
       else{
         third = jumps();
       }
      }


      public int jumps(){
         return jump_no;
       }
     public boolean finished(){
     if(increment==maxJumps()){
      return true;
      }
      else
         return false;
     }
     public int maxJumps(){
      return p;
      }

      public int foulJumps(){
         return foul_no;
       }
      public boolean isFoulJump(int n){
         if(n == first){
           if (distance_1==0){
               return true;
             }
           else{
            return false;
            }
           }

         else if (n==second){
            if(distance_2==0){
               return true;
              }
             else{
               return false;
               }
            }
         else{
            if(distance_3==0)
               {
                  return true;
                }
             else{
               return false;
               }
             }
       }
      public double getJumpDistance(int n){
               if(n==1)
                  return distance_1;
                else if(n==2)
                  return distance_2;
                else if(n==3)
                  return distance_3;
                else
                  return -1;
             }
      public int getLongest(){
         if(distance_1>=distance_2)
            return (int)distance_1;
         else if(distance_1>=distance_3)
            return (int)distance_1;
          else if((distance_2>=distance_1))
            return (int)distance_2;
          else if(distance_2>=distance_3)
            return (int)distance_2;
          else if(distance_3>=distance_1)
            return (int)distance_3;
         else //(distance_3>=distance_2)
            return (int)distance_3;
           }


        }
