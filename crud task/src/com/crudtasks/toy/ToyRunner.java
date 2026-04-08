package src.com.crudtasks.toy;
public class ToyRunner
{
    public static void main(String[] args)
    {
        ToyDetails[] toyDetails=new ToyDetails[3];
        ToyFunction toyFunction=new ToyFunction(toyDetails);

        String[] materials={"metal","alloy","plastic"};

        ToyDetails toyDetail1=new ToyDetails("rubyscube",materials,300.0,false,2024);
        toyFunction.store(toyDetail1);

        ToyDetails toyDetail2=new ToyDetails("transformer",materials,3000.0,false,2020);
        toyFunction.store(toyDetail2);

        ToyDetails toyDetail3=new ToyDetails("train",materials,900.0,true,2025);
        toyFunction.store(toyDetail3);


        //search
        toyFunction.search("train");

        toyFunction.update("transformer",5000);
    }

}
