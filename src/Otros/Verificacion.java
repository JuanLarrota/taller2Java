package Otros;

import java.util.Scanner;

public class Verificacion {

    public boolean sonN_N_P(int num) {
        String num2 = num + "";
        if (num2.matches("-?\\d+(\\.\\d+)?")) {
            return true;
        }
        return false;
    }
}
