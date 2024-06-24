package com.example._2023practice.common.practice;

import java.io.*;

class Superclass implements Serializable {
    private transient int superValue;//since its transient

    public Superclass(int superValue) {
        this.superValue = superValue;
    }

    public int getSuperValue() {
        return superValue;
    }
}

class Subclass extends Superclass {
    private static final long serialVersionUID = -1312825845085965948L;
    private  final int subValue;

    public Subclass(int superValue, int subValue) {
        super(superValue);
        this.subValue = subValue;
    }

    public int getSubValue() {
        return subValue;
    }

}

public class SerializationExample {
    public static void main(String[] args) {
        // Create an object of the subclass
        Subclass obj = new Subclass(10, 20);

        // Serialize the object
        try (FileOutputStream fileOutputStream = new FileOutputStream("data.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (FileInputStream fileInputStream = new FileInputStream("data.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Subclass deserializedObject = (Subclass) objectInputStream.readObject();
            System.out.println("Superclass value: " + deserializedObject.getSuperValue());
            System.out.println("Subclass value: " + deserializedObject.getSubValue());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
