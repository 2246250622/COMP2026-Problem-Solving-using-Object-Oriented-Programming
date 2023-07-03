public class ABCEmployeeTester {

    public static void main(String[] args) {
        new ABCEmployeeTester().runApp();
    }

    public void runApp(){

    ABCEmployee employtee = new ABCEmployee("", 0, "", "");

        employtee.setName("Susan Meyers");
        employtee.setId(47988);
        employtee.setDept("Accounting");
        employtee.setPosition("Vice President");


        ABCEmployee employtee1 = new ABCEmployee("Mark Jones", 39119);
        employtee1.setDept("IT");
        employtee1.setPosition("Programmer");

        ABCEmployee employtee2 = new ABCEmployee("Joy Rogers",81774,"Manufacturing","Engineer");


        System.out.println(employtee);
        System.out.println(employtee1);
        System.out.println(employtee2);


    }



}
