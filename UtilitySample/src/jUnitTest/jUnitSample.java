package jUnitTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


/**
 * サンプルプログラム
 * jUnit用
 * @author sigeyosi
 */
public class jUnitSample {

    /**
     * Confプロパティの読み込み
     */
    private Properties configuration = new Properties();

    /**
     * 乗算処理
     * @param a
     * @param b
     * @return a*b[int]
     */
    public int doExcec(int a,int b)
    {
        return a*b;
    }


    /**
     * ファイル名取得
     * @return ファイル名[String]
     */
    public String getPropertiesFileName()
    {
        String fileName = "";
        String filePath = "";

        try {
          InputStream inputStream = new FileInputStream(new File("conf.properties"));
          configuration.load(inputStream);
          filePath = configuration.getProperty("filePath");
          fileName = configuration.getProperty("fileName");

          //System.out.println(filePath);
          //System.out.println(fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileName;
    }

}
