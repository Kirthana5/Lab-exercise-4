/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertors;

/**
 *
 * @author KIRTHANA
 */
public class distanceconvertor {
        //meter to kilometer
        public double metertokilometer(double val)
        {
            return val/1000;
        }
        
        //miles to kilometer
        public double milestokilometer(double val)
        {
            return val*1.609;
        }
        
        //kilometer to meter
        public double kilometertometer(double val)
        {
            return val*1000; 
        }
        
        //kilometer to miles
        public double kilometertomiles(double val)
        {
            return val/1.609;
        }

    
}
