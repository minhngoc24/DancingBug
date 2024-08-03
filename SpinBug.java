    /** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    public class SpinBug extends DancingBug implements LeaderBug{
        private int locationRow, locationCol;
        private Direction directionFacing;
       private String color;
   
       public SpinBug(int row, int col){
           super(row, col, "yellow");
           //color = "yellow";
       }
       public void step(){
           System.out.println("Here is the SpinBug: " + this);
           doStep(DanceStep.TURN_RIGHT);
       }
       public DanceStep getLastStep(){
           return DanceStep.TURN_RIGHT;
       }
   
   
   }
