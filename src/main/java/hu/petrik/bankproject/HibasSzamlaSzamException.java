package hu.petrik.bankproject;

public class HibasSzamlaSzamException extends RuntimeException {
    public HibasSzamlaSzamException(String szamlaszam) {
        super("Hibás számlaszám: " + szamlaszam);
    }
}
