package main;

public class Bankomat {
    private int saldo;
    String text = "Stan konta";


    public void wplataP(int wplata)
    {
        if(wplata > 0) {
            saldo = saldo + wplata;
        }
    }

    public void wyplataP(int wyplata)
    {
        if(wyplata <= saldo) {
            saldo = saldo - wyplata;
        }
        else
        {
            System.out.println("No money no honey");
        }
    }
    public int message(String  text) {

        System.out.println(text + saldo);
        return saldo;
    }
}
