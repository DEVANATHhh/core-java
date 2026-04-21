public class President {
    String name;
    int age;
    Address  address;


    public President(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void presidentInfo(){
        System.out.println("President name :"+name);
        System.out.println("age :"+age);
        if(address!=null){
            address.addressInfo();
        }

    }


}
