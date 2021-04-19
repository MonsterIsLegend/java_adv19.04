package abstractClasses;

public class MySQLConnector extends  DataBaseConnector{
// dziedzicze metodę connect


    private String dbEngine;


    public boolean connect(  String database, String userName, String password){
        super.connect(  database ,userName , password);
        if(isConnected()){
            dbEngine = "MySQL";
            System.out.println("Connected to MySQL Database");
            System.out.println("database "+ database);
            System.out.println("userName "+ userName);
            System.out.println("password "+ password);
        }else{
            dbEngine = null;
        }

        return isConnected();
    }

    @Override
    public void close() {
        if( isConnected()){
           setConnected(false);
           setPassword(null);
           setUserName(null);
           setDatabaseUrl(null);
        }
    }

    @Override
    public void insert(Object o) {
        if(isConnected()){
            for(int i = 0 ; i < records.length ;i++){
                if(DataBaseConnector.records[i] == null){
                    DataBaseConnector.records[i] = o;
                    break;
                }

            }


        }else{
            System.out.println("Connection Error");
        }
    }

    @Override
    public Object[] select() {
        if(isConnected()){
            return DataBaseConnector.records;
        }else{
            System.out.println("Connection Error");
            return null;
        }


    }




}
