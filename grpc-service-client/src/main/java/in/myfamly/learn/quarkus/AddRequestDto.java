package in.myfamly.learn.quarkus;

public class AddRequestDto
{
    long number1;
    long number2;

    public AddRequestDto() {
    }

    public AddRequestDto(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public long getNumber1() {
        return number1;
    }

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }
}
