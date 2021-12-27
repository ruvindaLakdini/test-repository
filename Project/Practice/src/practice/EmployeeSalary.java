/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Ruvinda Lakdini
 */
public class EmployeeSalary {
    
    static BigDecimal total_monthly_salary;
    static BigDecimal salary_per_annum;
    static BigDecimal working_days_per_month;
    static BigDecimal months_per_year;
    static BigDecimal salary_per_day;
            
    public static void main(String[] args) {
        
        months_per_year = BigDecimal.valueOf(12);
        working_days_per_month = BigDecimal.valueOf(20);
        
        double basic_salary = 59900.50;
        double allowance = 5000;
        double etf = basic_salary * 0.12;
        double epf = basic_salary * 0.08;    
        
        
        BigDecimal _basic_salary = BigDecimal.valueOf(basic_salary);
        BigDecimal _allowance = BigDecimal.valueOf(allowance);
        BigDecimal _etf = BigDecimal.valueOf(etf);
        BigDecimal _epf = BigDecimal.valueOf(epf);
        
        
       
        total_monthly_salary = _basic_salary.add(_allowance).subtract(_epf).subtract(_etf);
        
        salary_per_annum = total_monthly_salary.multiply(months_per_year);
        
        salary_per_day = total_monthly_salary.divide(working_days_per_month);
        
        
                
        
        System.out.println("Total salary per month : " + total_monthly_salary.round(MathContext.DECIMAL32));
        
        System.out.println("Total salary per annum : " + salary_per_annum.round(MathContext.DECIMAL32));
        
        System.out.println("Average salary per day : " + salary_per_day.round(MathContext.DECIMAL32));        
       
    }
    
}
