package com.krt.test01;

/**
 * lambda推导
 */
public class LambdaTest {

    public static void main(String[] args) {
        ILike iLike = new Like();
        //iLike.lambda();

        iLike=()->{
            System.out.println("4444");
        };
        iLike.lambda();


    }
}

interface ILike{
    void lambda();
}

class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}