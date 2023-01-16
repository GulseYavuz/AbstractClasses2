public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        CustomerManager customerManager3 = new CustomerManager();

        customerManager.baseDatabaseManager = new MySqlDatbaseManager();
        customerManager2.baseDatabaseManager = new OracleDatabaseManager();
        customerManager3.baseDatabaseManager = new SqlDatabaseManager();


        customerManager.getCustomers();
        customerManager2.getCustomers();
        customerManager3.getCustomers();


    }
}