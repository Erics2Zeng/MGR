/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/access_gate?useSSL=false&serverTimezone=UTC";
    public static final String PROJECT_PATH = System.getProperty("user.dir")+"/";//项目在硬盘上的基础路径
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "864463611";
    public static final String JDBC_DIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";

    public static  String CODE_BASE_PACKAGE = "com.tongjie.accessgate";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）
    //引用公共类需要路径
    public static  String BASE_PACKAGE = "com.tongjie";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）

    public static final String MODEL_PACKAGE = CODE_BASE_PACKAGE + ".model";//生成的Model所在包
    public static final String MAPPER_PACKAGE = CODE_BASE_PACKAGE + ".mapper";//生成的Mapper所在包
    public static final String SERVICE_PACKAGE = CODE_BASE_PACKAGE + ".service";//生成的Service所在包
    public static final String COMMON_ENTITY_PACKAGE = CODE_BASE_PACKAGE + ".common.entity";
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//生成的ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = CODE_BASE_PACKAGE + ".web";//生成的Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = CODE_BASE_PACKAGE + ".core.MyMapper";//Mapper插件基础接口的完全限定名
}
