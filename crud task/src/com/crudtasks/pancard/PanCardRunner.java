package src.com.crudtasks.pancard;

public class PanCardRunner {
    public static void main(String[] args)
    {
        PanCardDetails[] panCardDetails=new PanCardDetails[3];
        PanCardFunction panFunction=new PanCardFunction(panCardDetails);

        PanCardDetails p1=new PanCardDetails("sai","ABCDE1234F","2002","blr","ram");
        panFunction.store(p1);

        PanCardDetails p2=new PanCardDetails("krishna","PQRSX5678K","2001","mys","shyam");
        panFunction.store(p2);

        PanCardDetails p3=new PanCardDetails("rahul","LMNOP4321Z","2000","hyd","mohan");
        panFunction.store(p3);

        panFunction.search("krishna");

        panFunction.update("sai","bangalore");
    }
}
