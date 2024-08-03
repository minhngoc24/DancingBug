/** NAME: MINH NGOC LE
     *  CLASS: COMP 142 (Section 2)
     *  Description: Create a graphical animation of a ladybug dance party
     */
    package project5;

    public class ImitationBug extends DancingBug {
        private LeaderBug leaderBug;
    
       public ImitationBug(int row, int col, LeaderBug leaderBug) {
           super(row, col, "purple");
           this.leaderBug = leaderBug;
       }
   
       public void step() {
           DanceStep step = leaderBug.getLastStep();
           doStep(step);
       }
   }
