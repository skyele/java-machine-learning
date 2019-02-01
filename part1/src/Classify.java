import weka.core.Instance;
import weka.core.converters.ConverterUtils;

public class Classify {
    static public void main(String[] args) throws Exception {
        ConverterUtils.DataSource source = new ConverterUtils.DataSource(args[0]);
        Instance data = (Instance) source.getDataSet();
        System.out.println(data.toString());
    }
}
