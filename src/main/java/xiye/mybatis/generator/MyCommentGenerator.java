package xiye.mybatis.generator;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * 生成代码注释格式设置
 * @author Lenovo
 *
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
	
	private boolean suppressAllComments;
	private boolean addRemarkComments;
	
	public void addConfigurationProperties(Properties properties) {
		super.addConfigurationProperties(properties);
		suppressAllComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));

        addRemarkComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
	}
	
	public void addFieldComment(Field field,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

        field.addJavaDocLine("/**");

        String remarks = introspectedColumn.getRemarks();
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));	
            for (String remarkLine : remarkLines) {
                field.addJavaDocLine(" *   " + remarkLine);														//生成字段备注信息
            }
        }
        
        field.addJavaDocLine(" *   " + introspectedColumn.getActualColumnName());			//生成数据表字段名
        addJavadocTag(field, false);																						//生成* @mbggenerated
        field.addJavaDocLine(" */");
    }
	
	public void addGetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");
        
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        sb.append(" * @return the value of ");
        sb.append(introspectedColumn.getActualColumnName());
        method.addJavaDocLine(sb.toString());

        addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }
	
    public void addSetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");

        StringBuilder sb = new StringBuilder();
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" the value for ");
        sb.append(introspectedColumn.getActualColumnName());
        method.addJavaDocLine(sb.toString());

        addJavadocTag(method, false);

        method.addJavaDocLine(" */");
    }
}
