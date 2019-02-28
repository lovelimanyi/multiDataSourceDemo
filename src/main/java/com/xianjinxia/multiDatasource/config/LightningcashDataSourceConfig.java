package com.xianjinxia.multiDatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.xianjinxia.multiDatasource.lightningcash.dao", sqlSessionFactoryRef = "lightningcashSqlSessionFactory")
public class LightningcashDataSourceConfig {
    @Bean("lightningcashDataSource")
//    @Primary
    @ConfigurationProperties(prefix = "spring.lightningcashDataSource.druid")
    public DataSource lightningcashDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "lightningcashTransactionManager")
//    @Primary
    public DataSourceTransactionManager lightningcashTransactionManager() {
        return new DataSourceTransactionManager(lightningcashDataSource());
    }

    @Bean(name = "lightningcashSqlSessionFactory")
//    @Primary
    public SqlSessionFactory lightningcashSqlSessionFactory(@Qualifier("lightningcashDataSource") DataSource lightningcashDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(lightningcashDataSource);
//        sessionFactory.setTypeAliasesPackage(ConfigConstant.ALIASES_PACKAGE);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ConfigConstant.MASTER_MAPPER_LOCATIONS));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("mapping/lightningcashMapping/*.xml"));
        return sessionFactory.getObject();
    }

}
