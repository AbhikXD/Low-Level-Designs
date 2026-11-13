package Patterns.Singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new ThreadABC());
        Thread b = new Thread(new ThreadBAC());
        a.start();
        b.start();
    }

    static class ThreadABC implements Runnable {
        public void run() {
            Database db = Database.getInstance("Oracle");
            db.getQueryResult("Select QUERY");
        }
    }

    static class ThreadBAC implements Runnable {
        public void run() {
            Database db = Database.getInstance("SSMS");
            db.getQueryResult("Select QUERY");
        }
    }
}

