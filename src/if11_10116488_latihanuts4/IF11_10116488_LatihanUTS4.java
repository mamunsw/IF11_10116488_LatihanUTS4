/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116488_latihanuts4;

/**
 *
 * @author MSW98
 */
public class IF11_10116488_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner mDes= new ModelDesigner();
        mDes.bonusDesigner();
        
        ModelProgrammer mProg= new ModelProgrammer();
        mProg.bonusProgrammer();
        
        ModelAnalyst mAna= new ModelAnalyst();
        mAna.bonusAnalyst();
    }
    
}
