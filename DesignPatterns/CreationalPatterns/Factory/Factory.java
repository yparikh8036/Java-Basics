import java.util.Scanner;

abstract class Plan {
    public double rate;

    abstract void gatRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    public void gatRate() {
        rate = 3.5;
    }
}

class CommercialPlan extends Plan {
    public void gatRate() {
        rate = 5.5;
    }
}

class InstitutnalPlan extends Plan {
    public void gatRate() {
        rate = 7.5;
    }
}

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutnalPlan();
        }
        return null;
    }
}

public class Factory {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plan name");

        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Plan plan = getPlanFactory.getPlan(sc.next());
        plan.gatRate();
        plan.calculateBill(1);
    }
}