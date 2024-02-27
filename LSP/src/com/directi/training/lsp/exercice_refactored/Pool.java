package com.directi.training.lsp.exercice_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        donaldDuck.quack();
        donaldDuck.swim();
    }


    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
