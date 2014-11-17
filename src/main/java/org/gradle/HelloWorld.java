package org.gradle;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        setPort(5000);
        get("/", (req, res) -> "Hello World!");
    }
}
