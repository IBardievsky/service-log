package org.example.servicelog;

public class ShuffleRequest {
    private int number;

    public ShuffleRequest() {
    }

    public ShuffleRequest(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ShuffleRequest{number=" + number + "}";
    }
}