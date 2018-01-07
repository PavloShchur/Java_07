package oop;

public abstract class AbstractBank implements BankInterface {

    public static int requestCount;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
    }

    private String name;
    private String creditDescription;


    @Override
    public void checkInfo() {
        requestCount++;
    }

    @Override
    public void giveCredit() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
