package com.gcit.training;
class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
  

class Child extends Parent {
    void show()
    {
        System.out.println("Child's show()");
    }
}
  
class MethodOverriding{
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.show();
  
        Parent obj2 = new Child();
        obj2.show();
    }
}