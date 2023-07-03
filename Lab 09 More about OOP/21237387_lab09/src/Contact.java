public class Contact {
    private String name;
    private String[] phonenum;
    private String phone;


    public Contact(String name){
        this.name = name;
        this.phonenum = new String[0];
    }

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.phonenum = new String[]{phone};

    }

    public String getName() {
        return name;
    }
    public String[] getPhoneNos() {
        return phonenum;
    }

public void addPhoneNo(String c1){
    String[] newArray = new String[this.phonenum.length+1];
    for(int i = 0; i< this.phonenum.length; i++){
        newArray[i] = this.phonenum[i];
    }
    newArray[this.phonenum.length] = c1;
    this.phonenum = newArray;
}

    public void deletePhoneNo(String c1) {
        int result = 0;
        String[] newArray = new String[this.phonenum.length-1];
    for (int i =0; i < this.phonenum.length; i++){
        if(phonenum[i] == c1){
            result = i;
        }
    }
        for (int i =0; i < result; i++){
            newArray[i]=this.phonenum[i];
        }
        for (int i =result+1; i < this.phonenum.length; i++){
            newArray[i-1]=this.phonenum[i];
        }
        this.phonenum = newArray;
    }

    @Override
    public String toString() {
        String msg ="";
        for(int i=0; i<this.phonenum.length; i++){
            msg += "["+i+"]"+phonenum[i]+"\n";
        }
        return "Name: "+getName()+"\n"+"Phone number(s):\n"+msg ;
    }


    public static void main(String[] args){
        Contact c1 = new Contact("Chan Tai Man", "91234567");
        System.out.println(c1);
        c1.addPhoneNo("97654321");
        System.out.println(c1);
        String [] p = c1.getPhoneNos();
        for(int i = 0; i < p.length; i++){
            System.out.println(p[i]);
        }
        c1.deletePhoneNo("91234567");
        System.out.println(c1);
        Contact c2 = new Contact("Luk Mei Mei");
        System.out.println(c2);
    }
}
