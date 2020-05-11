package com.skillsup;

public class Main {

    public static void main(String[] args) {

        var a1 = new Auto();
        a1.Start();
        a1.Drive();
        a1.Speed(15);
        a1.Stop();
        var a2 = new Auto();
        var a3 = new Auto();
    }

}

class Auto {
    Auto() {
        n = n + 1;
        System.out.println(n);
    }

    public void Start() {
        System.out.println("Start");
    }

    public void Drive() {
        System.out.println("Drive");
    }

    public void Stop() {
        System.out.println("Stop");
    }

    private int Speed;

    public void Speed(int s1) {
        this.Speed = s1;
        System.out.println("Speed" + " " + s1);
    }

    private static int n;
}