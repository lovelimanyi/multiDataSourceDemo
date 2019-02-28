package com.xianjinxia.multiDatasource.config;


import com.xianjinxia.multiDatasource.utils.PropertiesLoader;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2017/8/24 0024下午 03:11
 */

public class ConfigConstant {
    private static PropertiesLoader propertiesLoader = new PropertiesLoader("configConstant.properties");
//    public static final String MASTER_DAO_PACKAGE = "com.xianjinxia.multiDatasource.back.dao";
//    public static final String SLAVE_DAO_PACKAGE = "com.cuishou.synchronization.dao";
    public static final String MASTER_MAPPER_LOCATIONS = propertiesLoader.getProperty("master.mapper.locations");
//    public static final String SLAVE_MAPPER_LOCATIONS = propertiesLoader.getProperty("slave.mapper.locations");
//    public static final String ALIASES_PACKAGE= propertiesLoader.getProperty("type.aliases.package");


}
