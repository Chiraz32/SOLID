package com.directi.training.lsp.exercice_refactored;

public class ElectronicDuckPool
{
    public void run()
    {
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.quack();
        electricDuck.swim();

    }



    public static void main(String[] args)
    {
        ElectronicDuckPool pool = new ElectronicDuckPool();
        pool.run();
    }
}
