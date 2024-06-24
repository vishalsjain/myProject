package com.example._2023practice.common.practice;

public class MySingleton {
    private static MySingleton instance;

    MySingleton() {
        System.out.println("Singleton");

        // Private constructor to prevent external instantiation
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}

/*public class SubclassOfSingleton extends MySingleton {
    // Attempting to create an instance of the parent class
    public SubclassOfSingleton() {
        // This line would result in a compilation error because the parent constructor is private
         super();
    }
}*/
