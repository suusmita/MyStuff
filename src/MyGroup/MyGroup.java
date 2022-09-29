package MyGroup;

public class MyGroup {

    // Attributter
    private String name;
    private int number;
    private String email;

    private Køn køn;

    // Getter

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public Køn getKøn() {
        return køn;
    }

    // Setter

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setKøn(Køn køn) {
        this.køn = køn;
    }

    // Kontruktør

    public MyGroup(String name, int number, String email, Køn køn) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.køn = køn;

    }


}
