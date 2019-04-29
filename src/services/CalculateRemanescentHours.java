/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author silva
 */
public class CalculateRemanescentHours {
    private Double totalHours;
    private Double finishedHours;
    private Double remanescentHours;

    public CalculateRemanescentHours(Double totalHours, Double finishedHours) {
        this.totalHours = totalHours;
        this.finishedHours = finishedHours;
    }
    
    public Double calculateHours(){
        Double hours;
        hours = totalHours - finishedHours;
        return hours;
    }
    
    public Double attHours(Double attHours){
        Double hours;
       
        hours = totalHours - (finishedHours + attHours);
        return hours;
    }
}
