package org.Stepik.Task541;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());

        for (Animal a : animalM2){
            System.out.println(a.getName());
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException {
        Animal[] animals;
        ByteArrayInputStream is = new ByteArrayInputStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(is)){
            int n = ois.readInt();
            animals = new Animal[n];
            for (int i = 0; i < n; i++){
                animals[i] = (Animal)ois.readObject();
            }
        }
        catch (Exception ex){
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }

        return animals;
    }



}