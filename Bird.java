/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;


public class Bird implements Engine
{
    private int totalSpeed;
    private int totalAlimeter;
    private int totalMinutesInAir; 
            
    @Override
    public int SetAirSpeed(int airSpeedMPH)
    {
        
        totalSpeed = airSpeedMPH * (totalMinutesInAir/60);
        return totalSpeed;
    }
    
    @Override 
    public int SetAlimeter(int elevationPerMinute)
    {
        totalAlimeter = elevationPerMinute * totalMinutesInAir;
        return totalAlimeter;
    }
    
    @Override 
    public int Fly()
    {
        totalMinutesInAir++; 
        return totalMinutesInAir;
    }
}
