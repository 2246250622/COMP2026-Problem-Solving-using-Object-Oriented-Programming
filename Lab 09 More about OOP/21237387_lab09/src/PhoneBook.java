public class PhoneBook {
    private Contact[] contact;

    public PhoneBook(){
        this.contact = new Contact[0];

    }

    public void addContact(String name, String phonenum) {
        int save = 0;
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getName().compareTo(name) < 0) {
                save = i+1;
            }
        }
        Contact[] newArray = new Contact[contact.length + 1];
        for (int j = 0; j < save; j++) {
            newArray[j] = contact[j];
        }
        newArray[save] = new Contact(name, phonenum);

        for (int i = save; i < contact.length; i++) {
            newArray[i+1] = contact[i];

        }
        contact=newArray;

    }
    public String getContact(String name) {
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getName() == name) {
                return contact[i].toString();
            }

        }
        return null;
    }
    public void addPhoneToExistingContact(String name, String phonenum) {
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getName() == name) {
                contact[i].addPhoneNo(phonenum);
            }
        }
    }
    public void updateContact(String name, String oldphone, String newphone){
        for(int i =0; i< contact.length;i++){
            if(contact[i].getName() == name && contact[i].getPhoneNos().equals(oldphone)){
                contact[i].addPhoneNo(newphone);
            }
        }
    }

    public void removeContact(String name){

        Contact []newArray = new Contact[contact.length-1];
        int save = 0;
        for(int i=0; i< contact.length;i++){
            if(contact[i].getName().equals(name)){

                 save = i;
            }
        }


        for (int i = 0;i< save; i++){
            newArray[i]=contact[i];
        }

        for(int i = save+1; i < contact.length; i++){
            newArray[i-1]=contact[i];
            }

        contact=newArray;

        }



    @Override
    public String toString() {
        String msg ="";
        for(int i=0; i<contact.length; i++){
            msg += contact[i];
        }
        return msg ;
    }


    public static void main(String[] args) {
        PhoneBook b = new PhoneBook();
        //add contacts
        b.addContact("Chan Tai Man", "96385274");
        System.out.println(b);
        b.addContact("Ma Kin", "65478921");
        System.out.println(b);
        b.addContact("Au Siu Ming", "94562584");
        System.out.println(b);
        b.addContact("Koo Ka Ka", "91122334");
        System.out.println(b);
        //get contacts
        System.out.println(b.getContact("Chan Tai Man"));
        System.out.println(b.getContact("X X X")); //null
        System.out.println();
        //add phone no. to an existing contact
        b.addPhoneToExistingContact("Au Siu Ming", "61234578");
        System.out.println(b.getContact("Au Siu Ming"));
        //update the phone no. in an existing contact
        b.updateContact("Ma Kin", "65478921", "61231231");
        System.out.println(b.getContact("Ma Kin"));
        //remove contacts
        b.removeContact("Ma Kin");
        System.out.println(b);
        b.removeContact("Chan Tai Man");
        System.out.println(b);
        b.removeContact("Au Siu Ming");
        System.out.println(b);
        b.removeContact("Koo Ka Ka");
        System.out.println(b);
    }


}