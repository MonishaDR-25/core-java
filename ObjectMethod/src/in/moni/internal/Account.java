package in.moni.internal;

public class Account {
    private String name;
    private int acc_no;
    public Account(String name, int acc_no){
        this.name=name;
        this.acc_no=acc_no;
    }
    @Override
    public String toString(){

        return "Account name:" + name + ", acc_no:" + acc_no ;
    }
    }
    //public void access() {

        //System.out.println("Accessing account");
   // }
//}

