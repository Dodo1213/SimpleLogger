/*
 *
 *  * Class created by Nasty / Ron S.
 *  * 07.01.21, 01:08
 *
 */

package de.nasty.main.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static void send(Types type, String message) {
        String mainPrefix = "[HUE-BOT]";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String date = dateTimeFormatter.format(LocalDateTime.now());

        if(type == Types.WARNING) {
            String text = "[" + date + "] " + mainPrefix + RESET +" [" + YELLOW + "WARNING" + RESET + "]: " + message;
            System.out.println(text);
        } else if(type == Types.INFO) {
            String text = "[" + date + "] " + mainPrefix + RESET +" [" + BLUE + "INFO" + RESET + "]:" + message;
            System.out.println(text);
        } else if(type == Types.ERROR) {
            String text = "[" + date + "] " + mainPrefix + RESET +" [" + RED + "ERROR" + RESET + "]: " + message;
            System.out.println(text);
        } else if(type == Types.SUCCESS) {
            String text = "[" + date + "] " + mainPrefix + RESET +" [" + GREEN + "SUCCESS" + RESET + "]: " + message;
            System.out.println(text);
        }
    }
}
