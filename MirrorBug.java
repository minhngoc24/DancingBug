    /** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;
    
    public class MirrorBug extends DancingBug {
        private LeaderBug leaderBug;
    
       public MirrorBug(int row, int col, LeaderBug leaderBug) {
           super(row, col, "blue");
           this.leaderBug = leaderBug;
       }
   
       public void step() {
           DanceStep step = leaderBug.getLastStep();
           if (step == DanceStep.STEP_RIGHT) {
               doStep(DanceStep.STEP_LEFT);
           } else if (step == DanceStep.STEP_LEFT) {
               doStep(DanceStep.STEP_RIGHT);
           } else if (step == DanceStep.TURN_RIGHT) {
               doStep(DanceStep.TURN_LEFT);
           } else if (step == DanceStep.TURN_LEFT) {
               doStep(DanceStep.TURN_RIGHT);
           } else {
               doStep(step);
           }
       }
   
   }
