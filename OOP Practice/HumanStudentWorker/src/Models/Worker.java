package Models;

import java.math.BigDecimal;

public class Worker extends Human {

    private BigDecimal weekSalary;
    private BigDecimal workHoursPerWeek;


    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = new BigDecimal(weekSalary);
        this.workHoursPerWeek = new BigDecimal(workHoursPerDay);
    }

    public BigDecimal getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(BigDecimal weekSalary) {
        this.weekSalary = weekSalary;
    }

    public BigDecimal getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    public void setWorkHoursPerWeek(BigDecimal workHoursPerWeek) {
        this.workHoursPerWeek = workHoursPerWeek;
    }

    public double MoneyPerHour(){
       BigDecimal moneyPerHour =
                this.weekSalary.divide(new BigDecimal(5))
                .divide(workHoursPerWeek);
        return moneyPerHour.doubleValue();
    }

    @Override
    public String toString() {
        return String.format(
                "I am a " + Worker.class.getName() +
                        " My week salary is " + this.getWeekSalary() +
                        "I work " + this.getWorkHoursPerWeek() + " hours per week" +
                        " and I earn " + this.MoneyPerHour() +
                        " dollars per hour."
        );
    }
}
