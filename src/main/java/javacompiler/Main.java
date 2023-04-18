package javacompiler;

import java.lang.reflect.Method;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
//from jav a2s  . c  om
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class Main {

    public static void main(String[] args) throws Exception{
        File sourceFile = new File("src/main/java/javacompiler/Hello.java");
        FileWriter writer = new FileWriter(sourceFile);
        writer.write("package javacompiler;\n\n" + "public class Hello { \n" + " public void test() { \n"
                + "   System.out.println(\"I love code\") ;\n" + " }\n" + "}");
        writer.close();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(
                null, null, null);

        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, List.of(new File("target/classes/javacompiler/")));
        // Compile the file
        boolean success = compiler.getTask(null, fileManager, null, null, null,
                        fileManager.getJavaFileObjectsFromFiles(List.of(sourceFile)))
                .call();
        fileManager.close();
        //runIt();
    }

    @SuppressWarnings("unchecked")
    public static void runIt() {
        try {
            Class params[] = {};
            Object paramsObj[] = {};
            Class thisClass = Class.forName("javacompiler.Hello");
            Object iClass = thisClass.newInstance();
            Method thisMethod = thisClass.getDeclaredMethod("test", params);
            thisMethod.invoke(iClass, paramsObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}