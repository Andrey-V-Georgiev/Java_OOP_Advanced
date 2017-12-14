package _14_DependencyInversionEX.src.io;


import _14_DependencyInversionEX.src.contracts.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader implements InputReader {
    private BufferedReader reader;

    public ConsoleInputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String readLine() {
        String line = null;
        try {
            line = this.reader.readLine();
        } catch (IOException ignored) {
        }
        return line;
    }
}
