package com.xianjinxia.multiDatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages ="com.xianjinxia.multiDatasource.back.dao", sqlSessionFactoryRef = "merchantSqlSessionFactory")
public class MerchantDataSourceConfig {
    @Bean("merchantDataSource")
//    @Primary
    @ConfigurationProperties(prefix = "spring.merchantDataSource.druid")
    public DataSource merchantDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "merchantTransactionManager")
//    @Primary
    public DataSourceTransactionManager merchantTransactionManager() {
        return new DataSourceTransactionManager(merchantDataSource());
    }

    @Bean(name = "merchantSqlSessionFactory")
//    @Primary
    public SqlSessionFactory merchantSqlSessionFactory(@Qualifier("merchantDataSource") DataSource merchantDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(merchantDataSource);
//        sessionFactory.setTypeAliasesPackage(ConfigConstant.ALIASES_PACKAGE);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ConfigConstant.MASTER_MAPPER_LOCATIONS));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("mapping/merchantMapping/*.xml"));
        return sessionFactory.getObject();
    }

}
