package com.kuebikoit.ticTac.reader;

import com.kuebikoit.ticTac.printer.Printer;

import java.util.Scanner;

public class InputReader implements InputReaderIf {

    Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();

    @Override
    public String read(String message) {

        printer.print(message);

        return scanner.nextLine();
    }

    @Override
    public Integer readInt(String message) {
        printer.print(message);
        //scanner.close();
        return scanner.nextInt();
    }


}
