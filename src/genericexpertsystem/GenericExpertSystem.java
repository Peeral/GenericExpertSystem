/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericexpertsystem;

/**
 *
 * @author Peeral
 */
public class GenericExpertSystem {
    static SensorInfoGUI sig = new SensorInfoGUI();
    static HumanInterferenceGUI hig = new HumanInterferenceGUI();
    static HumanInterferenceGUI2 hig2 = new HumanInterferenceGUI2();
    static EnvironmentalInfluenceGUI eig = new EnvironmentalInfluenceGUI();
    public GenericExpertSystem() {
        new SensorInfoGUI().setVisible(true);
        //sig.setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        GenericExpertSystem ges = new GenericExpertSystem();
        //sig.getFactors();
        //Thread.sleep(30000);
        //System.out.println((sig.getSensorInfo() + hig.getReliability() + hig2.getHumanFactor() + eig.getEnvironmentalInfluence())/4);
    }
    
    public static void printResult () {
        System.out.println((sig.getSensorInfo() + hig.getReliability() + hig2.getHumanFactor() + eig.getEnvironmentalInfluence())/4);
        System.exit(0);
    }
}
