package Patterns.Singleton;

import javax.xml.crypto.Data;

public class Database {
    private static volatile Database obj;

    private Database(String DBID){
        obj = new Database(DBID);
    }
    public void getQueryResult(String sql){
        System.out.println("Query Result is Fetched");
    }

    public static Database getInstance(String dbId){
        if(obj!= null){
            return obj;
        }
        synchronized(Database.class){
            if(obj == null){
                obj = new Database(dbId);
            }
            return obj;
        }
    }
}
