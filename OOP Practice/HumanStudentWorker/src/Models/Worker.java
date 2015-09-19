package Models;

import java.math.BigDecimal;

public class Worker extends Human {

    private BigDecimal weekSalary;
    private BigDecimal workHoursPerDay;


    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = new BigDecimal(weekSalary);
        this.workHoursPerDay = new BigDecimal(workHoursPerDay);
    }

    public BigDecimal getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(BigDecimal weekSalary) {
        this.weekSalary = weekSalary;
    }

    public BigDecimal getWorkHoursPerWeek() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerWeek(BigDecimal workHoursPerWeek) {
        this.workHoursPerDay = workHoursPerWeek;
    }

    public BigDecimal GetMoneyPerHour(){
       BigDecimal moneyPerHour =
                this.weekSalary.divide(new BigDecimal("5"))
                .divide(workHoursPerDay);
        return moneyPerHour;
    }

    @Override
    public String toString() {
        return String.format(
                "My name is " + this.getFirstName() + " " + this.getLastName() +
                        ". I am a " + Worker.class.getSimpleName()+
                        ". My week salary is " + this.getWeekSalary() + " dollars." +
                        " I work " + this.getWorkHoursPerWeek() + " hours per week" +
                        " and I earn " + this.GetMoneyPerHour().doubleValue() +
                        " dollars per hour."
        );
    }
}
