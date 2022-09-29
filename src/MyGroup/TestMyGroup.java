package MyGroup;

public class TestMyGroup {
    void run(){

        MyGroup g1 = new MyGroup("Susmita",81655616,"sus@gmail.com",Køn.KVINDE);
        MyGroup g2 = new MyGroup("Bo",7492839,"bo@gmail.com",Køn.MAND);
        MyGroup g3 = new MyGroup("Samantha",2943949,"samantha@gmail.com",Køn.KVINDE);
        System.out.println(g1.getName()+g1.getNumber()+g1.getEmail()+g1.getKøn());
        System.out.println(g1.getName()+g1.getNumber()+g1.getEmail()+g1.getKøn());
        System.out.println(g2.getName()+g2.getNumber()+g2.getEmail()+g2.getKøn());

    }

    public static void main(String[]args){
        new TestMyGroup().run();


    }
}
