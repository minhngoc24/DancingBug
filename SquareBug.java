 /** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    import java.util.ArrayList;
    
    public class SquareBug extends RoutineBug{
       //private int size;
       public SquareBug(int row, int col, int size){
           super(row,col, "orange");
           ArrayList<DanceStep>steps = buildDanceRoutine(size);
           setDanceRoutine(steps);
       }
       public ArrayList<DanceStep> buildDanceRoutine(int size){
           ArrayList<DanceStep>steps = new ArrayList<DanceStep>();
           for(int j = 0; j <= 3; j++){
               for(int i = 0; i <= size - 1; i++) {
                   steps.add(DanceStep.FORWARD);
               }
               steps.add(DanceStep.TURN_RIGHT);
           }
           return steps;
       }
   
   
   
   
   }
