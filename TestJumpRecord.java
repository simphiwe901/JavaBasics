/************************************
 * TESTJUMPRECORD CLASS
 * SIMPHIWE MCHUNU
 * 10 AUGUST 2016
 *
 *************************************/

public class TestJumpRecord{
   public static void main (String [] args){

   JumpRecord jumprecord1 = new JumpRecord();

   //this test checks true for constructor for in
   System.out.println("Test 1");
   if (jumprecord1.maxJumps() == 3
       && jumprecord1.foulJumps() == 0
       && jumprecord1.jumps() == 0 ){
       System.out.println("Pass");}
   else
       System.out.println("Fail");

   System.out.println("Test 2");
   jumprecord1.recordJump(2.1);
   if (jumprecord1.jumps() == 1 && jumprecord1.getJumpDistance(1) == 2.1 && jumprecord1.foulJumps() == 0){
      if(jumprecord1.finished() == false&& jumprecord1.isFoulJump(1) == false&& jumprecord1.getLongest() == 1  )
       {System.out.println("Pass");}
       }

   else{
       System.out.println("Fail");}
   JumpRecord jumprecord2 = new JumpRecord();
   System.out.println("Test 3");
   jumprecord2.recordFoulJump();
   if (jumprecord2.jumps() == 1
       && jumprecord2.getJumpDistance(1) == 0
       && jumprecord2.foulJumps() == 1
       && jumprecord2.finished() == false
       && jumprecord2.isFoulJump(1) == true  )
       {System.out.println("Pass");}

   else
       System.out.println("Fail");
   System.out.println("Test 4");
   jumprecord2.recordJump(3.1);
   if (jumprecord2.jumps() == 2 && jumprecord2.getJumpDistance(1) == 0 && jumprecord2.getJumpDistance(2) == 3.1&& jumprecord2.foulJumps() == 1){
       if(jumprecord2.finished() == false && jumprecord2.isFoulJump(1) == true&& jumprecord2.isFoulJump(2) == false&& jumprecord2.getLongest() == 2 )
       {System.out.println("Pass");}
      }

   else
       {System.out.println("Fail");}
   JumpRecord jumprecord3 = new JumpRecord();
   System.out.println("Test 5");
   jumprecord3.recordJump(4.1);
   jumprecord3.recordJump(5.1);
   jumprecord3.recordJump(6.1);
   if (jumprecord3.jumps() == 3 && jumprecord3.getJumpDistance(1) == 4.1 && jumprecord3.getJumpDistance(2) == 5.1&& jumprecord3.getJumpDistance(3) == 6.1&& jumprecord3.foulJumps() == 0){
       if(jumprecord3.finished() == true&& jumprecord3.isFoulJump(1) == false&& jumprecord3.isFoulJump(2) == false&& jumprecord3.isFoulJump(3) == false&& jumprecord3.getLongest() == 3 ){
       System.out.println("Pass");}
       }

   else{
       System.out.println("Fail");}

   // checks and returns the longest disatnce for n number of trials
   JumpRecord recordjump4 = new JumpRecord();
   recordjump4.recordJump(7.1);
   int number = recordjump4.getLongest();

 }
 }
