

//日志记录器接口：抽象产品Log
interface Log{
    public void writeLog();
}

//文件日志记录器：具体产品FileLog
class FileLog implements Log{

    public void writeLog() {
        System.out.println("wirting FileLog");
    }
}

//数据库日志记录器：具体产品DatabaseLog
class DatabaseLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("wrting DatabaseLog");
    }
}

//日志记录器工厂接口：抽象工厂LogFactory
interface LogFactory{
    public Log createLog();
}

//文件日志记录器工厂类：具体工厂FileLogFactory
class FileLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        System.out.println("create FileLog");
        return new FileLog();
    }
}

//数据库日志记录器工厂类：具体工厂DatabaseLogFactory
class DatabaseLogFactory implements LogFactory{
    @Override
    public  Log createLog() {
        System.out.println("create DatabaseLog");
        return new DatabaseLog();
    }
}

//客户端测试类
class lab1_2
{
    public static void main(String args[])
    {
        try {
            LogFactory factory;
            Log log;
            factory = (LogFactory) XMLUtilLog.getBean();
            log = factory.createLog();
            log.writeLog();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

