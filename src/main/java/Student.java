public class Student {
    private String email;
    private String name;
    private Float lab1;
    private Float lab2;
    private Float lab3;
    private Float avg;

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLab1() {
        return lab1;
    }

    public void setLab1(Float lab1) {
        this.lab1 = lab1;
    }

    public Float getLab2() {
        return lab2;
    }

    public void setLab2(Float lab2) {
        this.lab2 = lab2;
    }

    public Float getLab3() {
        return lab3;
    }

    public void setLab3(Float lab3) {
        this.lab3 = lab3;
    }
}
