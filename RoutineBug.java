    /** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    import java.util.ArrayList;
    
    public class RoutineBug extends DancingBug implements LeaderBug {
   
       private ArrayList<DanceStep> steps;
       private int currentStepIndex;
   
       public RoutineBug(int row, int col, String color) {
           super(row, col, color);
           steps = new ArrayList<>();
           currentStepIndex = 0;
   
       }
   
       public void step() {
           if (steps.isEmpty()) {
               return;
           }
           System.out.println("Here is the RoutineBug: " + this);
           //ArrayList<DanceStep> steps = new ArrayList<DanceStep>();
           //doStep(steps);
           DanceStep nextStep = steps.get(currentStepIndex);
           doStep(nextStep);
           currentStepIndex++;
           if (currentStepIndex >= steps.size()) {
               currentStepIndex = 0;
           }
       }
   
       public void setDanceRoutine(ArrayList<DanceStep> danceRoutine) {
           steps = danceRoutine;
       }
   
       public DanceStep getLastStep() {
           int lastStepIndex = currentStepIndex - 1;
           if (currentStepIndex == 0) {
               lastStepIndex = steps.size() - 1;
           }
           return steps.get(lastStepIndex);
       }
   
   
   }
