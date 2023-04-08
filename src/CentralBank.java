public class CentralBank {
    void leasingRate(){
        System.out.println("30% Below");
    }
}
class CommercialBank extends CentralBank{
    void housingLoanRate(){
        System.out.println("25%");
    }
    void leasingRate(){
        System.out.println("25%");
    }
}
class CommercialLeasing extends CommercialBank{
    void leasingRate(){
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{
    void housingLoanRate(){
        System.out.println("20%");
    }
    void leasingRate(){
        System.out.println("22%");
    }
}
class RateResult{
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cc = new CommercialCredit();
        CentralBank cl = new CommercialLeasing();
        c.leasingRate();
        cb.leasingRate();
        cc.leasingRate();
        cl.leasingRate();
        CommercialBank cbl,ccl;
        cbl = new CommercialBank();
        ccl = new CommercialCredit();
        cbl.housingLoanRate();
        ccl.housingLoanRate();
    }
}