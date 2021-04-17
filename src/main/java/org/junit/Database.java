package org.junit;

import java.util.concurrent.TimeUnit;

public class Database {

    public void connect() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (Exception e) {

        }
    }

    public void disconnect() {

    }
}