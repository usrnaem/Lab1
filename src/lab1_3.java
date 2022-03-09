//数据库连接接口：抽象产品Connection
interface Connection{
    public void connection();
}

//Oracle数据库连接类：具体产品OracleConnection
class OracleConnection implements Connection{

    @Override
    public void connection() {
        System.out.println("connecting Oracle");
    }
}

//MySQL数据库连接类：具体产品MySQLConnection
class MySQLConnection implements Connection{
    @Override
    public void connection() {
        System.out.println("connecting MySQL");
    }
}

//数据库语句接口：抽象产品Statement
interface Statement{
    public void Statement();
}

//Oracle数据库语句类：具体产品OracleStatement
class OracleStatement implements Statement{

    @Override
    public void Statement() {
        System.out.println("connected Oracle");
    }
}

//MySQL数据库语句类：具体产品MySQLStatement
class MySQLStatement implements Statement{
    @Override
    public void Statement() {
        System.out.println("connected MySQL");
    }
}

//数据库工厂接口：抽象工厂DBFactory
interface DBFactory{
    public Connection createConnection();
    public Statement createStatement();
}

//Oracle数据库工厂：具体工厂OracleFactory
class OracleFactory implements DBFactory{
    public Connection createConnection(){
        return new OracleConnection();
    }
    public Statement createStatement() {
        return new OracleStatement();
    }
}

//MySQL数据库工厂：具体工厂MySQLFactory
class MySQLFactory implements DBFactory{
    public Connection createConnection(){
        return new MySQLConnection();
    }
    public Statement createStatement() {
        return new MySQLStatement();
    }
}

//客户端测试类
class lab1_3 {
    public static void main(String[] args) {
        try {
            Connection connection;
            Statement statement;
            DBFactory factory;
            factory=(DBFactory) XMLUtilTV.getBean();
            connection=factory.createConnection();
            connection.connection();
            statement=factory.createStatement();
            statement.Statement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
