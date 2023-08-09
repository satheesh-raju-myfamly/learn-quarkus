package in.myfamly.learn.quarkus;

public class AddResponseDto
{
    long sum;

    public AddResponseDto() {
    }

    public AddResponseDto(long sum) {
        this.sum = sum;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
