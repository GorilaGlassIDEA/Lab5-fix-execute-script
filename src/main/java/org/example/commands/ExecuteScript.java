package org.example.commands;

import org.example.Main;
import org.example.exceptions.IncorrectArgsNumber;
import org.example.interfaces.Readable;
import org.example.iterator.TextIterable;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Main.inv;

/**
 * Команда для выполнения скрипта из файла.
 */
public class ExecuteScript extends Command {
    /**
     * Конструктор класса ExecuteScript.
     */
    private Readable readable;

    public ExecuteScript(Readable readable) {
        super("execute_script", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.", 1);
        this.readable = readable;
    }


    /**
     * Метод для выполнения команды.
     */
    @Override
    public void execute() {
        String content;
        String path;
        //String path - указываешь свой путь, почитай про System.getEnv() и про System.getProperty("user.dir")
        // чтобы ты мог указывать относительный путь
        // TODO: прочитай путь с для
        //  файла с консоли правильно у тебя там аргумент второй в строке как раз и есть путь к файлу

        try {
            content = readable.read(path);
        } catch (IOException e) {
            System.err.println("Не удалось прочитай файл");
        }


        // написал свой Iterator<String>, который читай построчно

        TextIterable textIterable = new TextIterable(content);

        for (String line : textIterable) {
            //TODO доделать обработку строки, по факту ты получаешь строки line в виде:
            // update 1
            // add
            System.out.println(line);
            // для проверки вывода исправь на реализацию!<
        }

    }
}