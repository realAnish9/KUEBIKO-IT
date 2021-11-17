package com.kuebikoit.ticTac.reader;

import com.kuebikoit.ticTac.pinter.Printer;

import java.util.Scanner;

public class InputReader implements InputReaderIf {

    Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();

    @Override
    public String read(String message) {

        printer.print(message);
        String input = scanner.nextLine();

        return input;
    }

    @Override
    public Integer readInt(String message) {
        printer.print(message);
        Integer input = scanner.nextInt();
        //scanner.close();
        return input;
    }


}
