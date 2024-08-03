    /** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    // PUT YOUR HEADER HERE
    
    import java.util.ArrayList;
   import java.util.Scanner;
   
   public class DanceTester {
       public static void main(String[] args) {
           //MAIN
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the test you want: ");
           String choice = scanner.nextLine();
           if(choice.equals("SpinBug")){
               testSpinBug();
           }else if(choice.equals("RoutineBug")){
               testRoutineBug();
           }else if(choice.equals("SquareBug")){
               testSquareBug();
           }else if(choice.equals("ImitationBug imitating SpinBug")){
               testImitationBug();
           }else if(choice.equals("ImitationBug imitating RoutineBug")){
               testImitationBug2();
           }else if(choice.equals("MirrorBug")){
               testMirrorBug();
           }else if(choice.equals("CongaBug")){
               testCongaBug2();
           }
   
           //testBoredBug(); // click the canvas when it appears to start the bug dancing!
           //testSpinBug();
           //testRoutineBug();
           //testSquareBug();
           //testImitationBug();
           //testImitationBug2();
           //testMirrorBug();
           //testCongaBug();
           //testCongaBug2();
       }
   
       public static void testBoredBug() {
           DanceFloor floor = new DanceFloor(3, 5);
           BoredBug boredbug = new BoredBug(1, 2);
           floor.addDancer(boredbug);
           floor.everyoneDance();
       }
       public static void testSpinBug(){
           DanceFloor floor = new DanceFloor(3, 5);
           SpinBug spinBug = new SpinBug(1, 2);
           floor.addDancer(spinBug);
           floor.everyoneDance();
       }
   
       public static void testRoutineBug(){
           ArrayList<DanceStep>steps = new ArrayList<DanceStep>();
           steps.add(DanceStep.STEP_RIGHT);
           steps.add(DanceStep.STEP_RIGHT);
           steps.add(DanceStep.STEP_RIGHT);
           steps.add(DanceStep.PAUSE);
           steps.add(DanceStep.STEP_LEFT);
           steps.add(DanceStep.STEP_LEFT);
           steps.add(DanceStep.STEP_LEFT);
           steps.add(DanceStep.PAUSE);
           steps.add(DanceStep.BACKWARD);
           steps.add(DanceStep.BACKWARD);
           steps.add(DanceStep.BACKWARD);
           steps.add(DanceStep.PAUSE);
           steps.add(DanceStep.FORWARD);
           steps.add(DanceStep.FORWARD);
           steps.add(DanceStep.FORWARD);
           steps.add(DanceStep.TURN_LEFT);
   
   
   
           DanceFloor floor = new DanceFloor(10, 15);
           RoutineBug routineBug = new RoutineBug(5, 7, "red");
           routineBug.setDanceRoutine(steps);
           floor.addDancer(routineBug);
           floor.everyoneDance();
   
       }
       public static void testSquareBug() {
   
   
           DanceFloor floor = new DanceFloor(10, 15);
           SquareBug squareBug = new SquareBug(5, 7, 4);
           floor.addDancer(squareBug);
           floor.everyoneDance();
       }
       public static void testImitationBug() {
   
   
           DanceFloor floor = new DanceFloor(10, 15);
           SpinBug spinBug = new SpinBug(5, 7);
           floor.addDancer(spinBug);
          ImitationBug imitationBug = new ImitationBug(3, 4, spinBug);
          floor.addDancer(imitationBug);
          floor.everyoneDance();
  
      }
      public static void testImitationBug2() {
          ArrayList<DanceStep>steps = new ArrayList<DanceStep>();
          steps.add(DanceStep.STEP_RIGHT);
          steps.add(DanceStep.STEP_RIGHT);
          steps.add(DanceStep.STEP_RIGHT);
          steps.add(DanceStep.PAUSE);
          steps.add(DanceStep.STEP_LEFT);
          steps.add(DanceStep.STEP_LEFT);
          steps.add(DanceStep.STEP_LEFT);
          steps.add(DanceStep.PAUSE);
          steps.add(DanceStep.BACKWARD);
          steps.add(DanceStep.BACKWARD);
          steps.add(DanceStep.BACKWARD);
          steps.add(DanceStep.PAUSE);
          steps.add(DanceStep.FORWARD);
          steps.add(DanceStep.FORWARD);
          steps.add(DanceStep.FORWARD);
          steps.add(DanceStep.TURN_LEFT);
  
  
          DanceFloor floor = new DanceFloor(30, 45);
          RoutineBug routineBug = new RoutineBug(12, 15, "red");
          routineBug.setDanceRoutine(steps);
          floor.addDancer(routineBug);
  
          ImitationBug imitationBug = new ImitationBug(15,13, routineBug);
          ImitationBug imitationBug2 = new ImitationBug(15,14, routineBug);
          ImitationBug imitationBug3 = new ImitationBug(15,15, routineBug);
          ImitationBug imitationBug4 = new ImitationBug(15,16, routineBug);
          ImitationBug imitationBug5 = new ImitationBug(15,17, routineBug);
  
          ImitationBug imitationBug6 = new ImitationBug(16,13, routineBug);
          ImitationBug imitationBug7 = new ImitationBug(16,14, routineBug);
          ImitationBug imitationBug8 = new ImitationBug(16,15, routineBug);
          ImitationBug imitationBug9 = new ImitationBug(16,16, routineBug);
          ImitationBug imitationBug10 = new ImitationBug(16,17, routineBug);
  
          ImitationBug imitationBug11 = new ImitationBug(17,13, routineBug);
          ImitationBug imitationBug12 = new ImitationBug(17,14, routineBug);
          ImitationBug imitationBug13 = new ImitationBug(17,15, routineBug);
          ImitationBug imitationBug14 = new ImitationBug(17,16, routineBug);
          ImitationBug imitationBug15 = new ImitationBug(17,17, routineBug);
  
  
          floor.addDancer(imitationBug);
          floor.addDancer(imitationBug2);
          floor.addDancer(imitationBug3);
          floor.addDancer(imitationBug4);
          floor.addDancer(imitationBug5);
          floor.addDancer(imitationBug6);
          floor.addDancer(imitationBug7);
          floor.addDancer(imitationBug8);
          floor.addDancer(imitationBug9);
          floor.addDancer(imitationBug10);
          floor.addDancer(imitationBug11);
          floor.addDancer(imitationBug12);
          floor.addDancer(imitationBug13);
          floor.addDancer(imitationBug14);
          floor.addDancer(imitationBug15);
  
          floor.everyoneDance();
  
  
      }
      public static void testMirrorBug(){
          DanceFloor floor = new DanceFloor(30, 35);
          SquareBug squareBug = new SquareBug(5, 7, 4);
          floor.addDancer(squareBug);
          MirrorBug mirrorBug = new MirrorBug(5, 20, squareBug);
          floor.addDancer(mirrorBug);
          floor.everyoneDance();
      }
      public static void testCongaBug(){
          DanceFloor floor = new DanceFloor(30, 35);
          SquareBug squareBug = new SquareBug(5, 7, 4);
          floor.addDancer(squareBug);
          CongaBug congaBug = new CongaBug(6, 7, squareBug);
          floor.addDancer(congaBug);
          floor.everyoneDance();
      }
      public static void testCongaBug2(){
          DanceFloor floor = new DanceFloor(30, 35);
          SquareBug squareBug = new SquareBug(10, 7, 8);
          floor.addDancer(squareBug);
          CongaBug congaBug = new CongaBug(11, 7, squareBug);
          CongaBug congaBug2 = new CongaBug(12, 7, congaBug);
          floor.addDancer(congaBug);
          floor.addDancer(congaBug2);
          floor.everyoneDance();
  
      }
  }
