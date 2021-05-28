package ex9;

public class DOBException extends Exception{
    public DOBException(){
        super("invalid date of birth,Student should older or at least 15 years olds");
    }


}
