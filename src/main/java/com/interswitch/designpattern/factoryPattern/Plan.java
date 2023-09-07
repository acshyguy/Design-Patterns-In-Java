package com.interswitch.designpattern.factoryPattern;

abstract class Plan {
    protected double rate;
    abstract  void getRate();

    public void calculateBill(int units){
        System.out.println(units * rate);
    }
}
//Class that extends Plan abstract class
class DomesticPlan extends Plan{
    public void getRate(){
        rate = 3.50;
    }
}
class CommercialPlan extends Plan{
    public void getRate(){
        rate = 7.50;
    }
}
class InstitutionalPlan extends Plan{
    public void getRate(){
        rate = 5.50;
    }
}
class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null){
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
