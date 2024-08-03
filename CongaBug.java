/** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    import java.util.ArrayList;
    
    public class CongaBug extends DancingBug implements LeaderBug{
       private LeaderBug leaderBug;
       private DanceStep delayStep = DanceStep.FORWARD;
       private DanceStep currentStep;
   
       public CongaBug(int row, int col, LeaderBug leaderBug) {
           super(row, col, "green");
           this.leaderBug = leaderBug;
       }
   
       public void step() {
           currentStep = delayStep;
           doStep(currentStep);
           delayStep = leaderBug.getLastStep();
       }
       public DanceStep getLastStep(){
           return currentStep;
   
       }
   
   
   
   
   }
