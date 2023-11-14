package GUINov09;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    int gender;
    Program program;
    boolean[] progs;
    int number;

    Student() {
        progs = new boolean[4];
    }

    Student(String str) {
        String[] stuff = str.split(" / ");
        name = stuff[0];
        gender = Integer.parseInt(stuff[1]);
        program = Program.valueOf(stuff[2]);
        progs = new boolean[4];
        number = Integer.parseInt(stuff[4]);
    }

    @Override
    public String toString() {
        return name + " / " + gender + " / " + program + " / " + Arrays.toString(progs) + " / " + number;
    }
}

enum Program {
    BSCS, BSIT,     BSCpE,    BSCE,            BSME,    BSNursing,    BSPharmacy,    BSArchi}
