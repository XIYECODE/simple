package xiye.mybatis.generator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * MBG即MyBatisGenerator
 * @author Lenovo
 * 方法一：利用Java代码生成代码，即本例直接run就行
 * 方法二：利用eclipse插件mybatis-generator-eclipse-site-1.3.3.201606241937.zip生成代码，generatorConfig.xml文件右键点击Generate MyBatis/iBATIS Artifacts就能执行
 * 
 * 方法二生成代码注释中的@mbggenerated可以实现代码自动合并覆盖，自定义的方法或属性注释中不添加@mbggenerate就不会被覆盖
 */
public class Generator {

	public static void main(String[] args) throws Exception {
		//MBG执行过程的警告信息
		List<String> warnings = new ArrayList<>();
		//当生成代码冲突时，覆盖原代码
		boolean overwrite = true;
		//读取MBG配置文件
		InputStream is = Generator.class.getResourceAsStream("/generator/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(is);
		is.close();
		
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		//创建MBG
		MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
		//执行生成代码
		generator.generate(null);
		
		for(String warning : warnings) {
			System.out.println(warning);
		}
	}

}
