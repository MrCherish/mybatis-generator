package com.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;

/**
 * @author dexu.tian
 * @date 2022-06-28
 */
public class MybatisPlusGenerator {

    public static void main(String[] args) {

        //1. 创建代码生成器对象，执行生成代码操作
        AutoGenerator autoGenerator = new AutoGenerator();

        //2. 数据源相关配置：读取数据库中的信息，根据数据库表结构生成代码
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.12.4.138:3306/xplatform_sd?useUnicode=yes&characterEncoding=UTF-8");
        dataSource.setUsername("devops");
        dataSource.setPassword("SparkX2021,.//.");
        autoGenerator.setDataSource(dataSource);

        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController("/mybatis-generator/template/controller.java.vm");
        templateConfig.setService("/mybatis-generator/template/service.java.vm");
        templateConfig.setServiceImpl("/mybatis-generator/template/serviceImpl.java.vm");
        templateConfig.setEntity("/mybatis-generator/template/entity.java.vm");
        templateConfig.setMapper("/mybatis-generator/template/mapper.java.vm");
        templateConfig.setXml("/mybatis-generator/template/mapper.xml.vm");
        autoGenerator.setTemplate(templateConfig);

        //设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");    //设置代码生成位置
        globalConfig.setOpen(false);    //设置生成完毕后是否打开生成代码所在的目录
        globalConfig.setAuthor("dexu.tian");    //设置作者
        globalConfig.setFileOverride(true);     //设置是否覆盖原始生成的文件
        globalConfig.setMapperName("%sMapper");    //设置数据层接口名，%s为占位符，指代模块名称
        globalConfig.setIdType(IdType.AUTO);   //设置Id生成策略
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        autoGenerator.setGlobalConfig(globalConfig);

        //设置包名相关配置
        PackageConfig packageInfo = new PackageConfig();
        packageInfo.setParent("com.sparkxmedia.xplatform.sd.api");   //设置生成的包名，与代码所在位置不冲突，二者叠加组成完整路径
        packageInfo.setEntity("model.entity");    //设置实体类包名
        packageInfo.setMapper("mapper");   //设置数据层包名
        autoGenerator.setPackageInfo(packageInfo);

        //策略设置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("sd_campaign");  //设置当前参与生成的表名，参数为可变参数，不设置的话就是全部表
        strategyConfig.setTablePrefix("sd_");  //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名  例如： User = tbl_user - tbl_
        strategyConfig.setNaming(NamingStrategy.underline_to_camel); // 数据库表字段映射到实体的命名策略
        strategyConfig.setRestControllerStyle(true);    //设置是否启用Rest风格
        strategyConfig.setVersionFieldName("version");  //设置乐观锁字段名
        strategyConfig.setLogicDeleteFieldName("deleted");  //设置逻辑删除字段名
        strategyConfig.setEntityLombokModel(true);  //设置是否启用lombok
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        strategyConfig.setTableFillList(Arrays.asList(createTime,updateTime));
        autoGenerator.setStrategy(strategyConfig);

        //3. 执行生成操作
        autoGenerator.execute();

    }

}
